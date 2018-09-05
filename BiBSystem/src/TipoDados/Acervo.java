/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TipoDados;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Fernando TeTz
 */
public abstract class Acervo implements Serializable{

    protected int IDAcervo;
    protected String titulo;
    protected int qtdeExemplar;
    
    public Acervo(int IDAcervo, String titulo, int qtdeExemplar){
        this.IDAcervo = IDAcervo;
        this.titulo = titulo;
        this.qtdeExemplar = qtdeExemplar;
    }

    /**
     * @return the IDAcervo
     */
    public int getIDAcervo() {
        return IDAcervo;
    }

    /**
     * @param IDAcervo the IDAcervo to set
     */
    public void setIDAcervo(int IDAcervo) {
        this.IDAcervo = IDAcervo;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the qtdeExemplar
     */
    public int getQtdeExemplar() {
        return qtdeExemplar;
    }

    /**
     * @param qtdeExemplar the qtdeExemplar to set
     */
    public void setQtdeExemplar(int qtdeExemplar) {
        this.qtdeExemplar = qtdeExemplar;
    }

    public void add(ArrayList<Acervo> acervos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
