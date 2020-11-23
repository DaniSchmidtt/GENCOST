/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gencost_cdgi.Views;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.image.ImageView;

/**
 *
 * @author danil
 */
public class GrupoTable {

    /**
     * @return the id
     */
    public SimpleIntegerProperty getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(SimpleIntegerProperty id) {
        this.id = id;
    }

    private final SimpleStringProperty grp;
    private final SimpleStringProperty img;
    private SimpleIntegerProperty id;
    public String getGrp() {
        return grp.get();
    }

    public SimpleStringProperty grpProperty() {
        return grp;
    }

    public void setGrp(String grp) {
        this.grp.set(grp);
    }

    public String getImg() {
        return img.get();
    }

    public SimpleStringProperty imgProperty() {
        return img;
    }

    public void setImg(String img) {
        this.img.set(img);
    }

    public GrupoTable(String grp, String img, int id) {
        this.grp = new SimpleStringProperty(grp);
        this.img = new SimpleStringProperty(img);
        this.id = new SimpleIntegerProperty (id);
    }
}
