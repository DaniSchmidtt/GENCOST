/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gencost_cdgi.Interface.Controlers;

import gencost_cdgi.Business.Business;
import gencost_cdgi.Interface.Stance.MensagemDeAlertaStance;
import gencost_cdgi.Interface.Stance.TelaDeCadastroStance;
import gencost_cdgi.Interface.Thread.ThreaDa;
import javafx.scene.control.TextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author caiod
 */
public class TelaDeCadastroController implements Initializable {

    @FXML
    TextField txtusuario;
    @FXML
    TextField txtemail;
    @FXML
    TextField txtsenha;
    @FXML
    TextField txtconfsenha;

    /**
     * Initializes the controller class. |
     */
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException, InterruptedException {
        Business usrvalida = new Business();
        if (txtusuario.getText().trim().equals("")) {
            ThreaDa thread = new ThreaDa();
            MensagemDeAlertaStance mensagem = null;
            mensagem = mensagem.getInstance();
            mensagem.mensagem = ("Preencha usuario corretamente!");
            thread.run();
        } else if (txtemail.getText().trim().equals("")) {
            ThreaDa thread = new ThreaDa();
            MensagemDeAlertaStance mensagem = null;
            mensagem = mensagem.getInstance();
            mensagem.mensagem = ("Preencha E-mail corretamente!");
            thread.run();
        } else if (txtsenha.getText().trim().equals("")) {
            ThreaDa thread = new ThreaDa();
            MensagemDeAlertaStance mensagem = null;
            mensagem = mensagem.getInstance();
            mensagem.mensagem = ("Preencha senha corretamente!");
            thread.run();
        } else if (txtconfsenha.getText().trim().equals("")) {
            ThreaDa thread = new ThreaDa();
            MensagemDeAlertaStance mensagem = null;
            mensagem = mensagem.getInstance();
            mensagem.mensagem = ("Confirme sua senha!");
            thread.run();
        } else if (!(txtsenha.getText().equals(txtconfsenha.getText()))) {
            ThreaDa thread = new ThreaDa();
            MensagemDeAlertaStance mensagem = null;
            mensagem = mensagem.getInstance();
            mensagem.mensagem = ("Senhas não são iguais!");
            thread.run();
        } else {
            if (usrvalida.validaUser(txtemail.getText())) {
                ThreaDa thread = new ThreaDa();
                MensagemDeAlertaStance mensagem = null;
                mensagem = mensagem.getInstance();
                mensagem.mensagem = ("E-mail ja cadastrado");
                thread.run();
            } else {
                ThreaDa thread = new ThreaDa();
                MensagemDeAlertaStance mensagem = null;
                mensagem = mensagem.getInstance();
                usrvalida.validaInsertUser(txtemail.getText(), txtsenha.getText(), txtusuario.getText());
                mensagem.mensagem = ("Cadastro efetuado!");
                thread.run();
                TelaDeCadastroStance TelaDeCadastro = null;
                TelaDeCadastro = TelaDeCadastro.getInstance();
                TelaDeCadastro.stage.close();
            }
        }
    }


@Override
        public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
