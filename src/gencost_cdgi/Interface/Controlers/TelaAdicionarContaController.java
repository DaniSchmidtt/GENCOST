/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gencost_cdgi.Interface.Controlers;

import gencost_cdgi.Views.FormaPag;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author caiod
 */
public class TelaAdicionarContaController implements Initializable {

    @FXML
    private ComboBox<FormaPag> cbFormapg;
    
    private List<FormaPag> lista = new ArrayList<>();
    private ObservableList<FormaPag> obslist;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        preecheCombo();
        cbFormapg.getSelectionModel().selectFirst();
        // TODO
    }    
    private void preecheCombo(){
        FormaPag fp1 = new FormaPag(1,"A vista");
        lista.add(fp1);
        FormaPag fp2 = new FormaPag(2,"Prazo");
        lista.add(fp2);
        
        obslist = FXCollections.observableArrayList(lista);
        cbFormapg.setItems(obslist);
    }
}
