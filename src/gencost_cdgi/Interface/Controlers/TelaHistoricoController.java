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
public class TelaHistoricoController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private TableView<ContasHistTable> tablehistorico;

    @FXML
    private TableColumn<ContasHistTable, String> datapagcol;

    @FXML
    private TableColumn<ContasHistTable, String> grpcol;

    @FXML
    private TableColumn<ContasHistTable, String> vlrpgcol;

    @FXML
    private TableColumn<ContasHistTable, String> formapgcol;

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
        TelaHistoricoStance histS = null;
        histS = histS.getInstance();
        histS.stage.close();
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
            TelaHistoricoStance histS = null;
            histS = histS.getInstance();
            histS.stage.close();
        } catch (IOException ex) {
            Logger.getLogger(ThreaDa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void handleButtonActionCTA(ActionEvent event) throws IOException, InterruptedException {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("/gencost_cdgi/Interface/TelaContasAbertas.fxml"));

            Scene cta = new Scene(root);
            TelaContasAbertasStance ctaS = null;
            ctaS = ctaS.getInstance();
            ctaS.stage.setScene(cta);
            ctaS.stage.show();
            TelaHistoricoStance histS = null;
            histS = histS.getInstance();
            histS.stage.close();
        } catch (IOException ex) {
            Logger.getLogger(ThreaDa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
@FXML
    private void handleButtonActionADDCON(ActionEvent event) throws IOException, InterruptedException {

                Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("/gencost_cdgi/Interface/TelaAdicionarPagamento.fxml"));

            Scene add = new Scene(root);
            TelaAdicionarContaStance adcS = null;
            adcS = adcS.getInstance();
            adcS.stage.setScene(add);
            adcS.stage.show();
        } catch (IOException ex) {
            Logger.getLogger(ThreaDa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void handleButtonActionSAIR(ActionEvent event) throws IOException, InterruptedException {
        TelaLoginStance telaS = null;
        telaS = telaS.getInstance();
        telaS.stage.show();
        TelaHistoricoStance histS = null;
        histS = histS.getInstance();
        histS.stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        

        datapagcol.setCellValueFactory(new PropertyValueFactory<>("datapg"));

        grpcol.setCellValueFactory(new PropertyValueFactory<>("gp"));

        vlrpgcol.setCellValueFactory(new PropertyValueFactory<>("vlrpg"));

        formapgcol.setCellValueFactory(new PropertyValueFactory<>("formapg"));
        
        tablehistorico.setItems(listahistContas());
    }

    private ObservableList<ContasHistTable> listahistContas() {
        
        return FXCollections.observableArrayList(
                new ContasHistTable("10-05-20", "Condominio", "25,90", "a VISTA"),
                new ContasHistTable("19-05-20", "Condominio", "29", "a VISTA")
        );
    }

}
