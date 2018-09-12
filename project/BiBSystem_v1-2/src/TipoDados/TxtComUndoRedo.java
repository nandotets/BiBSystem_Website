/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TipoDados;

import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.InputMap;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;



public class TxtComUndoRedo extends JTextField {

    private final UndoAction undoAction = new UndoAction();
    private final RedoAction redoAction = new RedoAction();
    private final UndoManager undo = new UndoManager();

    public TxtComUndoRedo() {
        this.getDocument().addUndoableEditListener(new MyUndoableEditListener());
        configurarMapa(this);
    }

    private void configurarMapa(JTextField txtField) {
        InputMap inputMap = txtField.getInputMap();
        // Ctrl-z desfaz
        KeyStroke key = KeyStroke.getKeyStroke(KeyEvent.VK_Z, Event.CTRL_MASK);
        inputMap.put(key, undoAction);
        // Ctrl-y refaz
        key = KeyStroke.getKeyStroke(KeyEvent.VK_Y, Event.CTRL_MASK);
        inputMap.put(key, redoAction);
    }

    private class MyUndoableEditListener implements UndoableEditListener {

        @Override
        public void undoableEditHappened(UndoableEditEvent e) {
            //Remember the edit and update the menus
            undo.addEdit(e.getEdit());
            undoAction.updateUndoState();
            redoAction.updateRedoState();
        }
    }

    private class UndoAction extends AbstractAction {

        private UndoAction() {
            setEnabled(false);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                undo.undo();
            } catch (CannotUndoException ex) {
            }
            updateUndoState();
            redoAction.updateRedoState();
        }

        /* Controla Status do btnUndo */
        private void updateUndoState() {
            if (undo.canUndo()) {
                setEnabled(true);
            } else {
            }
        }
    }

    private class RedoAction extends AbstractAction {

        private RedoAction() {
            setEnabled(false);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                undo.redo();
            } catch (CannotRedoException ex) {
            }
            updateRedoState();
            undoAction.updateUndoState();
        }

        /*Controla Status do btnRedo*/
        private void updateRedoState() {
            if (undo.canRedo()) {
                setEnabled(true);
                //   putValue(Action.NAME, undo.getRedoPresentationName());
            } else {
                setEnabled(false);
                // putValue(Action.NAME, "Redo");
            }
        }
    }
}
