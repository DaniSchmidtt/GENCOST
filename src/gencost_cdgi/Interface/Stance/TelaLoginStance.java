/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gencost_cdgi.Interface.Stance;
import javafx.stage.Stage;

/**
 *
 * @author caiod
 */
public class TelaLoginStance {

    private static TelaLoginStance instancia;
    public Stage stage = new Stage();

    private TelaLoginStance() {
    }

    public static synchronized TelaLoginStance getInstance() {
        if (instancia == null) {
            instancia = new TelaLoginStance();
        }
        return instancia;
    }
}