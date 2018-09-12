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
public class Autor implements Serializable {

    private int idAutor;
    private String nome;

    /**
     * @return the idAutor
     */
    public int getIdAutor() {
        return idAutor;
    }

    /**
     * @param idAutor the idAutor to set
     */
    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString(){
        return nome+"\n";
    }
    
    
}
