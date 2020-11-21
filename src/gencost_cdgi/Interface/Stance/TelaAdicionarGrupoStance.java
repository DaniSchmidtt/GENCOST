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
public class TelaAdicionarGrupoStance {
                private static TelaAdicionarGrupoStance instancia;
    public Stage stage = new Stage();

    private TelaAdicionarGrupoStance() {
    }

    public static synchronized TelaAdicionarGrupoStance getInstance() {
        if (instancia == null) {
            instancia = new TelaAdicionarGrupoStance();
        }
        return instancia;
    }
}
