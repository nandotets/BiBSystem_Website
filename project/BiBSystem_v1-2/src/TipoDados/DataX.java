/**
 *
 * @author Fernando TeTz
 */
package TipoDados;

import java.io.Serializable;

public final class DataX implements Serializable {

    private byte dia;
    private byte mes;
    private short ano;

    public DataX(byte dia, byte mes, short ano) {
        if (ehDataValida(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }

    public boolean ehDataValida(byte d, byte m, short a) {
        return ((a > 0) && (d >= 1) && (d <= 31) && (m >= 1) && (m <= 12));//{
    }

    @Override
    public String toString() {
        String[] meses = {"Mês", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        return dia + " / " + meses[mes] + " / " + ano;
    }

    public void mostraData() {
        String[] meses = {"Mês", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        System.out.print(dia);
        System.out.print("/");
        System.out.print(meses[mes]);
        System.out.print("/");
        System.out.println(ano);
    }

    public boolean ehIgual(DataX outraData) {
        if ((dia == outraData.dia) && (mes == outraData.mes) && (ano == outraData.ano)) {
            return true;
        }
        return false;
    }

    /**
     * @return the dia
     */
    public byte getDia() {
        return dia;
    }

    /**
     * @return the mes
     */
    public byte getMes() {
        return mes;
    }

    /**
     * @return the ano
     */
    public short getAno() {
        return ano;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(byte dia) {
        this.dia = dia;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(byte mes) {
        this.mes = mes;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(short ano) {
        this.ano = ano;
    }
}
