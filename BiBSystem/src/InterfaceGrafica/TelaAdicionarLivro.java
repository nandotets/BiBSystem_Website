/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGrafica;

import TipoDados.Autor;
import TipoDados.Editora;
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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import TipoDados.TxtComUndoRedo;

/**
 *
 * @author Fernando TeTz
 */
public class TelaAdicionarLivro extends ModeloAdicionar {

    ArrayList<Livro> livros = new ArrayList<>();
    ArrayList<Editora> editoras = new ArrayList<>();
    ArrayList<Autor> autores = new ArrayList<>();
    ArrayList<Revista> revistas = new ArrayList<>();
    Livro livro = null;

    public TelaAdicionarLivro() {
        try {
            lerArquivoAutores();
        } catch (Exception ex) {
        }
        try {
            lerArquivoRevistas();
        } catch (Exception ex) {
        }
        try {
            lerArquivoEditoras();
        } catch (Exception ex) {
        }
        try {
            lerArquivo();
        } catch (Exception e) {
        }
        initComponents();
        setLocationRelativeTo(null);
        setModal(true);
        montaCombo();
        montaTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelIsbn = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        tTitulo = new TxtComUndoRedo();
        labelEditora = new javax.swing.JLabel();
        labelAutoria = new javax.swing.JLabel();
        tIsbn = new TxtComUndoRedo();
        cbEditoras = new javax.swing.JComboBox<>();
        labelQtd = new javax.swing.JLabel();
        nQtde = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        tLocalEdicao = new TxtComUndoRedo();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAutores = new javax.swing.JTable();

        setTitle("Adicionar Livro");

        labelIsbn.setText("* ISBN:");

        labelTitulo.setText("* Título:");

        tTitulo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tTituloFocusGained(evt);
            }
        });

        labelEditora.setText("* Editora:");

        labelAutoria.setText("* Autoria:");

        tIsbn.setMaximumSize(new java.awt.Dimension(30, 2147483647));
        tIsbn.setMinimumSize(new java.awt.Dimension(20, 20));
        tIsbn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tIsbnFocusGained(evt);
            }
        });

        cbEditoras.setMaximumRowCount(10000);
        cbEditoras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbEditoras.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbEditorasFocusGained(evt);
            }
        });

        labelQtd.setText("* Nº de exemplares:");

        nQtde.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel5.setText("Local de edição:");
        jLabel5.setAlignmentX(0.5F);

        tabelaAutores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabelaAutores);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelIsbn)
                                    .addComponent(labelTitulo)
                                    .addComponent(labelEditora))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tIsbn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tTitulo)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(cbEditoras, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelAutoria)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelQtd, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(nQtde, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20))))
                            .addComponent(tLocalEdicao, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(27, 27, 27))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIsbn)
                    .addComponent(tIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitulo)
                    .addComponent(tTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEditora)
                    .addComponent(cbEditoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelQtd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nQtde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(labelAutoria))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tLocalEdicao)
                .addGap(50, 50, 50))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbEditorasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbEditorasFocusGained
        labelEditora.setForeground(Color.black);
    }//GEN-LAST:event_cbEditorasFocusGained

    private void tIsbnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tIsbnFocusGained
        labelIsbn.setForeground(Color.black);
    }//GEN-LAST:event_tIsbnFocusGained

    private void tTituloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tTituloFocusGained
        labelTitulo.setForeground(Color.black);
    }//GEN-LAST:event_tTituloFocusGained

    private void montaCombo() {
        cbEditoras.removeAllItems();
        cbEditoras.addItem("Selecione uma editora.");
        for (Editora editorax : editoras) {
            cbEditoras.addItem(editorax.getRazaoSocial());
        }
        if (cbEditoras.getComponentCount() == 1) {
            cbEditoras.removeAll();
            cbEditoras.addItem("Não existe editoras cadastradas.");
        }
        cbEditoras.setSelectedIndex(0);
    }

    private void montaTabela() {
        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                if (columnIndex == 0) {
                    return Boolean.class;
                } else {
                    return String.class;
                }
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                Object o = getValueAt(row, column);
                return column == 0;
            }

        };
        try {
            lerArquivoAutores();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ler arquivo.", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        for (int k = 0; k < modelo.getRowCount();) { //Limpa tabela
            modelo.removeRow(k);
        }
        modelo.addColumn("");
        modelo.addColumn("Autor(a)");
        for (int x = 0; x < autores.size(); x++) {
            modelo.addRow(new Object[0]);
            modelo.setValueAt(false, x, 0);
            modelo.setValueAt(autores.get(x).getNome(), x, 1);
        }
        tabelaAutores.setModel(modelo);
        tabelaAutores.getColumnModel().getColumn(0).setMaxWidth(18);
        tabelaAutores.getColumnModel().getColumn(0).setMinWidth(18);
        tabelaAutores.getColumnModel().getColumn(0).setResizable(false);
        tabelaAutores.getColumnModel().getColumn(1).setResizable(true);
    }

    private void lerArquivo() throws Exception {
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

    private void lerArquivoEditoras() throws Exception {
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

    private void lerArquivoRevistas() throws Exception {
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

    private void lerArquivoAutores() throws Exception {
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
        DefaultTableModel modelo = (DefaultTableModel) tabelaAutores.getModel();
        int cont = 0;
        Boolean checked;
        if (tLocalEdicao.getText().isEmpty()) {
            tLocalEdicao.setText("----");
        }
        try {
            int result = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja adicionar o novo livro?");
            if (result == 0) { //Resposta SIM
                for (int i = 0; i < modelo.getRowCount(); i++) {
                    checked = Boolean.valueOf(modelo.getValueAt(i, 0).toString());
                    if (checked) {
                        cont++;
                        break;
                    }
                }
                if (tIsbn.getText().isEmpty() || tTitulo.getText().isEmpty() || cbEditoras.getSelectedIndex() == 0
                        || cont == 0 || (Integer) nQtde.getValue() == 0) {
                    if ((Integer) nQtde.getValue() == 0) {
                        labelQtd.setForeground(Color.red);
                        JOptionPane.showMessageDialog(null, "O número de exemplares deve ser maior que zero (0)!",
                                "NUMERO DE EXEMPLARES NAO PERMITIDO!", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!",
                            "CAMPOS OBRIGATÓRIOS!", JOptionPane.INFORMATION_MESSAGE);
                    if (tIsbn.getText().isEmpty()) {
                        labelIsbn.setForeground(Color.red);
                    }
                    if (tTitulo.getText().isEmpty()) {
                        labelTitulo.setForeground(Color.red);
                    }
                    if (cbEditoras.getSelectedIndex() == 0) {
                        labelEditora.setForeground(Color.red);
                    }
                    if (cont == 0) {
                        labelAutoria.setForeground(Color.red);
                    }
                    return;
                }
                for (Livro edit : livros) {
                    if (edit.getISBN().equals(tIsbn.getText())) {
                        JOptionPane.showMessageDialog(null, "Já existe um livro com"
                                + "o ISBN '" + edit.getISBN() + "'. Digite outra.",
                                "ISBN JÁ CADASTRADO!", JOptionPane.INFORMATION_MESSAGE);
                        return;
                    } else if (edit.getTitulo().equals(tTitulo.getText())) {
                        JOptionPane.showMessageDialog(null, "Já existe um livro com"
                                + "o título '" + edit.getTitulo() + "'. Digite outro.",
                                "TÍTULO JÁ CADASTRADO!", JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }
                } //NÃO EXISTE LIVRO ou REVISTA IGUAL
                int tamLiv = livros.size(), tamRev = revistas.size();
                Editora editoraAux = null;
                ArrayList<Autor> autoriaAux = new ArrayList<>();
                for (int i = 0; i < tabelaAutores.getRowCount(); i++) { //Percorre cada linha da tabela
                    checked = Boolean.valueOf(tabelaAutores.getValueAt(i, 0).toString());
                    if (checked) {
                        for (Autor autore : autores) { //Percorre todos os autores cadastrados
                            if (autore.getNome().equals(tabelaAutores.getValueAt(i, 1).toString())) {
                                autoriaAux.add(autore);
                            }
                        }
                    }
                }
                for (int i = 0; i < editoras.size(); i++) { //Pega editora selecionada
                    if (editoras.get(i).getRazaoSocial().equals(cbEditoras.getSelectedItem().toString())) {
                        editoraAux = editoras.get(i);
                        break;
                    }
                }
                Livro newLivro = null;
                String aux = null;
                int lastIDlivro = 0, lastIDrevista = 0;
                if (tamLiv == 0 && tamRev == 0) {
                    newLivro = new Livro(0, tTitulo.getText(), (Integer) nQtde.getValue(),
                            tIsbn.getText(), tLocalEdicao.getText(), editoraAux, autoriaAux, new ArrayList<>());
                } else if (tamLiv != 0 && tamRev != 0) {
                    if (tLocalEdicao.getText().isEmpty()) {
                        aux = "----";
                    } else {
                        aux = tLocalEdicao.getText();
                    }
                    lastIDlivro = livros.get(tamLiv - 1).getIDAcervo();
                    lastIDrevista = revistas.get(tamRev - 1).getIDAcervo();
                    if (lastIDlivro > lastIDrevista) {
                        newLivro = new Livro(lastIDlivro + 1, tTitulo.getText(),
                                (Integer) nQtde.getValue(), tIsbn.getText(), aux, editoraAux, autoriaAux, new ArrayList<>());
                    } else {
                        newLivro = new Livro(lastIDrevista + 1, tTitulo.getText(),
                                (Integer) nQtde.getValue(), tIsbn.getText(), aux, editoraAux, autoriaAux, new ArrayList<>());
                    }
                } else if (tamLiv != 0 && tamRev == 0) {
                    lastIDlivro = livros.get(tamLiv - 1).getIDAcervo();
                    newLivro = new Livro(lastIDlivro + 1, tTitulo.getText(),
                            (Integer) nQtde.getValue(), tIsbn.getText(), aux, editoraAux, autoriaAux, new ArrayList<>());
                } else if (tamLiv == 0 && tamRev != 0) {
                    lastIDrevista = revistas.get(tamRev - 1).getIDAcervo();
                    newLivro = new Livro(lastIDrevista + 1, tTitulo.getText(),
                            (Integer) nQtde.getValue(), tIsbn.getText(), aux, editoraAux, autoriaAux, new ArrayList<>());
                }
                livros.add(newLivro);
                gravaArquivo();
                LimpaCampos();
                JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso.", "CADASTRO DE LIVRO",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao gravar em ArqLivros.biblio\n" + ex.getMessage(),
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
            ObjectOutputStream arquivo = new ObjectOutputStream(new FileOutputStream("ArqLivros.dad"));
            for (Livro livrox : livros) {
                arquivo.writeObject(livrox);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar arquivo.", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void LimpaCampos() {
        DefaultTableModel modelo = (DefaultTableModel) tabelaAutores.getModel();
        tIsbn.setText("");
        tTitulo.setText("");
        tLocalEdicao.setText("");
        nQtde.setValue(0);
        cbEditoras.setSelectedIndex(0);
        for (int i = 0; i < modelo.getRowCount(); i++) {
            Boolean checked = Boolean.valueOf(modelo.getValueAt(i, 0).toString());
            if (checked) {
                modelo.setValueAt(false, i, 0);
            }
            tabelaAutores.setModel(modelo);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbEditoras;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAutoria;
    private javax.swing.JLabel labelEditora;
    private javax.swing.JLabel labelIsbn;
    private javax.swing.JLabel labelQtd;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JSpinner nQtde;
    private javax.swing.JTextField tIsbn;
    private javax.swing.JTextField tLocalEdicao;
    private javax.swing.JTextField tTitulo;
    private javax.swing.JTable tabelaAutores;
    // End of variables declaration//GEN-END:variables

}
