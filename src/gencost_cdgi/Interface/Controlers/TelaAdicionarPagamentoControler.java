/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gencost_cdgi.Interface.Controlers;

import gencost_cdgi.Views.ContasPagar;
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
 * @author danil
 */
public class TelaAdicionarPagamentoControler implements Initializable {

    @FXML
    private ComboBox<Grupo> cbSelecionarGrp;
    @FXML
    private ComboBox<ContasPagar> cbSelecionarDesp;
    
    private List<Grupo> lista = new ArrayList<>();
    private ObservableList<Grupo> obslist;
    
    private List<ContasPagar> grupolist = new ArrayList<>();
    private ObservableList<ContasPagar> grupoobslist;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        preecheCombo1();
        cbSelecionarGrp.getSelectionModel().selectFirst();
        preecheCombo2();
        cbSelecionarDesp.getSelectionModel().selectFirst();
        // TODO
    }
private void preecheCombo1(){
        Grupo fp1 = new Grupo(1,"ASD");
        lista.add(fp1);
        Grupo fp2 = new Grupo(2,"QQQ");
        lista.add(fp2);
        
        obslist = FXCollections.observableArrayList(lista);
        cbSelecionarGrp.setItems(obslist);
    }
    
        private void preecheCombo2(){
        ContasPagar gp1 = new ContasPagar(1,"RQWE");
        grupolist.add(gp1);
        ContasPagar gp2 = new ContasPagar(2,"$#$@");
        grupolist.add(gp2);
        
        grupoobslist = FXCollections.observableArrayList(grupolist);
        cbSelecionarDesp.setItems(grupoobslist);
    }    
    
}
