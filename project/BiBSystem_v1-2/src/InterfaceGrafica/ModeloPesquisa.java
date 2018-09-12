/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGrafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import TipoDados.TxtComUndoRedo;

/**
 *
 * @author Fernando TeTz
 */
public abstract class ModeloPesquisa extends javax.swing.JDialog implements ActionListener {

        public ModeloPesquisa() {
        try {
            initComponents();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    e.getMessage(), "Tela de erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Creates new form ModeloAdicionar
     * @param evt
     */
    @Override
    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == bSelecionar) {
            this.bSelecionarActionPerformed(evt);
        } else if (evt.getSource() == bCancelar) {
            this.bCancelarActionPerformed(evt);
        } else if (evt.getSource() == bMostrarTodos) {
            this.bMostrarTodosActionPerformed(evt);
        } else if (evt.getSource() == bLimparTudo) {
            this.bLimparTudoActionPerformed(evt);
        }
    }

    public abstract void bSelecionarActionListener(ActionEvent evt);

    public abstract void bCancelarActionListener(ActionEvent evt);
    
    public abstract void bMostrarTodosActionListener(ActionEvent evt);

    public abstract void bLimparTudoActionListener(ActionEvent evt);
    
    public abstract void txPesquisa();
    
    public abstract void mudouCB();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelN1 = new javax.swing.JPanel();
        cbPesquisa = new javax.swing.JComboBox<>();
        tPesquisa = new TxtComUndoRedo();
        labelPesquisar1 = new javax.swing.JLabel();
        bMostrarTodos = new javax.swing.JButton();
        bLimparTudo = new javax.swing.JButton();
        cbDiaPesquisa = new javax.swing.JComboBox<>();
        cbMesPesquisa = new javax.swing.JComboBox<>();
        cbAnoPesquisa = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        painelS1 = new javax.swing.JPanel();
        bSelecionar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();

        setIconImage(null);

        cbPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbPesquisa.setMaximumSize(new java.awt.Dimension(56, 20));
        cbPesquisa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbPesquisaItemStateChanged(evt);
            }
        });

        tPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tPesquisaKeyReleased(evt);
            }
        });

        labelPesquisar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPesquisar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/lupa.png"))); // NOI18N
        labelPesquisar1.setText("PESQUISAR:");

        bMostrarTodos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bMostrarTodos.setForeground(new java.awt.Color(51, 102, 255));
        bMostrarTodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/tudo.png"))); // NOI18N
        bMostrarTodos.setText("Mostrar todos");
        bMostrarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrarTodosActionPerformed(evt);
            }
        });

        bLimparTudo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bLimparTudo.setForeground(new java.awt.Color(51, 102, 255));
        bLimparTudo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Clear-icon.png"))); // NOI18N
        bLimparTudo.setText("Limpar");
        bLimparTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimparTudoActionPerformed(evt);
            }
        });

        cbDiaPesquisa.setMaximumRowCount(10000);
        cbDiaPesquisa.setEnabled(false);
        cbDiaPesquisa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbDiaPesquisaItemStateChanged(evt);
            }
        });

        cbMesPesquisa.setMaximumRowCount(10000);
        cbMesPesquisa.setEnabled(false);
        cbMesPesquisa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMesPesquisaItemStateChanged(evt);
            }
        });

        cbAnoPesquisa.setMaximumRowCount(10000);
        cbAnoPesquisa.setEnabled(false);
        cbAnoPesquisa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbAnoPesquisaItemStateChanged(evt);
            }
        });

        jLabel8.setText("/");

        jLabel6.setText("/");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/data.png"))); // NOI18N

        javax.swing.GroupLayout painelN1Layout = new javax.swing.GroupLayout(painelN1);
        painelN1.setLayout(painelN1Layout);
        painelN1Layout.setHorizontalGroup(
            painelN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelN1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPesquisar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tPesquisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelN1Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(bMostrarTodos, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bLimparTudo, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addGap(144, 144, 144))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelN1Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbDiaPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbMesPesquisa, 0, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbAnoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215))
        );
        painelN1Layout.setVerticalGroup(
            painelN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelN1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPesquisar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cbAnoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMesPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDiaPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addGap(14, 14, 14)
                .addGroup(painelN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bMostrarTodos)
                    .addComponent(bLimparTudo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(painelN1, java.awt.BorderLayout.NORTH);

        bSelecionar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bSelecionar.setForeground(new java.awt.Color(51, 102, 255));
        bSelecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/selecionado.png"))); // NOI18N
        bSelecionar.setText("Selecionar");
        bSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSelecionarActionPerformed(evt);
            }
        });

        bCancelar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bCancelar.setForeground(new java.awt.Color(51, 102, 255));
        bCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sair.png"))); // NOI18N
        bCancelar.setText("Cancelar");
        bCancelar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelS1Layout = new javax.swing.GroupLayout(painelS1);
        painelS1.setLayout(painelS1Layout);
        painelS1Layout.setHorizontalGroup(
            painelS1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelS1Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(bSelecionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(139, 139, 139)
                .addComponent(bCancelar)
                .addContainerGap())
        );
        painelS1Layout.setVerticalGroup(
            painelS1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelS1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelS1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSelecionar)
                    .addComponent(bCancelar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(painelS1, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbPesquisaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbPesquisaItemStateChanged
        mudouCB();
    }//GEN-LAST:event_cbPesquisaItemStateChanged

    private void tPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tPesquisaKeyReleased
        txPesquisa();
    }//GEN-LAST:event_tPesquisaKeyReleased

    private void bMostrarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrarTodosActionPerformed
        bMostrarTodosActionListener(evt);
    }//GEN-LAST:event_bMostrarTodosActionPerformed

    private void bLimparTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimparTudoActionPerformed
        bLimparTudoActionListener(evt);
    }//GEN-LAST:event_bLimparTudoActionPerformed

    private void cbDiaPesquisaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbDiaPesquisaItemStateChanged
        txPesquisa();
    }//GEN-LAST:event_cbDiaPesquisaItemStateChanged

    private void cbMesPesquisaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMesPesquisaItemStateChanged
        txPesquisa();
    }//GEN-LAST:event_cbMesPesquisaItemStateChanged

    private void cbAnoPesquisaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbAnoPesquisaItemStateChanged
        txPesquisa();
    }//GEN-LAST:event_cbAnoPesquisaItemStateChanged

    private void bSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSelecionarActionPerformed
        bSelecionarActionListener(evt);
    }//GEN-LAST:event_bSelecionarActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        bCancelarActionListener(evt);
    }//GEN-LAST:event_bCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton bCancelar;
    protected javax.swing.JButton bLimparTudo;
    protected javax.swing.JButton bMostrarTodos;
    protected javax.swing.JButton bSelecionar;
    public javax.swing.JComboBox<String> cbAnoPesquisa;
    public javax.swing.JComboBox<String> cbDiaPesquisa;
    public javax.swing.JComboBox<String> cbMesPesquisa;
    protected javax.swing.JComboBox<String> cbPesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JLabel labelPesquisar1;
    private javax.swing.JPanel painelN1;
    private javax.swing.JPanel painelS1;
    protected javax.swing.JTextField tPesquisa;
    // End of variables declaration//GEN-END:variables
}
