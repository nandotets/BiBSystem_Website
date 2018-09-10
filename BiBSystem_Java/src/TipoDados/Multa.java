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
public class Multa implements Serializable{

    private double valorMulta;
    private Associado associado;

    /**
     * @return the valorMulta
     */
    public double getValorMulta() {
        return valorMulta;
    }

    /**
     * @param valorMulta the valorMulta to set
     */
    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
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

}
