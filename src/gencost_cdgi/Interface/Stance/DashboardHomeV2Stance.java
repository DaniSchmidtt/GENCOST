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
public class DashboardHomeV2Stance {
         private static DashboardHomeV2Stance instancia;
    public Stage stage = new Stage();

    private DashboardHomeV2Stance() {
    }

    public static synchronized DashboardHomeV2Stance getInstance() {
        if (instancia == null) {
            instancia = new DashboardHomeV2Stance();
        }
        return instancia;
    }
}
