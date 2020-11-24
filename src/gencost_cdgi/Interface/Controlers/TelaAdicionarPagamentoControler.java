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

    private void preecheCombo1() {
        Grupo gp1 = new Grupo(1, "Toledo1");
        lista.add(gp1);
        Grupo gp2 = new Grupo(2, "Toledos");
        lista.add(gp2);
        Grupo gp3 = new Grupo(3, "Mercado");
        lista.add(gp3);
        Grupo gp4 = new Grupo(4, "Contas Mensais");
        lista.add(gp4);
        Grupo gp5 = new Grupo(5, "Viagem Santos");
        lista.add(gp5);
        Grupo gp6 = new Grupo(6, "Trabalho");
        lista.add(gp6);
        Grupo gp7 = new Grupo(7, "TCC");
        lista.add(gp7);

        obslist = FXCollections.observableArrayList(lista);
        cbSelecionarGrp.setItems(obslist);
    }

    private void preecheCombo2() {
        ContasPagar cp1 = new ContasPagar(1, "Nova Despesa");
        grupolist.add(cp1);

        grupoobslist = FXCollections.observableArrayList(grupolist);
        cbSelecionarDesp.setItems(grupoobslist);
    }

}
