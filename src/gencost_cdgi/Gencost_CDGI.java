/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gencost_cdgi;

import gencost_cdgi.Business.Business;
import gencost_cdgi.DAO.ConexaoDB;
import gencost_cdgi.Interface.Stance.TelaLoginStance;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author caiod
 */
public class Gencost_CDGI extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/gencost_cdgi/Interface/TelaLogin.fxml"));
        Scene scene = new Scene(root);
        TelaLoginStance tela = null;
        tela = tela.getInstance();
        tela.stage.setScene(scene);
        tela.stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
     launch(args);      
    }

}
