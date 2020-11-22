/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gencost_cdgi.Interface.Controlers;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import com.gluonhq.charm.glisten.control.TextField;
import gencost_cdgi.Business.Business;
import gencost_cdgi.Interface.Stance.DashboardHomeV2Stance;
import gencost_cdgi.Interface.Stance.MensagemDeAlertaStance;
import gencost_cdgi.Interface.Stance.TelaDeCadastroStance;
import gencost_cdgi.Interface.Stance.TelaLoginStance;
import gencost_cdgi.Interface.Thread.ThreaDa;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;

/**
 * FXML Controller class
 *
 * @author caiod
 */
public class TelaLoginController {

    public TextField txtEmail;
    public PasswordField txtPassword;

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException, InterruptedException {
        Business usrvalida = new Business();
        String email = txtEmail.getText();
        if (usrvalida.validaUser(email, txtPassword.getText())) {
            Parent root;
            try {
                DashboardHomeV2Stance homeS = null;
                homeS = homeS.getInstance();
                root = FXMLLoader.load(getClass().getResource("/gencost_cdgi/Interface/DashboardHomeV2.fxml"));
                Scene home = new Scene(root);
                homeS.stage.setScene(home);
                homeS.stage.show();
            } catch (IOException ex) {
                Logger.getLogger(ThreaDa.class.getName()).log(Level.SEVERE, null, ex);
            }

            TelaLoginStance telalogin = null;
            telalogin = telalogin.getInstance();
            telalogin.stage.close();
            TelaDeCadastroStance cadastros = null;
            cadastros = cadastros.getInstance();
            cadastros.stage.close();
        } else {
            ThreaDa thread = new ThreaDa();
            MensagemDeAlertaStance mensagem = null;
            mensagem = mensagem.getInstance();
            mensagem.mensagem = ("Login ou senha incorretos!");
            thread.run();
        }
    }

    @FXML
    private void handleButtonActionCad(ActionEvent event) throws IOException, InterruptedException {

        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("/gencost_cdgi/Interface/TelaDeCadastro.fxml"));
            Scene cadastro = new Scene(root);
            TelaDeCadastroStance cadastros = null;
            cadastros = cadastros.getInstance();
            cadastros.stage.setScene(cadastro);
            cadastros.stage.show();
        } catch (IOException ex) {
            Logger.getLogger(ThreaDa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
