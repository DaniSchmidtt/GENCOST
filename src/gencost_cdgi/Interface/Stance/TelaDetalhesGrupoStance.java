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
public class TelaDetalhesGrupoStance {

    private static TelaDetalhesGrupoStance instancia;
    public int grupoId;
    public String nomegrupo;
    public Stage stage = new Stage();

    private TelaDetalhesGrupoStance() {
    }

    public static synchronized TelaDetalhesGrupoStance getInstance() {
        if (instancia == null) {
            instancia = new TelaDetalhesGrupoStance();
        }
        return instancia;
    }
}
