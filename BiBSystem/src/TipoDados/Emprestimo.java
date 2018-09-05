/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TipoDados;

import java.io.Serializable;

/**
 *
 * @author Fernando TeTz
 */
public class Emprestimo implements Serializable{

    private int idEmprestimo;
    private DataX dataEmprestimo;
    private DataX dataDevolucao;
    private Associado associado;
    private Acervo exemplar;

    /**
     * @return the idEmprestimo
     */
    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    /**
     * @param idEmprestimo the idEmprestimo to set
     */
    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    /**
     * @return the dataEmprestimo
     */
    public DataX getDataEmprestimo() {
        return dataEmprestimo;
    }

    /**
     * @param dataEmprestimo the dataEmprestimo to set
     */
    public void setDataEmprestimo(DataX dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    /**
     * @return the dataDevolucao
     */
    public DataX getDataDevolucao() {
        return dataDevolucao;
    }

    /**
     * @param dataDevolucao the dataDevolucao to set
     */
    public void setDataDevolucao(DataX dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    /**
     * @return the associado
     */
    public Associado getAssociado() {
        return associado;
    }

    /**
     * @param associado the associado to set
     */
    public void setAssociado(Associado associado) {
        this.associado = associado;
    }

    /**
     * @return the exemplar
     */
    public Acervo getExemplar() {
        return exemplar;
    }

    /**
     * @param exemplar the exemplar to set
     */
    public void setExemplar(Acervo exemplar) {
        this.exemplar = exemplar;
    }
}
