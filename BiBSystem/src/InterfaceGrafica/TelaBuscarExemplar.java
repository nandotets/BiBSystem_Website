/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGrafica;

import TipoDados.CustomRenderer;
import TipoDados.Emprestimo;
import TipoDados.Livro;
import TipoDados.Revista;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fernando TeTz
 */
public class TelaBuscarExemplar extends ModeloPesquisa {

    ArrayList<Livro> livros = new ArrayList<>();
    public static Livro livro;
    String[] pesquisaLivros = {"Título", "ISBN", "Autor", "Editora"};

    ArrayList<Revista> revistas = new ArrayList<>();
    public static Revista revista;
    String[] pesquisaRevistas = {"Título", "Data de edição", "ID"},
            meses = {"Mês", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

    ArrayList<Emprestimo> emprestimos = new ArrayList<>();

    int qntdEmprestados = 0;

    public TelaBuscarExemplar() {
        initComponents();
        setLocationRelativeTo(null);
        setModal(true);
        montaComboPesquisaLivros();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        painelAbas = new javax.swing.JTabbedPane();
        painelLivros = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaLivros = new javax.swing.JTable();
        painelRevistas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaRevistas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Busca de exemplar");

        jPanel1.setLayout(new java.awt.BorderLayout());

        painelAbas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                painelAbasStateChanged(evt);
            }
        });

        tabelaLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ISBN", "Título", "Editora", "Local de edição", "Quantidade", "Emprestados", "Autores"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaLivros.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tabelaLivros.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaLivros.getTableHeader().setReorderingAllowed(false);
        tabelaLivros.getColumnModel().getColumn(0).setPreferredWidth(100);
        tabelaLivros.getColumnModel().getColumn(1).setPreferredWidth(200);
        jScrollPane1.setViewportView(tabelaLivros);
        if (tabelaLivros.getColumnModel().getColumnCount() > 0) {
            tabelaLivros.getColumnModel().getColumn(0).setResizable(false);
            tabelaLivros.getColumnModel().getColumn(0).setPreferredWidth(30);
            tabelaLivros.getColumnModel().getColumn(1).setMinWidth(100);
            tabelaLivros.getColumnModel().getColumn(2).setPreferredWidth(150);
            tabelaLivros.getColumnModel().getColumn(4).setMinWidth(85);
            tabelaLivros.getColumnModel().getColumn(5).setResizable(false);
            tabelaLivros.getColumnModel().getColumn(5).setPreferredWidth(85);
            tabelaLivros.getColumnModel().getColumn(6).setPreferredWidth(95);
            tabelaLivros.getColumnModel().getColumn(7).setPreferredWidth(125);
        }

        javax.swing.GroupLayout painelLivrosLayout = new javax.swing.GroupLayout(painelLivros);
        painelLivros.setLayout(painelLivrosLayout);
        painelLivrosLayout.setHorizontalGroup(
            painelLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLivrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelLivrosLayout.setVerticalGroup(
            painelLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLivrosLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelAbas.addTab("Livros", painelLivros);

        tabelaRevistas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Título", "Quantidade", "Emprestados", "Data de edição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaRevistas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tabelaRevistas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaRevistas.getTableHeader().setReorderingAllowed(false);
        tabelaRevistas.getColumnModel().getColumn(0).setPreferredWidth(100);
        tabelaRevistas.getColumnModel().getColumn(1).setPreferredWidth(200);
        jScrollPane2.setViewportView(tabelaRevistas);
        if (tabelaRevistas.getColumnModel().getColumnCount() > 0) {
            tabelaRevistas.getColumnModel().getColumn(0).setResizable(false);
            tabelaRevistas.getColumnModel().getColumn(0).setPreferredWidth(30);
            tabelaRevistas.getColumnModel().getColumn(1).setPreferredWidth(350);
            tabelaRevistas.getColumnModel().getColumn(2).setResizable(false);
            tabelaRevistas.getColumnModel().getColumn(2).setPreferredWidth(75);
            tabelaRevistas.getColumnModel().getColumn(3).setPreferredWidth(85);
            tabelaRevistas.getColumnModel().getColumn(4).setPreferredWidth(150);
        }

        javax.swing.GroupLayout painelRevistasLayout = new javax.swing.GroupLayout(painelRevistas);
        painelRevistas.setLayout(painelRevistasLayout);
        painelRevistasLayout.setHorizontalGroup(
            painelRevistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRevistasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE))
        );
        painelRevistasLayout.setVerticalGroup(
            painelRevistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRevistasLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelAbas.addTab("Revistas", painelRevistas);

        jPanel1.add(painelAbas, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void painelAbasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_painelAbasStateChanged
        if (painelAbas.getSelectedIndex() == 0) { //ABA DOS LIVROS
            tabelaLivros.getColumnModel().getColumn(7).setCellRenderer(new CustomRenderer());
            tabelaLivros.setRowHeight(70);
            tPesquisa.setSize(6, 35);
            montaComboPesquisaLivros();
            try {
                lerArquivoLivros();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao abrir arquivo de livros\n"
                        + e.getMessage(), "Tela de erro", JOptionPane.ERROR_MESSAGE);
            }
            montaTabelaLivros();
        } else { //ABA DAS REVISTAS
            montaComboPesquisaRevistas();
            try {
                lerArquivoRevistas();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao abrir arquivo de revistas\n"
                        + e.getMessage(), "Tela de erro", JOptionPane.ERROR_MESSAGE);
            }
            montaTabelaRevistas();
        }
    }//GEN-LAST:event_painelAbasStateChanged

    private void montaComboPesquisaRevistas() {
        cbPesquisa.removeAllItems();
        for (String pesquisa1 : pesquisaRevistas) {
            cbPesquisa.addItem(pesquisa1);
        }
        cbPesquisa.setSelectedIndex(0);
    }

    private void montaComboPesquisaLivros() {
        cbPesquisa.removeAllItems();
        for (String pesquisa1 : pesquisaLivros) {
            cbPesquisa.addItem(pesquisa1);
        }
        cbPesquisa.setSelectedIndex(0);
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

    private void lerArquivoEmprestimos() throws Exception {
        ObjectInputStream arquivo = null;
        Emprestimo emprestimox = null;
        emprestimos.clear();
        try {
            arquivo = new ObjectInputStream(new FileInputStream("ArqEmprestimos.dad"));
            do {
                emprestimox = (Emprestimo) arquivo.readObject();
                emprestimos.add(emprestimox);
            } while (emprestimox != null);
        } catch (EOFException e) {
            arquivo.close();
        }
    }

    private void montaComboDia() {
        cbDiaPesquisa.removeAllItems();
        cbDiaPesquisa.addItem("Dia");
        for (int dia = 1; dia < 32; dia++) {
            cbDiaPesquisa.addItem(Integer.toString(dia));
        }
        cbDiaPesquisa.setSelectedIndex(0);

    }

    private void montaComboMes() {
        cbMesPesquisa.removeAllItems();
        for (int mes = 0; mes < 13; mes++) {
            cbMesPesquisa.addItem(meses[mes]);
        }
        cbDiaPesquisa.setSelectedIndex(0);
    }

    private void montaComboAno() {
        cbAnoPesquisa.removeAllItems();
        cbAnoPesquisa.addItem("Ano");
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        for (int i = 0; i < 35; i++) {
            cbAnoPesquisa.addItem(Integer.toString(anoAtual - i));
        }
        cbAnoPesquisa.setSelectedIndex(0);
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

    public void LimpaCamposLivros() {
        DefaultTableModel modelo = (DefaultTableModel) tabelaLivros.getModel();
        for (int k = 0; k < modelo.getRowCount();) { //Limpa tabela
            modelo.removeRow(k);
        }
        tabelaLivros.setModel(modelo);
        tPesquisa.setText("");
    }

    public void LimpaCamposRevistas() {
        DefaultTableModel modelo = (DefaultTableModel) tabelaRevistas.getModel();
        for (int k = 0; k < modelo.getRowCount();) { //Limpa tabela
            modelo.removeRow(k);
        }
        tabelaRevistas.setModel(modelo);
        tPesquisa.setText("");
        cbDiaPesquisa.setSelectedIndex(0);
        cbMesPesquisa.setSelectedIndex(0);
        cbAnoPesquisa.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane painelAbas;
    private javax.swing.JPanel painelLivros;
    private javax.swing.JPanel painelRevistas;
    public javax.swing.JTable tabelaLivros;
    public javax.swing.JTable tabelaRevistas;
    // End of variables declaration//GEN-END:variables

    @Override
    public void bSelecionarActionListener(ActionEvent evt) {
        int linhaSelected = -1, idSelected = -1;
        if (painelAbas.getSelectedIndex() == 0) { //ABA LIVROS
            try {
                lerArquivoEmprestimos();
                lerArquivoLivros();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Não existe exemplares de livros cadastrados.", "Não encontrado", JOptionPane.ERROR_MESSAGE);
                return;
            }
            linhaSelected = tabelaLivros.getSelectedRow();
            if (linhaSelected == -1) { //NENHUMA LINHA SELECIONADA
                JOptionPane.showMessageDialog(null, "Selecione um exemplar!", "NENHUM EXEMPLAR SELECIONADO", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                idSelected = Integer.parseInt(tabelaLivros.getValueAt(linhaSelected, 0).toString());
            }
            for (int i = 0; i < livros.size(); i++) {
                if (livros.get(i).getIDAcervo() == idSelected) {
                    TelaEfetuarEmprestimo.livro = livros.get(i);
                    TelaEfetuarEmprestimo.identif = 1;
                    break;
                }
            }
        } else { //ABA REVISTAS
            try {
                lerArquivoRevistas();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Não existe exemplares de revistas cadastradas.",
                        "Não encontrado", JOptionPane.ERROR_MESSAGE);
                return;
            }
            linhaSelected = tabelaRevistas.getSelectedRow();
            if (linhaSelected == -1) { //NENHUMA LINHA SELECIONADA
                JOptionPane.showMessageDialog(null, "Selecione um exemplar!", "NENHUM EXEMPLAR SELECIONADO",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                idSelected = Integer.parseInt(tabelaRevistas.getValueAt(linhaSelected, 0).toString());
                for (int i = 0; i < revistas.size(); i++) {
                    if (revistas.get(i).getIDAcervo() == idSelected) {
                        TelaEfetuarEmprestimo.revista = revistas.get(i);
                        TelaEfetuarEmprestimo.identif = 2;
                        break;
                    }
                }
            }
        }

        this.dispose();
    }

    @Override
    public void bMostrarTodosActionListener(ActionEvent evt) {
        if (painelAbas.getSelectedIndex() == 0) { //ABA LIVROS
            montaTabelaLivros();
        } else { //ABA REVISTAS
            montaTabelaRevistas();
        }
    }

    public void montaTabelaLivros() {
        DefaultTableModel modelo = (DefaultTableModel) tabelaLivros.getModel();
        try {
            lerArquivoEmprestimos();
            lerArquivoLivros();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não existe exemplares de livros cadastrados.", "Não encontrado", JOptionPane.ERROR_MESSAGE);
            return;
        }
        for (int k = 0; k < modelo.getRowCount();) { //Limpa tabela
            modelo.removeRow(k);
        }
        Object autorx = null;
        for (int x = 0; x < livros.size(); x++) { //Percorre todos os livros
            qntdEmprestados = 0;
            autorx = livros.get(x).getAutoria().get(0).toString();
            for (int i = 1; i < livros.get(x).getAutoria().size(); i++) { //Percorre toda a autoria de um livro
                autorx = autorx + livros.get(x).getAutoria().get(i).toString();
            }
            for (int i = 0; i < emprestimos.size(); i++) {
                if (emprestimos.get(i).getExemplar().getIDAcervo() == livros.get(x).getIDAcervo()) {
                    qntdEmprestados++;
                }
            }
            Object[] linhax = {livros.get(x).getIDAcervo(), livros.get(x).getISBN(),
                livros.get(x).getTitulo(), livros.get(x).getEditora().getRazaoSocial(),
                livros.get(x).getLocalEdicao(), livros.get(x).getQtdeExemplar(),
                qntdEmprestados, autorx};
            modelo.addRow(linhax);
        }
    }

    public void montaTabelaRevistas() {
        DefaultTableModel modelo = (DefaultTableModel) tabelaRevistas.getModel();
        try {
            lerArquivoEmprestimos();
            lerArquivoRevistas();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não existe exemplares de revistas cadastradas.", "Não encontrado", JOptionPane.ERROR_MESSAGE);
            return;
        }
        for (int k = 0; k < modelo.getRowCount();) { //Limpa tabela
            modelo.removeRow(k);
        }
        for (int x = 0; x < revistas.size(); x++) { //Percorre todos os revistas
            qntdEmprestados = 0;
            for (int i = 0; i < emprestimos.size(); i++) {
                if (emprestimos.get(i).getExemplar().getIDAcervo() == revistas.get(x).getIDAcervo()) {
                    qntdEmprestados++;
                }
            }
            Object[] linhax = {revistas.get(x).getIDAcervo(), revistas.get(x).getTitulo(),
                revistas.get(x).getQtdeExemplar(), qntdEmprestados,
                revistas.get(x).getDataEdicao().toString()};
            modelo.addRow(linhax);
        }
    }

    @Override
    public void bLimparTudoActionListener(ActionEvent evt) {
        int result = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja limpar tudo?");
        if (result == 0) { //Resposta SIM
            if (painelAbas.getSelectedIndex() == 0) { //ABA LIVROS
                LimpaCamposLivros();
            } else { //ABA REVISTAS
                LimpaCamposRevistas();
            }
        }
    }

    @Override
    public void txPesquisa() {
        if (painelAbas.getSelectedIndex() == 0) { //ABA LIVROS
            Object autorx = null;
            try {
                lerArquivoLivros();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao abrir arquivo", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
            int tipoPesquisa = cbPesquisa.getSelectedIndex();
            DefaultTableModel modelo = (DefaultTableModel) tabelaLivros.getModel();
            for (int k = 0; k < modelo.getRowCount();) { //Limpa tabela
                modelo.removeRow(k);
            }
            switch (tipoPesquisa) {
                case 0: //Pesquisa por titulo
                    for (int k = 0; k < modelo.getRowCount();) { //Limpa tabela
                        modelo.removeRow(k);
                    }
                    if (!(tPesquisa.getText().isEmpty())) {
                        for (int x = 0; x < livros.size(); x++) {
                            if (livros.get(x).getTitulo().contains(tPesquisa.getText())) {
                                autorx = livros.get(x).getAutoria().get(0).toString();
                                for (int i = 1; i < livros.get(x).getAutoria().size(); i++) { //Percorre toda a autoria de um livro
                                    autorx = autorx + livros.get(x).getAutoria().get(i).toString();
                                }
                                Object[] linhax = {livros.get(x).getIDAcervo(), livros.get(x).getISBN(),
                                    livros.get(x).getTitulo(), livros.get(x).getEditora().getRazaoSocial(), livros.get(x).getLocalEdicao(), livros.get(x).getQtdeExemplar(),
                                    autorx};
                                modelo.addRow(linhax);
                            }
                        }
                    }
                    break;
                case 1: //Pesquisa por ISBN
                    for (int k = 0; k < modelo.getRowCount();) { //Limpa tabela
                        modelo.removeRow(k);
                    }
                    if (!(tPesquisa.getText().isEmpty())) {
                        for (int x = 0; x < livros.size(); x++) {
                            if (livros.get(x).getISBN().contains(tPesquisa.getText())) {
                                autorx = livros.get(x).getAutoria().get(0).toString();
                                for (int i = 1; i < livros.get(x).getAutoria().size(); i++) { //Percorre toda a autoria de um livro
                                    autorx = autorx + livros.get(x).getAutoria().get(i).toString();
                                }
                                Object[] linhax = {livros.get(x).getIDAcervo(), livros.get(x).getISBN(),
                                    livros.get(x).getTitulo(), livros.get(x).getEditora().getRazaoSocial(), livros.get(x).getLocalEdicao(), livros.get(x).getQtdeExemplar(),
                                    autorx};
                                modelo.addRow(linhax);
                            }
                        }
                    }
                    break;
                case 2: //Pesquisa por Autor
                    for (int k = 0; k < modelo.getRowCount();) { //Limpa tabela
                        modelo.removeRow(k);
                    }
                    if (!(tPesquisa.getText().isEmpty())) {
                        for (int x = 0; x < livros.size(); x++) {
                            for (int y = 0; y < livros.get(x).getAutoria().size(); y++) {
                                if (((livros.get(x)).getAutoria().get(y)).getNome().contains(tPesquisa.getText())) {
                                    autorx = livros.get(x).getAutoria().get(0).toString();
                                    for (int i = 1; i < livros.get(x).getAutoria().size(); i++) { //Percorre toda a autoria de um livro
                                        autorx = autorx + livros.get(x).getAutoria().get(i).toString();
                                    }
                                    Object[] linhax = {livros.get(x).getIDAcervo(), livros.get(x).getISBN(),
                                        livros.get(x).getTitulo(), livros.get(x).getEditora().getRazaoSocial(), livros.get(x).getLocalEdicao(), livros.get(x).getQtdeExemplar(),
                                        autorx};
                                    modelo.addRow(linhax);
                                }
                            }

                        }
                    }
                    break;
                case 3: //Pesquisa por Editora
                    for (int k = 0; k < modelo.getRowCount();) { //Limpa tabela
                        modelo.removeRow(k);
                    }
                    if (!(tPesquisa.getText().isEmpty())) {
                        for (int x = 0; x < livros.size(); x++) {
                            if (livros.get(x).getEditora().getRazaoSocial().contains(tPesquisa.getText())) {
                                autorx = livros.get(x).getAutoria().get(0).toString();
                                for (int i = 1; i < livros.get(x).getAutoria().size(); i++) { //Percorre toda a autoria de um livro
                                    autorx = autorx + livros.get(x).getAutoria().get(i).toString();
                                }
                                Object[] linhax = {livros.get(x).getIDAcervo(), livros.get(x).getISBN(),
                                    livros.get(x).getTitulo(), livros.get(x).getEditora().getRazaoSocial(), livros.get(x).getLocalEdicao(), livros.get(x).getQtdeExemplar(),
                                    autorx};
                                modelo.addRow(linhax);
                            }
                        }
                    }
                    break;
            }
        } else { //ABA REVISTAS
            try {
                lerArquivoRevistas();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao abrir arquivo", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
            int tipoPesquisa = cbPesquisa.getSelectedIndex();
            DefaultTableModel modelo = (DefaultTableModel) tabelaRevistas.getModel();
            for (int k = 0; k < modelo.getRowCount();) { //Limpa tabela
                modelo.removeRow(k);
            }
            switch (tipoPesquisa) {
                case 0: //Pesquisa por titulo
                    for (int k = 0; k < modelo.getRowCount();) { //Limpa tabela
                        modelo.removeRow(k);
                    }
                    if (!(tPesquisa.getText().isEmpty())) {
                        for (int x = 0; x < revistas.size(); x++) {
                            if (revistas.get(x).getTitulo().contains(tPesquisa.getText())) {
                                Object[] linhax = {revistas.get(x).getIDAcervo(), revistas.get(x).getTitulo(),
                                    revistas.get(x).getQtdeExemplar(), revistas.get(x).getDataEdicao().toString()};
                                modelo.addRow(linhax);
                            }
                        }
                    }
                    break;
                case 1: //Pesquisa por data de edição
                    for (int k = 0; k < modelo.getRowCount();) { //Limpa tabela
                        modelo.removeRow(k);
                    }
                    short ano = 0;
                    byte dia = (byte) cbDiaPesquisa.getSelectedIndex();
                    byte mes = (byte) cbMesPesquisa.getSelectedIndex();
                    if (cbAnoPesquisa.getSelectedIndex() != 0 && cbAnoPesquisa.getSelectedIndex() != -1) {
                        ano = (short) Integer.parseInt(cbAnoPesquisa.getSelectedItem().toString());
                    }
                    for (int x = 0; x < revistas.size(); x++) {
                        if (revistas.get(x).getDataEdicao().getDia() == dia && mes == 0
                                && cbAnoPesquisa.getSelectedIndex() == 0) { //BUSCA DO DIA
                            for (int k = 0; k < modelo.getRowCount();) { //Limpa tabela
                                modelo.removeRow(k);
                            }
                            Object[] linhax = {revistas.get(x).getIDAcervo(), revistas.get(x).getTitulo(),
                                revistas.get(x).getQtdeExemplar(), revistas.get(x).getDataEdicao().toString()};
                            modelo.addRow(linhax);
                        }
                        if (revistas.get(x).getDataEdicao().getDia() == dia && revistas.get(x).getDataEdicao().getMes() == mes
                                && cbAnoPesquisa.getSelectedIndex() == 0) { //BUSCA DO DIA/MES
                            for (int k = 0; k < modelo.getRowCount();) { //Limpa tabela
                                modelo.removeRow(k);
                            }
                            Object[] linhax = {revistas.get(x).getIDAcervo(), revistas.get(x).getTitulo(),
                                revistas.get(x).getQtdeExemplar(), revistas.get(x).getDataEdicao().toString()};
                            modelo.addRow(linhax);
                        }
                        if (revistas.get(x).getDataEdicao().getDia() == dia
                                && revistas.get(x).getDataEdicao().getMes() == mes
                                && revistas.get(x).getDataEdicao().getAno() == ano) { //BUSCA DO DIA/MES/ANO
                            for (int k = 0; k < modelo.getRowCount();) { //Limpa tabela
                                modelo.removeRow(k);
                            }
                            Object[] linhax = {revistas.get(x).getIDAcervo(), revistas.get(x).getTitulo(),
                                revistas.get(x).getQtdeExemplar(), revistas.get(x).getDataEdicao().toString()};
                            modelo.addRow(linhax);
                        }
                        if (revistas.get(x).getDataEdicao().getDia() == dia
                                && revistas.get(x).getDataEdicao().getAno() == ano
                                && cbAnoPesquisa.getSelectedIndex() == 0) { //BUSCA DO DIA/ANO
                            for (int k = 0; k < modelo.getRowCount();) { //Limpa tabela
                                modelo.removeRow(k);
                            }
                            Object[] linhax = {revistas.get(x).getIDAcervo(), revistas.get(x).getTitulo(),
                                revistas.get(x).getQtdeExemplar(), revistas.get(x).getDataEdicao().toString()};
                            modelo.addRow(linhax);
                        }
                        if (revistas.get(x).getDataEdicao().getMes() == mes
                                && revistas.get(x).getDataEdicao().getAno() == ano
                                && dia == 0) { //BUSCA DO MES/ANO
                            for (int k = 0; k < modelo.getRowCount();) { //Limpa tabela
                                modelo.removeRow(k);
                            }
                            Object[] linhax = {revistas.get(x).getIDAcervo(), revistas.get(x).getTitulo(),
                                revistas.get(x).getQtdeExemplar(), revistas.get(x).getDataEdicao().toString()};
                            modelo.addRow(linhax);
                        }
                        if (revistas.get(x).getDataEdicao().getMes() == mes
                                && dia == 0 && cbAnoPesquisa.getSelectedIndex() == 0) { //BUSCA DO MES
                            for (int k = 0; k < modelo.getRowCount();) { //Limpa tabela
                                modelo.removeRow(k);
                            }
                            Object[] linhax = {revistas.get(x).getIDAcervo(), revistas.get(x).getTitulo(),
                                revistas.get(x).getQtdeExemplar(), revistas.get(x).getDataEdicao().toString()};
                            modelo.addRow(linhax);
                        }
                        if (revistas.get(x).getDataEdicao().getAno() == ano
                                && dia == 0 && mes == 0) { //BUSCA DO ANO
                            for (int k = 0; k < modelo.getRowCount();) { //Limpa tabela
                                modelo.removeRow(k);
                            }
                            Object[] linhax = {revistas.get(x).getIDAcervo(), revistas.get(x).getTitulo(),
                                revistas.get(x).getQtdeExemplar(), revistas.get(x).getDataEdicao().toString()};
                            modelo.addRow(linhax);
                        }
                    }
                    break;
                case 2: //Pesquisa por ID
                    for (int k = 0; k < modelo.getRowCount();) { //Limpa tabela
                        modelo.removeRow(k);
                    }
                    if (!(tPesquisa.getText().isEmpty())) {
                        for (int x = 0; x < revistas.size(); x++) {
                            if (revistas.get(x).getIDAcervo() == Integer.parseInt(tPesquisa.getText())) {
                                Object[] linhax = {revistas.get(x).getIDAcervo(), revistas.get(x).getTitulo(),
                                    revistas.get(x).getQtdeExemplar(), revistas.get(x).getDataEdicao().toString()};
                                modelo.addRow(linhax);
                                break;
                            }
                        }
                    }
                    break;
            }
        }
    }

    @Override
    public void mudouCB() {
        if (painelAbas.getSelectedIndex() == 1) { //ABA REVISTAS
            if (cbPesquisa.getSelectedIndex() == 1) { //Pesquisa por data de edicao
                tPesquisa.setEnabled(false);
                cbDiaPesquisa.setEnabled(true);
                montaComboDia();
                cbDiaPesquisa.setSelectedIndex(0);
                cbMesPesquisa.setEnabled(true);
                montaComboMes();
                cbMesPesquisa.setSelectedIndex(0);
                cbAnoPesquisa.setEnabled(true);
                montaComboAno();
                cbAnoPesquisa.setSelectedIndex(0);
            } else {
                tPesquisa.setEnabled(true);
                cbDiaPesquisa.setEnabled(false);
                cbMesPesquisa.setEnabled(false);
                cbAnoPesquisa.setEnabled(false);
            }
        }
    }

}
