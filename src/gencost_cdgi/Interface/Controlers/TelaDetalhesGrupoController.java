/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gencost_cdgi.Interface.Controlers;

import gencost_cdgi.Business.Business;
import gencost_cdgi.Interface.Stance.MensagemDeAlertaStance;
import gencost_cdgi.Interface.Stance.TelaDeCadastroStance;
import gencost_cdgi.Interface.Stance.TelaDetalhesGrupoStance;
import gencost_cdgi.Interface.Thread.ThreaDa;
import gencost_cdgi.Views.Usuario;
import java.io.IOException;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author caiod
 */
public class TelaDetalhesGrupoController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    public TextField txtemail;
    @FXML
    private Label lblemail;

    @FXML
    private Label lblnome;

    @FXML
    private Label emailusr;

    @FXML
    private Label nomeusr;
    @FXML
    private Label lblnomegrupo;

    @FXML
    private void handleButtonActionPESQ(ActionEvent event) throws IOException, InterruptedException {
        if (txtemail.getText().trim().equals("")) {
            ThreaDa thread = new ThreaDa();
            MensagemDeAlertaStance mensagem = null;
            mensagem = mensagem.getInstance();
            mensagem.mensagem = ("Preencha o e-mail primeiro!");
            thread.run();
        } else {
            Business usrvalida = new Business();
            ArrayList<String> valida = usrvalida.pesquisaUser(txtemail.getText());
            if (valida.size() > 0) {
                lblemail.setVisible(true);
                lblnome.setVisible(true);
                emailusr.setVisible(true);
                nomeusr.setVisible(true);
                emailusr.setText(valida.get(1));
                nomeusr.setText(valida.get(2));
            } else {
                lblemail.setVisible(false);
                lblnome.setVisible(false);
                emailusr.setVisible(false);
                nomeusr.setVisible(false);
                ThreaDa thread = new ThreaDa();
                MensagemDeAlertaStance mensagem = null;
                mensagem = mensagem.getInstance();
                mensagem.mensagem = ("Usuario não encontrado!");
                thread.run();
            }

        }

    }

    @FXML
    private void handleButtonActionSalvar(ActionEvent event) throws IOException, InterruptedException {
        Usuario usr = null;
        usr = usr.getInstance();
        if (emailusr.getText().trim().equals("")) {
            ThreaDa thread = new ThreaDa();
            MensagemDeAlertaStance mensagem = null;
            mensagem = mensagem.getInstance();
            mensagem.mensagem = ("Pesquise um usuario valido primeiro");
            thread.run();
        } else if (emailusr.getText().equals(usr.getEmail())) {
            ThreaDa thread = new ThreaDa();
            MensagemDeAlertaStance mensagem = null;
            mensagem = mensagem.getInstance();
            mensagem.mensagem = ("Este é o seu e-mail!");
            thread.run();

        } else {
            Business usrvalida = new Business();
            ArrayList<String> valida = usrvalida.pesquisaUser(emailusr.getText());
            usrvalida.AdicionarUsrGrupo(Integer.valueOf(valida.get(0)), 1);
            ThreaDa thread = new ThreaDa();
            MensagemDeAlertaStance mensagem = null;
            mensagem = mensagem.getInstance();
            mensagem.mensagem = ("Usuario adicionado");
            thread.run();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        TelaDetalhesGrupoStance ctaS = null;
        ctaS = ctaS.getInstance();
        lblnomegrupo.setText(ctaS.nomegrupo);

    }

}
