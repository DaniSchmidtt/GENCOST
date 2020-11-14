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
public class TelaAdicionarContaStance {
        private static TelaAdicionarContaStance instancia;
    public Stage stage = new Stage();

    private TelaAdicionarContaStance() {
    }

    public static synchronized TelaAdicionarContaStance getInstance() {
        if (instancia == null) {
            instancia = new TelaAdicionarContaStance();
        }
        return instancia;
    }
}
