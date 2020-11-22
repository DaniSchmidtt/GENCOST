/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gencost_cdgi.Views;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author danil
 */
public class ContasHist {

    /**
     * @return the datapg
     */
    public String getDatapg() {
        return datapg;
    }

    /**
     * @param datapg the datapg to set
     */
    public void setDatapg(String datapg) {
        this.datapg = datapg;
    }

    /**
     * @return the gp
     */
    public String getGp() {
        return gp;
    }

    /**
     * @param gp the gp to set
     */
    public void setGp(String gp) {
        this.gp = gp;
    }

    /**
     * @return the vlrpg
     */
    public String getVlrpg() {
        return vlrpg;
    }

    /**
     * @param vlrpg the vlrpg to set
     */
    public void setVlrpg(String vlrpg) {
        this.vlrpg = vlrpg;
    }

    /**
     * @return the formapg
     */
    public String getFormapg() {
        return formapg;
    }

    /**
     * @param formapg the formapg to set
     */
    public void setFormapg(String formapg) {
        this.formapg = formapg;
    }
    
    public static synchronized ContasHist getInstance() {
        if (instancia == null) {
            instancia = new ContasHist();
        }
        return instancia;
    }
    
    private String datapg;
    private String gp;
    private String vlrpg;
    private String formapg;
    private static ContasHist instancia;
    private ContasHist(){
        
    }

}
