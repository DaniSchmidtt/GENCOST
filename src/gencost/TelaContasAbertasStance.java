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
public class TelaContasAbertasStance {
        private static TelaContasAbertasStance instancia;
    public Stage stage = new Stage();

    private TelaContasAbertasStance() {
    }

    public static synchronized TelaContasAbertasStance getInstance() {
        if (instancia == null) {
            instancia = new TelaContasAbertasStance();
        }
        return instancia;
    }
}
