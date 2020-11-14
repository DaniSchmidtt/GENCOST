/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gencost;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author caiod
 */

public class Tables {

    public SimpleStringProperty dataMc;
    public SimpleStringProperty grupoc;
    public SimpleStringProperty valorc;
    public SimpleStringProperty formac;
        public Tables(String dataM, String grupo, String valor,String forma) {
        this.dataMc = new SimpleStringProperty(dataM);
        this.grupoc = new SimpleStringProperty(grupo);
        this.valorc = new SimpleStringProperty(valor);
        this.formac = new SimpleStringProperty(forma);
    }
     
}
