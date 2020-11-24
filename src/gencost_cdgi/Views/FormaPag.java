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
public class FormaPag {

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the forma
     */
    public String getForma() {
        return forma;
    }

    /**
     * @param forma the forma to set
     */
    public void setForma(String forma) {
        this.forma = forma;
    }
    private int ID;
    private String forma;
    
    public FormaPag(int id, String formaa){
        this.ID = id;
        this.forma = formaa;
    }
    
    @Override
    public String toString(){
        return forma;
    }
}
