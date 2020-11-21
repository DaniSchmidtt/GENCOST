/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gencost_cdgi.Interface.Controlers;
import gencost_cdgi.Interface.Stance.DashboardHomeV2Stance;
import gencost_cdgi.Interface.Stance.MeusGruposStance;
import gencost_cdgi.Interface.Stance.TelaAdicionarGrupoStance;
import gencost_cdgi.Interface.Stance.TelaContasAbertasStance;
import gencost_cdgi.Interface.Stance.TelaDetalhesGrupoStance;
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

/**
 * FXML Controller class
 *
 * @author caiod
 */
public class MeusGruposController implements Initializable {

    /**
     * Initializes the controller class.
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
        MeusGruposStance mgpS = null;
        mgpS = mgpS.getInstance();
        mgpS.stage.close();
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
            MeusGruposStance mgpS = null;
            mgpS = mgpS.getInstance();
            mgpS.stage.close();
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
            MeusGruposStance mgpS = null;
            mgpS = mgpS.getInstance();
            mgpS.stage.close();
        } catch (IOException ex) {
            Logger.getLogger(ThreaDa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @FXML
    private void handleButtonActionADD(ActionEvent event) throws IOException, InterruptedException {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("/gencost_cdgi/Interface/TelaAdicionarGrupo.fxml"));
            Scene cta = new Scene(root);
            TelaAdicionarGrupoStance ctaS = null;
            ctaS = ctaS.getInstance();
            ctaS.stage.setScene(cta);
            ctaS.stage.show();
        } catch (IOException ex) {
            Logger.getLogger(ThreaDa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @FXML
    private void handleButtonActionCHU(ActionEvent event) throws IOException, InterruptedException {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("/gencost_cdgi/Interface/TelaDetalhesGrupo.fxml"));

            Scene cta = new Scene(root);
            TelaDetalhesGrupoStance ctaS = null;
            ctaS = ctaS.getInstance();
            ctaS.stage.setScene(cta);
            ctaS.stage.show();
        } catch (IOException ex) {
            Logger.getLogger(ThreaDa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void handleButtonActionSAIR(ActionEvent event) throws IOException, InterruptedException {
        TelaLoginStance telaS = null;
        telaS = telaS.getInstance();
        telaS.stage.show();
        MeusGruposStance mgpS = null;
        mgpS = mgpS.getInstance();
        mgpS.stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
