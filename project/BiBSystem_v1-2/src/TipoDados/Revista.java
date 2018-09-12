/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TipoDados;

import java.util.ArrayList;

/**
 *
 * @author Fernando TeTz
 */
public class Revista extends Acervo {

    private DataX dataEdicao;
    private ArrayList<Associado> listaDeEspera;

    public Revista(int IDAcervo, String titulo, int qtdeExemplar, DataX dataEdicao, ArrayList<Associado> listaDeEspera) {
        super(IDAcervo, titulo, qtdeExemplar);
        this.dataEdicao = dataEdicao;
        this.listaDeEspera = listaDeEspera;
    }

    /**
     * @return the dataEdicao
     */
    public DataX getDataEdicao() {
        return dataEdicao;
    }

    /**
     * @param dataEdicao the dataEdicao to set
     */
    public void setDataEdicao(DataX dataEdicao) {
        this.dataEdicao = dataEdicao;
    }

    /**
     * @return the listaDeEspera
     */
    public ArrayList<Associado> getListaDeEspera() {
        return listaDeEspera;
    }

    /**
     * @param listaDeEspera the listaDeEspera to set
     */
    public void setListaDeEspera(ArrayList<Associado> listaDeEspera) {
        this.listaDeEspera = listaDeEspera;
    }
}
