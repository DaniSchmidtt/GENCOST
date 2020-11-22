/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gencost_cdgi.Interface.Controlers;

import gencost_cdgi.Interface.Stance.DashboardHomeV2Stance;
import gencost_cdgi.Interface.Stance.MeusGruposStance;
import gencost_cdgi.Interface.Stance.TelaAdicionarContaStance;
import gencost_cdgi.Interface.Stance.TelaContasAbertasStance;
import gencost_cdgi.Interface.Stance.TelaHistoricoStance;
import gencost_cdgi.Interface.Stance.TelaLoginStance;
import gencost_cdgi.Interface.Thread.ThreaDa;
import gencost_cdgi.Views.ContasHistTable;
import gencost_cdgi.Views.ContasPagarTable;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author caiod
 */
public class TelaContasAbertasController implements Initializable {

    //** Initializes the controller class.
    @FXML
    public TableView<ContasPagarTable> tableContas;
    @FXML
    public TableColumn<ContasPagarTable, String> dataMcol;
    @FXML
    public TableColumn<ContasPagarTable, String> grupocol;
    @FXML
    public TableColumn<ContasPagarTable, String> valorcol;
    @FXML
    public TableColumn<ContasPagarTable, String> formacol;

    @FXML
    private void handleButtonActionHOME(ActionEvent event) throws IOException, InterruptedException {

        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("/gencost_cdgi/Interface/DashboardHomeV2.fxml"));

            Scene home = new Scene(root);
            DashboardHomeV2Stance homeS = null;
            homeS = homeS.getInstance();
            homeS.stage.setScene(home);
            homeS.stage.show();
        } catch (IOException ex) {
            Logger.getLogger(ThreaDa.class.getName()).log(Level.SEVERE, null, ex);
        }
        TelaContasAbertasStance ctaS = null;
        ctaS = ctaS.getInstance();
        ctaS.stage.close();
    }

    @FXML
    private void handleButtonActionMGP(ActionEvent event) throws IOException, InterruptedException {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("/gencost_cdgi/Interface/MeusGrupos.fxml"));

            Scene mgp = new Scene(root);
            MeusGruposStance mgpS = null;
            mgpS = mgpS.getInstance();
            mgpS.stage.setScene(mgp);
            mgpS.stage.show();
            TelaContasAbertasStance ctaS = null;
            ctaS = ctaS.getInstance();
            ctaS.stage.close();
        } catch (IOException ex) {
            Logger.getLogger(ThreaDa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void handleButtonActionHIST(ActionEvent event) throws IOException, InterruptedException {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("/gencost_cdgi/Interface/TelaHistorico.fxml"));

            Scene hist = new Scene(root);
            TelaHistoricoStance histS = null;
            histS = histS.getInstance();
            histS.stage.setScene(hist);
            histS.stage.show();
            TelaContasAbertasStance ctaS = null;
            ctaS = ctaS.getInstance();
            ctaS.stage.close();
        } catch (IOException ex) {
            Logger.getLogger(ThreaDa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void handleButtonActionADD(ActionEvent event) throws IOException, InterruptedException {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("/gencost_cdgi/Interface/TelaAdicionarConta.fxml"));

            Scene add = new Scene(root);
            TelaAdicionarContaStance addS = null;
            addS = addS.getInstance();
            addS.stage.setScene(add);
            addS.stage.show();
        } catch (IOException ex) {
            Logger.getLogger(ThreaDa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void handleButtonActionSAIR(ActionEvent event) throws IOException, InterruptedException {
        TelaLoginStance telaS = null;
        telaS = telaS.getInstance();
        telaS.stage.show();
        TelaContasAbertasStance ctaS = null;
        ctaS = ctaS.getInstance();
        ctaS.stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        dataMcol.setCellValueFactory(new PropertyValueFactory<>("datamax"));
        grupocol.setCellValueFactory(new PropertyValueFactory<>("grupo"));
        valorcol.setCellValueFactory(new PropertyValueFactory<>("valor"));
        formacol.setCellValueFactory(new PropertyValueFactory<>("formapg"));
        
        tableContas.setItems(listaContasPagar());
    }
    private ObservableList<ContasPagarTable> listaContasPagar() {
        
        return FXCollections.observableArrayList(new ContasPagarTable("10-06-20", "Condominio", "95,90", "a VISTA"),
                new ContasPagarTable("19-06-20", "Condominio", "69", "a VISTA")
        );
    }

}
