/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gencost_cdgi.Interface.Stance;

import javafx.stage.Stage;

/**
 *
 * @author danil
 */
public class TelaAdcionarPagamentoStance {
    
    private static TelaAdcionarPagamentoStance instancia;
    public Stage stage = new Stage();

    private TelaAdcionarPagamentoStance() {
    }

    public static synchronized TelaAdcionarPagamentoStance getInstance() {
        if (instancia == null) {
            instancia = new TelaAdcionarPagamentoStance();
        }
        return instancia;
    }
    
}
