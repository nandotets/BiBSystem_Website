/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TipoDados;

/**
 *
 * @author Fernando TeTz
 */
public class ItemEmprestimo {

    private DataX dataDevolucao;

    public ItemEmprestimo(DataX dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
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
}
