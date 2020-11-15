/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * teste
 */
package gencost;

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

/**
 * FXML Controller class
 *
 * @author caiod
 */
public class DashboardHomeV2Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private void handleButtonActionMGP(ActionEvent event) throws IOException, InterruptedException {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("MeusGrupos.fxml"));

            Scene mgp = new Scene(root);
            MeusGruposStance mgpS = null;
            mgpS = mgpS.getInstance();
            mgpS.stage.setScene(mgp);
            mgpS.stage.show();
            DashboardHomeV2Stance homeS = null;
            homeS = homeS.getInstance();
            homeS.stage.close();
        } catch (IOException ex) {
            Logger.getLogger(ThreaDa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void handleButtonActionHIST(ActionEvent event) throws IOException, InterruptedException {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("TelaHistorico.fxml"));

            Scene hist = new Scene(root);
            TelaHistoricoStance histS = null;
            histS = histS.getInstance();
            histS.stage.setScene(hist);
            histS.stage.show();
            DashboardHomeV2Stance homeS = null;
            homeS = homeS.getInstance();
            homeS.stage.close();
        } catch (IOException ex) {
            Logger.getLogger(ThreaDa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void handleButtonActionCTA(ActionEvent event) throws IOException, InterruptedException {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("TelaContasAbertas.fxml"));

            Scene cta = new Scene(root);
            TelaContasAbertasStance ctaS = null;
            ctaS = ctaS.getInstance();
            ctaS.stage.setScene(cta);
            ctaS.stage.show();
            DashboardHomeV2Stance homeS = null;
            homeS = homeS.getInstance();
            homeS.stage.close();
        } catch (IOException ex) {
            Logger.getLogger(ThreaDa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void handleButtonActionEDD(ActionEvent event) throws IOException, InterruptedException {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("TelaEditarPerfil.fxml"));

            Scene edd = new Scene(root);
            TelaEditarPerfilStance eddS = null;
            eddS = eddS.getInstance();
            eddS.stage.setScene(edd);
            eddS.stage.show();
        } catch (IOException ex) {
            Logger.getLogger(ThreaDa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void handleButtonActionSAIR(ActionEvent event) throws IOException, InterruptedException {
        TelaLoginStance telaS = null;
        telaS = telaS.getInstance();
        telaS.stage.show();
        DashboardHomeV2Stance homeS = null;
        homeS = homeS.getInstance();
        homeS.stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
