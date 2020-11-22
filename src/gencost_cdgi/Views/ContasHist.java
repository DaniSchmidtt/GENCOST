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
     * @return the id
     */
    /*
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    /*
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the datapagamento
     */
    /*
    public String getDatapagamento() {
        return datapagamento;
    }

    /**
     * @param datapagamento the datapagamento to set
     */
    /*
    public void setDatapagamento(String datapagamento) {
        this.datapagamento = datapagamento;
    }

    /**
     * @return the grupo
     */
    /*
    public String getGrupo() {
        return grupo;
    }

    
    /**
     * @param grupo the grupo to set
     */
    /*
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    
    /**
     * @return the valorpago
     */
    /*
    public String getValorpago() {
        return valorpago;
    }

    
    
    /**
     * @param valorpago the valorpago to set
     */
    /*
    public void setValorpago(String valorpago) {
        this.valorpago = valorpago;
    }
    
    /**
     * @return the formapagamento
     */
    /*
    public String getFormapagamento() {
        return formapagamento;
    }

    /**
     * @param formapagamento the formapagamento to set
     */
    /*
    public void setFormapagamento(String formapagamento) {
        this.formapagamento = formapagamento;
    }
    
     public static synchronized Contas getInstance() {
        if (instancia == null) {
            instancia = new Contas();
        }
        return instancia;
    }
    
    private int id;
    private String datapagamento;
    private String grupo;
    private String valorpago;
    private String formapagamento;
    private static Contas instancia;
     */
   
    /*private Contas(){
        
    } */
    
    private final SimpleStringProperty datapg;
    private final SimpleStringProperty gp;
    private final SimpleStringProperty vlrpg;
    private final SimpleStringProperty formapg;
    
    public ContasHist(String datapg, String gp, String vlrpg, String formapg){
        this.datapg = new SimpleStringProperty(datapg);
        this.gp = new SimpleStringProperty(gp);
        this.vlrpg = new SimpleStringProperty(vlrpg);
        this.formapg = new SimpleStringProperty(formapg);
    }
    
    public String getDatapg() {
        return datapg.get();
    }

    public SimpleStringProperty datapgProperty() {
        return datapg;
    }

    public void setDatapg(String datapg) {
        this.datapg.set(datapg);
    }
    
    public String getGp() {
        return gp.get();
    }

    public SimpleStringProperty gpProperty() {
        return gp;
    }

    public void setGp(String gp) {
        this.gp.set(gp);
    }
    
    public String getVlrpg() {
        return vlrpg.get();
    }

    public SimpleStringProperty vlrpgProperty() {
        return vlrpg;
    }

    public void setVlrpg(String vlrpg) {
        this.vlrpg.set(vlrpg);
    }
    
    public String getFormapg() {
        return formapg.get();
    }

    public SimpleStringProperty formapgProperty() {
        return formapg;
    }

    public void setFormapg(String formapg) {
        this.formapg.set(formapg);
    }
    
}
