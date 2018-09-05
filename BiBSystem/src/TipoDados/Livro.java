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
public class Livro extends Acervo {

    private String ISBN, localEdicao;
    private Editora editora;
    private ArrayList<Autor> autoria;
    private ArrayList<Associado> listaDeEspera;

    public Livro(int IDAcervo, String titulo, int qtdeExemplar, String ISBN, String localEdicao,
            Editora editora, ArrayList<Autor> autor, ArrayList<Associado> listaDeEspera) {
        super(IDAcervo, titulo, qtdeExemplar);
        this.ISBN = ISBN;
        this.editora = editora;
        this.localEdicao = localEdicao;
        this.autoria = autor;
        this.listaDeEspera = listaDeEspera;
    }

    /**
     * @return the ISBN
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * @param ISBN the ISBN to set
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * @return the localEdicao
     */
    public String getLocalEdicao() {
        return localEdicao;
    }

    /**
     * @param localEdicao the localEdicao to set
     */
    public void setLocalEdicao(String localEdicao) {
        this.localEdicao = localEdicao;
    }

    /**
     * @return the editora
     */
    public Editora getEditora() {
        return editora;
    }

    /**
     * @param editora the editora to set
     */
    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    /**
     * @return the autor
     */
    public ArrayList<Autor> getAutoria() {
        return autoria;
    }

    public void setAutoria(ArrayList<Autor> autoria) {
        this.autoria = autoria;
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
