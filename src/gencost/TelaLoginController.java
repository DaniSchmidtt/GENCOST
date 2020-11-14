/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gencost;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import com.gluonhq.charm.glisten.control.TextField;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 * FXML Controller class
 *
 * @author caiod
 */
public class TelaLoginController {

    public TextField txtEmail;

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException, InterruptedException {

        if (txtEmail.getText().equals("caio1@outlook.com.br") || txtEmail.getText().equals("caio2@outlook.com.br")||txtEmail.getText().equals("1")) {
            Parent root;
            try {
                root = FXMLLoader.load(getClass().getResource("DashboardHomeV2.fxml"));

                Scene home = new Scene(root);
                DashboardHomeV2Stance homeS = null;
                homeS = homeS.getInstance();
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
            root = FXMLLoader.load(getClass().getResource("TelaDeCadastro.fxml"));
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
