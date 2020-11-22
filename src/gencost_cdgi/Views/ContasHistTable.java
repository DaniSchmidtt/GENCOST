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
public class ContasHistTable {

   

    //-------------------Tableview--------------------------------------//
    private final SimpleStringProperty datapg;
    private final SimpleStringProperty gp;
    private final SimpleStringProperty vlrpg;
    private final SimpleStringProperty formapg;

    public ContasHistTable(String datapg, String gp, String vlrpg, String formapg) {
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
