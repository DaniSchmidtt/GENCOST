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
public class ContasPagarTable {

    private final SimpleStringProperty datamax;
    private final SimpleStringProperty grupo;
    private final SimpleStringProperty valor;
    private final SimpleStringProperty formapg;

    public ContasPagarTable(String datamax, String grupo, String valor, String formapg) {
        this.datamax = new SimpleStringProperty(datamax);
        this.grupo = new SimpleStringProperty(grupo);
        this.valor = new SimpleStringProperty(valor);
        this.formapg = new SimpleStringProperty(formapg);
    }

    public String getDatamax() {
        return datamax.get();
    }

    public SimpleStringProperty datamaxProperty() {
        return datamax;
    }

    public void setDatamax(String datamax) {
        this.datamax.set(datamax);
    }

    public String getGrupo() {
        return grupo.get();
    }

    public SimpleStringProperty grupoProperty() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo.set(grupo);
    }

    public String getValor() {
        return valor.get();
    }

    public SimpleStringProperty valorProperty() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor.set(valor);
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
