/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGrafica;

import TipoDados.DataX;
import TipoDados.Livro;
import TipoDados.Revista;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import TipoDados.TxtComUndoRedo;

/**
 *
 * @author Fernando TeTz
 */
public class TelaAdicionarRevista extends ModeloAdicionar {

    ArrayList<Livro> livros = new ArrayList<>();
    ArrayList<Revista> revistas = new ArrayList<>();
    Revista revista = null;
    String[] meses = {"Mês", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
        "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

    public TelaAdicionarRevista() {
        try {
            lerArquivoLivros();
        } catch (Exception ex) {
        }
        try {
            lerArquivo();
        } catch (Exception e) {
        }
        initComponents();
        setLocationRelativeTo(null);
        setModal(true);
        montaComboDia();
        montaComboMes();
        montaComboAno();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        tTitulo = new TxtComUndoRedo();
        labelData = new javax.swing.JLabel();
        cbDia = new javax.swing.JComboBox<>();
        labelQtd = new javax.swing.JLabel();
        nQtde = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        cbMes = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cbAno = new javax.swing.JComboBox<>();

        setTitle("Adicionar Revista");

        labelTitulo.setText("* Título:");

        tTitulo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tTituloFocusGained(evt);
            }
        });

        labelData.setText("* Data de edição:");

        cbDia.setMaximumRowCount(10000);
        cbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbDia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbDiaFocusGained(evt);
            }
        });

        labelQtd.setText("* Nº de exemplares:");

        nQtde.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        nQtde.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nQtdeFocusGained(evt);
            }
        });

        jLabel6.setText("/");

        cbMes.setMaximumRowCount(10000);
        cbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbMes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbMesFocusGained(evt);
            }
        });

        jLabel8.setText("/");

        cbAno.setMaximumRowCount(10000);
        cbAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbAno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbAnoFocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelQtd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nQtde, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTitulo)
                    .addComponent(tTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelData)
                    .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cbAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQtd)
                    .addComponent(nQtde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbDiaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbDiaFocusGained
        labelData.setForeground(Color.black);
    }//GEN-LAST:event_cbDiaFocusGained

    private void tTituloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tTituloFocusGained
        labelTitulo.setForeground(Color.black);
    }//GEN-LAST:event_tTituloFocusGained

    private void cbMesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbMesFocusGained
        labelData.setForeground(Color.black);
    }//GEN-LAST:event_cbMesFocusGained

    private void cbAnoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbAnoFocusGained
        labelData.setForeground(Color.black);
    }//GEN-LAST:event_cbAnoFocusGained

    private void nQtdeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nQtdeFocusGained
        labelQtd.setForeground(Color.black);
    }//GEN-LAST:event_nQtdeFocusGained

    private void montaComboDia() {
        cbDia.removeAllItems();
        cbDia.addItem("Dia");
        for (int dia = 1; dia < 32; dia++) {
            cbDia.addItem(Integer.toString(dia));
        }
        cbDia.setSelectedIndex(0);
    }

    private void montaComboMes() {
        cbMes.removeAllItems();
        for (int mes = 0; mes < 13; mes++) {
            cbMes.addItem(meses[mes]);
        }
        cbDia.setSelectedIndex(0);
    }

    private void montaComboAno() {
        cbAno.removeAllItems();
        cbAno.addItem("Ano");
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        for (int i = 0; i < 30; i++) {
            cbAno.addItem(Integer.toString(anoAtual - i));
        }
        cbAno.setSelectedIndex(0);
    }

    private void lerArquivo() throws Exception {
        ObjectInputStream arquivo = null;
        Revista revistax = null;
        revistas.clear();
        try {
            arquivo = new ObjectInputStream(new FileInputStream("ArqRevistas.dad"));
            do {
                revistax = (Revista) arquivo.readObject();
                revistas.add(revistax);
            } while (revistax != null);
        } catch (EOFException e) {
            arquivo.close();
        }
    }

    private void lerArquivoLivros() throws Exception {
        ObjectInputStream arquivo = null;
        Livro livrox = null;
        livros.clear();
        try {
            arquivo = new ObjectInputStream(new FileInputStream("ArqLivros.dad"));
            do {
                livrox = (Livro) arquivo.readObject();
                livros.add(livrox);
            } while (livrox != null);
        } catch (EOFException e) {
            arquivo.close();
        }
    }

    @Override
    public void bSalvarActionListener(ActionEvent evt) {
        if (cbDia.getSelectedIndex() == 0 || cbMes.getSelectedIndex() == 0 || cbAno.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Selecione uma data de edição correta!", "DATA DE EDIÇÃO INVÁLIDA",
                    JOptionPane.ERROR_MESSAGE);
            labelData.setForeground(Color.red);
            return;
        }
        int dia = cbDia.getSelectedIndex(), mes = cbMes.getSelectedIndex(), ano = cbAno.getSelectedIndex();
        DataX dataEdicao = new DataX((byte) dia, (byte) mes, (short) Integer.parseInt(cbAno.getItemAt(ano)));
        try {
            int result = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja adicionar a nova revista?");
            if (result == 0) { //Resposta SIM
                if (tTitulo.getText().isEmpty() || cbDia.getSelectedIndex() == 0
                        || cbMes.getSelectedIndex() == 0 || cbAno.getSelectedIndex() == 0 || (Integer) nQtde.getValue() == 0) {
                    if ((Integer) nQtde.getValue() == 0) {
                        labelQtd.setForeground(Color.red);
                        JOptionPane.showMessageDialog(null, "O número de exemplares deve ser maior que zero (0)!",
                                "NUMERO DE EXEMPLARES NAO PERMITIDO!", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    if (dataEdicao.getDia() == 0 && dataEdicao.getMes() == 0 && dataEdicao.getAno() == 0) {
                        JOptionPane.showMessageDialog(null, "A data " + dia + "/" + mes + "/" + cbAno.getComponent(ano).toString()
                                + " é inválida. Verifique se a data de edição está correta e tente novamente.");
                        labelData.setForeground(Color.red);
                        return;
                    }
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!",
                            "CAMPOS OBRIGATÓRIOS!", JOptionPane.ERROR_MESSAGE);
                    if (tTitulo.getText().isEmpty()) {
                        labelTitulo.setForeground(Color.red);
                    }
                    return;
                }
                for (Livro livrox : livros) {
                    if (livrox.getTitulo().equals(tTitulo.getText())) {
                        JOptionPane.showMessageDialog(null, "Já existe um livro com"
                                + "o título '" + livrox.getTitulo() + "'. Digite outro.",
                                "TÍTULO JÁ CADASTRADO!", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                for (Revista revistax : revistas) {
                    if (revistax.getTitulo().equals(tTitulo.getText())) {
                        JOptionPane.showMessageDialog(null, "Já existe uma revista com"
                                + "o título '" + revistax.getTitulo() + "'. Digite outro.",
                                "TÍTULO JÁ CADASTRADO!", JOptionPane.INFORMATION_MESSAGE);
                    }
                } //NÃO EXISTE LIVRO ou REVISTA IGUAL
                int tamLiv = livros.size(), tamRev = revistas.size(), lastIDlivro = 0, lastIDrevista = 0;
                Revista newRevista = null;
                if (tamLiv == 0 && tamRev == 0) {
                    newRevista = new Revista(0, tTitulo.getText(), (Integer) nQtde.getValue(),
                            dataEdicao, new ArrayList<>());
                } else if (tamLiv != 0 && tamRev != 0) {
                    lastIDlivro = livros.get(tamLiv - 1).getIDAcervo();
                    lastIDrevista = revistas.get(tamRev - 1).getIDAcervo();
                    if (lastIDlivro > lastIDrevista) {
                        newRevista = new Revista(lastIDlivro + 1, tTitulo.getText(), (Integer) nQtde.getValue(), dataEdicao, new ArrayList<>());
                    } else {
                        newRevista = new Revista(lastIDrevista + 1, tTitulo.getText(), (Integer) nQtde.getValue(), dataEdicao, new ArrayList<>());
                    }
                } else if (tamLiv != 0 && tamRev == 0) {
                    lastIDlivro = livros.get(tamLiv - 1).getIDAcervo();
                    newRevista = new Revista(lastIDlivro + 1, tTitulo.getText(), (Integer) nQtde.getValue(), dataEdicao, new ArrayList<>());
                } else if (tamLiv == 0 && tamRev != 0) {
                    lastIDrevista = revistas.get(tamRev - 1).getIDAcervo();
                    newRevista = new Revista(lastIDrevista + 1, tTitulo.getText(), (Integer) nQtde.getValue(), dataEdicao, new ArrayList<>());
                }
                revistas.add(newRevista);
                gravaArquivo();
                JOptionPane.showMessageDialog(null, "Revista cadastrada com sucesso.", "CADASTRO DE REVISTA",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao gravar em ArqRevistas.biblio\n" + ex.getMessage(),
                    "Tela de erro", JOptionPane.ERROR_MESSAGE);
        }
        this.dispose();
    }

    @Override
    public void bLimparActionListener(ActionEvent evt) {
        int result = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja limpar tudo?");
        if (result == 0) { //Resposta SIM
            LimpaCampos();
        }
    }

    @Override
    public void bCancelarActionListener(ActionEvent evt) {
        int result;
        try {
            result = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair da operação?",
                    "CANCELAR", JOptionPane.YES_NO_OPTION);
            if (result == 0) {
                this.dispose();
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Tela de erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void gravaArquivo() throws Exception {
        try {
            ObjectOutputStream arquivo = new ObjectOutputStream(new FileOutputStream("ArqRevistas.dad"));
            for (Revista revistax : revistas) {
                arquivo.writeObject(revistax);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar arquivo.", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void LimpaCampos() {
        tTitulo.setText("");
        nQtde.setValue(0);
        cbDia.setSelectedIndex(0);
        cbMes.setSelectedIndex(0);
        cbAno.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> cbAno;
    public javax.swing.JComboBox<String> cbDia;
    public javax.swing.JComboBox<String> cbMes;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelQtd;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JSpinner nQtde;
    private javax.swing.JTextField tTitulo;
    // End of variables declaration//GEN-END:variables

}
