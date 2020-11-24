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
public class MembrosTable {
    private final SimpleStringProperty ussusuario;
    private final SimpleStringProperty ussnome;
    
    public String getUssusuario() {
        return ussusuario.get();
    }

    public SimpleStringProperty ussusuarioProperty() {
        return ussusuario;
    }

    public void setUssusuario(String ussusuario) {
        this.ussusuario.set(ussusuario);
    }
    
    public String getUssnome() {
        return ussnome.get();
    }

    public SimpleStringProperty ussnomeProperty() {
        return ussnome;
    }

    public void setUssnome(String ussnome) {
        this.ussnome.set(ussnome);
    }
    
    public MembrosTable(String ussnome, String ussusuario){
        this.ussnome = new SimpleStringProperty(ussnome);
        this.ussusuario = new SimpleStringProperty(ussusuario);
    }
}
