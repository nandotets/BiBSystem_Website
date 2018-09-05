/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TipoDados;

import java.awt.Component;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Fernando TeTz
 */
public class CustomRenderer implements TableCellRenderer {

    JScrollPane scrollPane;
    JTextArea textArea;

    public CustomRenderer() {
        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
        textArea.setText((String) value);
        return scrollPane;
    }

}
