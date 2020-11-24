/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gencost_cdgi.Interface.Controlers;

import gencost_cdgi.Views.FormaPag;
import gencost_cdgi.Views.Grupo;
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
    
    @FXML
    private ComboBox<Grupo> cbSelecionagrp;
    
    private List<FormaPag> lista = new ArrayList<>();
    private ObservableList<FormaPag> obslist;
    
    private List<Grupo> grupolist = new ArrayList<>();
    private ObservableList<Grupo> grupoobslist;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        preecheCombo1();
        cbFormapg.getSelectionModel().selectFirst();
        preecheCombo2();
        cbSelecionagrp.getSelectionModel().selectFirst();
        // TODO
    }    
    private void preecheCombo1(){
        FormaPag fp1 = new FormaPag(1,"A vista");
        lista.add(fp1);
        FormaPag fp2 = new FormaPag(2,"Prazo");
        lista.add(fp2);
        
        obslist = FXCollections.observableArrayList(lista);
        cbFormapg.setItems(obslist);
    }
    
        private void preecheCombo2(){
        Grupo gp1 = new Grupo(1,"Toledo");
        grupolist.add(gp1);
        Grupo gp2 = new Grupo(2,"Ftt");
        grupolist.add(gp2);
        
        grupoobslist = FXCollections.observableArrayList(grupolist);
        cbSelecionagrp.setItems(grupoobslist);
    }
}
