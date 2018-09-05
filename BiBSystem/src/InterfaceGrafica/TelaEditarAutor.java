/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGrafica;

import TipoDados.Autor;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import TipoDados.TxtComUndoRedo;

/**
 *
 * @author Fernando TeTz
 */
public class TelaEditarAutor extends ModeloAdicionar {

    ArrayList<Autor> autores = new ArrayList<>();
    Autor autor, autorAux;

    public TelaEditarAutor() {
        try {
            lerArquivo();
        } catch (Exception e) {
        }
        initComponents();
        setLocationRelativeTo(null);
        setModal(true);
        tNome.setText(TelaManutençãoAutor.getAutor().getNome());
        jID.setText(Integer.toString(TelaManutençãoAutor.getAutor().getIdAutor()));
    }

//    public TelaEditarEditora(Autor autorx) {
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        tNome = new TxtComUndoRedo();
        jLabel1 = new javax.swing.JLabel();
        jID = new javax.swing.JLabel();

        setTitle("Editar Autor");

        labelNome.setText("* Nome:");

        tNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tNomeFocusGained(evt);
            }
        });

        jLabel1.setText("ID:");

        jID.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(labelNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jID))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jID))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tNomeFocusGained
        labelNome.setForeground(Color.black);
    }//GEN-LAST:event_tNomeFocusGained

    private void lerArquivo() throws Exception {
        ObjectInputStream arquivo = null;
        Autor autorx = null;
        autores.clear();
        try {
            arquivo = new ObjectInputStream(new FileInputStream("ArqAutores.dad"));
            do {
                autorx = (Autor) arquivo.readObject();
                autores.add(autorx);
            } while (autorx != null);
        } catch (EOFException e) {
            arquivo.close();
        }
    }

    @Override
    public void bSalvarActionListener(ActionEvent evt) {
        try {
            int result = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja salvar a edição?",
                    "EDITAR AUTOR", JOptionPane.QUESTION_MESSAGE);
            if (result == 0) { //REPOSTA SIM
                if(tNome.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!",
                            "CAMPOS OBRIGATÓRIOS!",JOptionPane.ERROR_MESSAGE);
                    labelNome.setForeground(Color.red);
                    return;
                }
                for (int i = 0; i < autores.size(); i++) {
                    if (autores.get(i).getNome().equals(tNome.getText())) { //Se ja existir razao social
                        JOptionPane.showMessageDialog(null, "Já existe um autor com"
                                + "o nome '" + autores.get(i).getNome() + "'. Digite outra.",
                                "AUTOR JÁ CADASTRADO!", JOptionPane.ERROR_MESSAGE);
                        return;
                    } else if (autores.get(i).getIdAutor() == TelaManutençãoAutor.getAutor().getIdAutor()) { //Salva razao editada
                        autores.get(i).setNome(tNome.getText());
                        break;
                    }
                }
                gravaArquivo();
                tNome.setText("");
                jID.setText("");
                JOptionPane.showMessageDialog(null, "Autor modificado com sucesso.", "EDIÇÃO DE AUTOR",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao gravar em ArqAutores.biblio\n" + ex.getMessage(),
                    "Tela de erro", JOptionPane.ERROR_MESSAGE);
        }
        this.dispose();
    }

    @Override
    public void bLimparActionListener(ActionEvent evt) {
        int result = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja limpar tudo?");
        if (result == 0) { //Resposta SIM
            tNome.setText("");
        }
    }

    @Override
    public void bCancelarActionListener(ActionEvent evt) {
        int result;
            result = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair da operação?",
                    "CANCELAR", JOptionPane.YES_NO_OPTION);
            if (result == 0) {
                this.dispose();
            }
    }

    private void gravaArquivo() throws Exception {
        try {
            ObjectOutputStream arquivo = new ObjectOutputStream(new FileOutputStream("ArqAutores.dad"));
            for (Autor editora1 : autores) {
                arquivo.writeObject(editora1);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar arquivo.", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelNome;
    private javax.swing.JTextField tNome;
    // End of variables declaration//GEN-END:variables

}
