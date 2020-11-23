/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gencost_cdgi.Interface.Controlers;

import gencost_cdgi.Business.Business;
import gencost_cdgi.Interface.Stance.MensagemDeAlertaStance;
import gencost_cdgi.Interface.Stance.TelaAdicionarGrupoStance;
import gencost_cdgi.Interface.Stance.TelaDeCadastroStance;
import gencost_cdgi.Interface.Stance.TelaLoginStance;
import gencost_cdgi.Interface.Thread.ThreaDa;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author caiod
 */
public class TelaAdicionarGrupoController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    public TextField txtgrupo;
    @FXML
    public RadioButton rb1;
    @FXML
    public RadioButton rb2;
    @FXML
    public RadioButton rb3;
    @FXML
    public RadioButton rb4;

    @FXML
    private void handleButtonActionADDGRP(ActionEvent event) throws IOException, InterruptedException {

        if (txtgrupo.getText().trim().equals("")) {
            ThreaDa thread = new ThreaDa();
            MensagemDeAlertaStance mensagem = null;
            mensagem = mensagem.getInstance();
            mensagem.mensagem = ("Preencha o nome do grupo!");
            thread.run();
        } else {
            Business Criargrupo = new Business();
            if (rb1.isSelected()) {
                Criargrupo.Criargrupo(txtgrupo.getText(), "gencost_cdgi/Interface/Images/colaboracao.png");
            } else if (rb2.isSelected()) {
                Criargrupo.Criargrupo(txtgrupo.getText(), "gencost_cdgi/Interface/Images/cost.png");
            } else if (rb3.isSelected()) {
                Criargrupo.Criargrupo(txtgrupo.getText(), "gencost_cdgi/Interface/Images/leader.png");
            } else if (rb4.isSelected()) {
                Criargrupo.Criargrupo(txtgrupo.getText(), "gencost_cdgi/Interface/Images/summer.png");
            }
            ThreaDa thread = new ThreaDa();
            MensagemDeAlertaStance mensagem = null;
            mensagem = mensagem.getInstance();
            mensagem.mensagem = ("Grupo Salvo!");
            thread.run();
            TelaAdicionarGrupoStance telaaddgrupo = null;
            telaaddgrupo = telaaddgrupo.getInstance();
            telaaddgrupo.stage.close();

        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }

}
