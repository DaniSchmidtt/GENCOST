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
public class MensagemDeAlertaStance {

    private static MensagemDeAlertaStance instancia;
    public Stage stage = new Stage();
    public String mensagem;

    private MensagemDeAlertaStance() {
    }

    public static synchronized MensagemDeAlertaStance getInstance() {
        if (instancia == null) {
            instancia = new MensagemDeAlertaStance();
        }
        return instancia;
    }
}
