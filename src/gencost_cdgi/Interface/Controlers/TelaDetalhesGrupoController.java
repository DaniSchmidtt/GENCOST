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
import gencost_cdgi.Views.HistoricoPagamentotable;
import gencost_cdgi.Views.MembrosTable;
import gencost_cdgi.Views.Usuario;
import java.io.IOException;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

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
    private TableView<HistoricoPagamentotable> HistPagtable;
    
    @FXML
    private TableColumn<HistoricoPagamentotable, String> usuariocol;
    
    @FXML
    private TableColumn<HistoricoPagamentotable, Double> pagamentocol;
    
    @FXML
    private TableColumn<HistoricoPagamentotable, String> contacol;
    
    @FXML
    private TableColumn<HistoricoPagamentotable, String> datacol;
    
    @FXML
    private TableView<MembrosTable> Membrotable;
    
    @FXML
    private TableColumn<MembrosTable, String> ussusuariocol;
    
    @FXML
    private TableColumn<MembrosTable, String> ussnomecol;
    
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
            
            TelaDetalhesGrupoStance ctaS = null;
            ctaS = ctaS.getInstance();
            Business usrvalida = new Business();
            ArrayList<String> valida = usrvalida.pesquisaUser(emailusr.getText());
            usrvalida.AdicionarUsrGrupo(Integer.valueOf(valida.get(0)), ctaS.grupoId);
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
        
        usuariocol.setCellValueFactory(new PropertyValueFactory<>("usuario"));
        pagamentocol.setCellValueFactory(new PropertyValueFactory<>("pagamento"));
        contacol.setCellValueFactory(new PropertyValueFactory<>("conta"));
        datacol.setCellValueFactory(new PropertyValueFactory<>("data"));
        
        HistPagtable.setItems(listaDePagamentos());
        
        ussusuariocol.setCellValueFactory(new PropertyValueFactory<>("ussusuario"));
        ussnomecol.setCellValueFactory(new PropertyValueFactory<>("ussnome"));
        
        Membrotable.setItems(listaMembros());
        
    }
    
    private ObservableList<HistoricoPagamentotable> listaDePagamentos() {
        return FXCollections.observableArrayList(
                new HistoricoPagamentotable("Danilo", 22.90, "Carne", "23-11-20"),
                new HistoricoPagamentotable("Caio", 34.90, "Carne", "20-11-20"),
                new HistoricoPagamentotable("Clayton", 60.90, "Carne", "29-11-20"),
                new HistoricoPagamentotable("Vitor", 12.90, "Carne", "12-11-20")
        );
    }
    
    private ObservableList<MembrosTable> listaMembros() {
        Business usersgrupo = new Business(); 
                TelaDetalhesGrupoStance ctaS = null;
        ctaS = ctaS.getInstance();
        return FXCollections.observableArrayList(usersgrupo.SelecionaUsuariosGrupo(ctaS.grupoId)
        );
    }
    
}
