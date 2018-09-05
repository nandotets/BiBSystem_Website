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
public class Editora implements Serializable{

    private int idEditora;
    private String razaoSocial;

    /**
     * @return the idEditora
     */
    public int getIdEditora() {
        return idEditora;
    }
    
    /**
     * @param idEditora the idEditora to set
     */
    public void setIdEditora(int idEditora) {
        this.idEditora = idEditora;
    }

    /**
     * @return the razaoSocial
     */
    public String getRazaoSocial() {
        return razaoSocial;
    }

    /**
     * @param razaoSocial the razaoSocial to set
     */
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

}
