/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gencost;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 *
 * @author caiod
 */
public class ThreaDa extends Thread {
    @Override
    public void run() {
        Parent root;
        
        try {
            root = FXMLLoader.load(getClass().getResource("MensagemDeAlerta.fxml"));
         
        Scene alerta = new Scene(root);
        MensagemDeAlertaStance mensagem = null;
        mensagem = mensagem.getInstance();
        mensagem.stage.setScene(alerta);           
        mensagem.stage.show();
        }
        catch (IOException ex) {
            Logger.getLogger(ThreaDa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
