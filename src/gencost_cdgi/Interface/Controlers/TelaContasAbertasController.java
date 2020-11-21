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
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;

/**
 * FXML Controller class
 *
 * @author caiod
 */
public class TelaContasAbertasController implements Initializable {

    /**
     * Initializes the controller class.
     
    @FXML
    public TableView<Tables> table;
    @FXML
    public TableColumn<Tables, String> dataM;
    @FXML
    public TableColumn<Tables, String> grupo;
    @FXML
    public TableColumn<Tables, String> valor;
    @FXML
    public TableColumn<Tables, String> forma;
*/
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
        /*
    public TableView table;
    public TableColumn dataM;
    public TableColumn grupo;
    public TableColumn valor;
    public TableColumn forma;
         
        dataM.setCellValueFactory(
                new PropertyValueFactory<>("dataMc"));
        grupo.setCellValueFactory(
                new PropertyValueFactory<>("grupoc"));
        valor.setCellValueFactory(
                new PropertyValueFactory<>("valorc"));
        forma.setCellValueFactory(
                new PropertyValueFactory<>("formac"));

        tabela.setItems(listaTable());
         */
    }
    /*
    private ObservableList<Tables> listaTable() {
        return FXCollections.observableArrayList(
                new Tables("Antonio", "28", "Rua Alvenaria 22", "2"),
                new Tables("Bruno", "19", "Rua São Domingos 108", "1"),
                new Tables("Manoel", "45", "Rua Valentim 05", "2"),
                new Tables("Cassandra", "33", "Rua Palmeira 234", "3"),
                new Tables("Roberto", "69", "Rua Jean Nassif 56", "5"),
                new Tables("Mariana", "16", "Av Rendeiras 78", "4")
        );

    }/*/
     
}
