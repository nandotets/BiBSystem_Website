/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGrafica;

import TipoDados.Editora;
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
public class TelaEditarEditora extends ModeloAdicionar {

    ArrayList<Editora> editoras = new ArrayList<>();
    Editora editora, editoraAux;

    public TelaEditarEditora() throws Exception {
        try {
            lerArquivo();
        } catch (Exception e) {
        }
        initComponents();
        setLocationRelativeTo(null);
        setModal(true);
        tRazaoSocial.setText(TelaManutençãoEditora.editora.getRazaoSocial());
        jID.setText(Integer.toString(TelaManutençãoEditora.editora.getIdEditora()));
    }

//    public TelaEditarEditora(Editora editorax) {
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelRazao = new javax.swing.JLabel();
        tRazaoSocial = new TxtComUndoRedo();
        jLabel1 = new javax.swing.JLabel();
        jID = new javax.swing.JLabel();

        setTitle("Editar Editora");

        labelRazao.setText("* Razão Social:");

        tRazaoSocial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tRazaoSocialFocusGained(evt);
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
                    .addComponent(labelRazao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jID))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRazao)
                    .addComponent(tRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jID))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tRazaoSocialFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tRazaoSocialFocusGained
        labelRazao.setForeground(Color.black);
    }//GEN-LAST:event_tRazaoSocialFocusGained

    private void lerArquivo() throws Exception {
        ObjectInputStream arquivo = null;
        Editora editorax = null;
        editoras.clear();
        try {
            arquivo = new ObjectInputStream(new FileInputStream("ArqEditoras.dad"));
            do {
                editorax = (Editora) arquivo.readObject();
                editoras.add(editorax);
            } while (editorax != null);
        } catch (EOFException e) {
            arquivo.close();
        }
    }

    @Override
    public void bSalvarActionListener(ActionEvent evt) {
        try {
            int result = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja salvar a edição?",
                    "EDITAR EDITORA", JOptionPane.QUESTION_MESSAGE);
            if (result == 0) { //REPOSTA SIM
                if(tRazaoSocial.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!",
                            "CAMPOS OBRIGATÓRIOS!",JOptionPane.ERROR_MESSAGE);
                    labelRazao.setForeground(Color.red);
                    return;
                }
                for (int i = 0; i < editoras.size(); i++) {
                    if (editoras.get(i).getRazaoSocial().equals(tRazaoSocial.getText())) { //Se ja existir razao social
                        JOptionPane.showMessageDialog(null, "Já existe uma editora com"
                                + "a Razão Social '" + editoras.get(i).getRazaoSocial() + "'. Digite outra.",
                                "EDITORA JÁ CADASTRADA!", JOptionPane.ERROR_MESSAGE);
                        return;
                    } else if (editoras.get(i).getIdEditora() == TelaManutençãoEditora.editora.getIdEditora()) { //Salva razao editada
                        editoras.get(i).setRazaoSocial(tRazaoSocial.getText());
                        break;
                    }
                }
                gravaArquivo();
                tRazaoSocial.setText("");
                jID.setText("");
                JOptionPane.showMessageDialog(null, "Editora modificada com sucesso.", "EDIÇÃO DE EDITORA",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao gravar em ArqEditoras.biblio\n" + ex.getMessage(),
                    "Tela de erro", JOptionPane.ERROR_MESSAGE);
        }
        this.dispose();
    }

    @Override
    public void bLimparActionListener(ActionEvent evt) {
        int result = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja limpar tudo?");
        if (result == 0) { //Resposta SIM
            tRazaoSocial.setText("");
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
            ObjectOutputStream arquivo = new ObjectOutputStream(new FileOutputStream("ArqEditoras.dad"));
            for (Editora editora1 : editoras) {
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
    private javax.swing.JLabel labelRazao;
    private javax.swing.JTextField tRazaoSocial;
    // End of variables declaration//GEN-END:variables

}
