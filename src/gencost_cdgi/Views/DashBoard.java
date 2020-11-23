/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gencost_cdgi.Views;

/**
 *
 * @author danil
 */
public class DashBoard {

    /**
     * @return the despesa
     */
    public String getDespesa() {
        return despesa;
    }

    /**
     * @param despesa the despesa to set
     */
    public void setDespesa(String despesa) {
        this.despesa = despesa;
    }

    /**
     * @return the valorpago
     */
    public double getValorpago() {
        return valorpago;
    }

    /**
     * @param valorpago the valorpago to set
     */
    public void setValorpago(double valorpago) {
        this.valorpago = valorpago;
    }

    /**
     * @return the divida
     */
    public double getDivida() {
        return divida;
    }

    /**
     * @param divida the divida to set
     */
    public void setDivida(double divida) {
        this.divida = divida;
    }

    /**
     * @return the grupo
     */
    public String getGrupo() {
        return grupo;
    }

    /**
     * @param grupo the grupo to set
     */
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    
     public static synchronized DashBoard getInstance() {
        if (instancia == null) {
            instancia = new DashBoard();
        }
        return instancia;
    }
    
    private String despesa;
    private double valorpago;
    private double divida;
    private String grupo;
    private static DashBoard instancia;
    private DashBoard(){
        
    }
}
