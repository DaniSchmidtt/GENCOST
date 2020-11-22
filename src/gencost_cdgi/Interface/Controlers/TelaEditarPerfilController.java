/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gencost_cdgi.Interface.Controlers;

import gencost_cdgi.Business.Business;
import gencost_cdgi.Interface.Stance.MensagemDeAlertaStance;
import gencost_cdgi.Interface.Thread.ThreaDa;
import gencost_cdgi.Views.Usuario;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author caiod
 */
public class TelaEditarPerfilController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    TextField txtusuario;
    @FXML
    TextField txtemail;
    @FXML
    TextField txtsenha;
    @FXML
    TextField txtsenhan;
    @FXML
    TextField txtconfsenha;

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException, InterruptedException, SQLException {

        Business usrvalida = new Business();
        Usuario usr = null;
        usr = usr.getInstance();
        
        if (txtusuario.getText().trim().equals("") && txtemail.getText().trim().equals("")
                && txtsenhan.getText().trim().equals("") && txtconfsenha.getText().trim().equals("")) {
            ThreaDa thread = new ThreaDa();
            MensagemDeAlertaStance mensagem = null;
            mensagem = mensagem.getInstance();
            mensagem.mensagem = ("Nenhuma alteração localizada!");
            thread.run();
        } else {
            if (!txtusuario.getText().trim().equals("")) {
                usrvalida.UpdateUser(usr.getEmail(), usr.getSenha(), txtusuario.getText());
                ThreaDa thread = new ThreaDa();
                MensagemDeAlertaStance mensagem = null;
                mensagem = mensagem.getInstance();
                mensagem.mensagem = ("Usuario atualizado!");
                thread.run();
            }
            if (!txtemail.getText().trim().equals("")) {
                usrvalida.UpdateUser(txtemail.getText(), usr.getSenha(), usr.getNome());
                ThreaDa thread = new ThreaDa();
                MensagemDeAlertaStance mensagem = null;
                mensagem = mensagem.getInstance();
                mensagem.mensagem = ("Usuario atualizado!");
                thread.run();
            }
            if (!txtsenhan.getText().trim().equals("")) {
                if (txtsenha.getText().trim().equals("")) {
                    ThreaDa thread = new ThreaDa();
                    MensagemDeAlertaStance mensagem = null;
                    mensagem = mensagem.getInstance();
                    mensagem.mensagem = ("Digite senha antiga!");
                    thread.run();
                } else if (txtconfsenha.getText().trim().equals("")) {
                    ThreaDa thread = new ThreaDa();
                    MensagemDeAlertaStance mensagem = null;
                    mensagem = mensagem.getInstance();
                    mensagem.mensagem = ("Confirme sua senha!");
                    thread.run();
                } else if (!(txtsenhan.getText().equals(txtconfsenha.getText()))) {
                    ThreaDa thread = new ThreaDa();
                    MensagemDeAlertaStance mensagem = null;
                    mensagem = mensagem.getInstance();
                    mensagem.mensagem = ("Senhas não são iguais!");
                    thread.run();
                } else {
                    usrvalida.UpdateUser(usr.getEmail(), txtsenhan.getText(), usr.getNome());
                    ThreaDa thread = new ThreaDa();
                    MensagemDeAlertaStance mensagem = null;
                    mensagem = mensagem.getInstance();
                    mensagem.mensagem = ("Usuario atualizado!");
                    thread.run();
                }
            } else if (!txtconfsenha.getText().trim().equals("")) {
                ThreaDa thread = new ThreaDa();
                MensagemDeAlertaStance mensagem = null;
                mensagem = mensagem.getInstance();
                mensagem.mensagem = ("Digite primeiro uma nova senha!");
                thread.run();
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        // TODO
    }

}
