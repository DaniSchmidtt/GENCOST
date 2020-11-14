/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gencost;

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
    TextField txtemail;
    /**
     * Initializes the controller class.
     */
        @FXML
    private void handleButtonAction(ActionEvent event) throws IOException, InterruptedException {

        if (txtemail.getText().equals("caio1@outlook.com.br")) {
            ThreaDa thread = new ThreaDa();
            MensagemDeAlertaStance mensagem = null;
            mensagem = mensagem.getInstance();
            mensagem.mensagem = ("E-mail ja cadastrado");
            thread.run();
        } else {
            if(txtemail.getText().equals("")){
            ThreaDa thread = new ThreaDa();
            MensagemDeAlertaStance mensagem = null;
            mensagem = mensagem.getInstance();
            mensagem.mensagem = ("Preencha corretamente!");
            thread.run();  
            }
            else{
            ThreaDa thread = new ThreaDa();
            MensagemDeAlertaStance mensagem = null;
            mensagem = mensagem.getInstance();
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
