/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gencost_cdgi.Interface.Controlers;
import gencost_cdgi.Interface.Stance.MensagemDeAlertaStance;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
/**
 * FXML Controller class
 *
 * @author caiod
 */
public class MensagemDeAlertaController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    Label lblMsg;
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException, Throwable {
        MensagemDeAlertaStance mensagem = null;
        mensagem = mensagem.getInstance();
        mensagem.stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        MensagemDeAlertaStance msgalert = null;
        msgalert = msgalert.getInstance();
        String msg = msgalert.mensagem;
        lblMsg.setText(msg);
        
    }
}
