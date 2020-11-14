/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gencost;

import javafx.stage.Stage;

/**
 *
 * @author caiod
 */
public class TelaEditarPerfilStance {
            private static TelaEditarPerfilStance instancia;
    public Stage stage = new Stage();

    private TelaEditarPerfilStance() {
    }

    public static synchronized TelaEditarPerfilStance getInstance() {
        if (instancia == null) {
            instancia = new TelaEditarPerfilStance();
        }
        return instancia;
    }
}
