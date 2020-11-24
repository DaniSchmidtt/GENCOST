/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gencost_cdgi.Interface.Controlers;

import gencost_cdgi.Interface.Stance.MeusGruposStance;
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
import gencost_cdgi.Interface.Stance.DashboardHomeV2Stance;
import gencost_cdgi.Interface.Stance.TelaContasAbertasStance;
import gencost_cdgi.Interface.Stance.TelaEditarPerfilStance;
import gencost_cdgi.Interface.Stance.TelaHistoricoStance;
import gencost_cdgi.Interface.Stance.TelaLoginStance;
import gencost_cdgi.Interface.Thread.ThreaDa;
import gencost_cdgi.Views.Usuario;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Side;
import javafx.scene.control.Label;
import javafx.scene.chart.Axis;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.*;

/**
 * FXML Controller class
 *
 * @author caiod
 */
public class DashboardHomeV2Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    Label lblNome;
    @FXML
    Label lblemail;

    @FXML
    public BarChart bc;

    @FXML
    private PieChart pieChart;

    @FXML
    private void handleButtonActionMGP(ActionEvent event) throws IOException, InterruptedException {
        Parent root;

        try {
            root = FXMLLoader.load(getClass().getResource("/gencost_cdgi/Interface/MeusGrupos.fxml"));

            Scene mgp = new Scene(root);
            MeusGruposStance mgpS = null;
            mgpS = mgpS.getInstance();
            mgpS.stage.setScene(mgp);
            mgpS.stage.show();
            DashboardHomeV2Stance homeS = null;
            homeS = homeS.getInstance();
            homeS.stage.close();
        } catch (IOException ex) {
            Logger.getLogger(ThreaDa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void handleButtonActionHIST(ActionEvent event) throws IOException, InterruptedException {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("/gencost_cdgi/Interface/TelaHistorico.fxml"));

            Scene hist = new Scene(root);
            TelaHistoricoStance histS = null;
            histS = histS.getInstance();
            histS.stage.setScene(hist);
            histS.stage.show();
            DashboardHomeV2Stance homeS = null;
            homeS = homeS.getInstance();
            homeS.stage.close();
        } catch (IOException ex) {
            Logger.getLogger(ThreaDa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void handleButtonActionCTA(ActionEvent event) throws IOException, InterruptedException {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("/gencost_cdgi/Interface/TelaContasAbertas.fxml"));

            Scene cta = new Scene(root);
            TelaContasAbertasStance ctaS = null;
            ctaS = ctaS.getInstance();
            ctaS.stage.setScene(cta);
            ctaS.stage.show();
            DashboardHomeV2Stance homeS = null;
            homeS = homeS.getInstance();
            homeS.stage.close();
        } catch (IOException ex) {
            Logger.getLogger(ThreaDa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void handleButtonActionEDD(ActionEvent event) throws IOException, InterruptedException {
        Parent root;
        try {

            root = FXMLLoader.load(getClass().getResource("/gencost_cdgi/Interface/TelaEditarPerfil.fxml"));
            Scene edd = new Scene(root);
            TelaEditarPerfilStance eddS = null;
            eddS = eddS.getInstance();
            eddS.stage.setScene(edd);
            eddS.stage.show();
            Usuario usuario = null;
            usuario = usuario.getInstance();
            String usr = usuario.getNome();
            String email = usuario.getEmail();
            lblNome.setText(usr);
            lblemail.setText(email);

        } catch (IOException ex) {
            Logger.getLogger(ThreaDa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void handleButtonActionSAIR(ActionEvent event) throws IOException, InterruptedException {
        TelaLoginStance telaS = null;
        telaS = telaS.getInstance();
        telaS.stage.show();
        DashboardHomeV2Stance homeS = null;
        homeS = homeS.getInstance();
        homeS.stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Usuario usuario = null;
        usuario = usuario.getInstance();
        String usr = usuario.getNome();
        String email = usuario.getEmail();
        lblNome.setText(usr);
        lblemail.setText(email);

        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Pago");
        series1.getData().add(new XYChart.Data(austria, 100));
        series1.getData().add(new XYChart.Data(brazil, 250));
        series1.getData().add(new XYChart.Data(france, 200));
        series1.getData().add(new XYChart.Data(italy, 0));
        series1.getData().add(new XYChart.Data(usa, 0));

        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Saldo");
        series2.getData().add(new XYChart.Data(austria, 20));
        series2.getData().add(new XYChart.Data(brazil, 40));
        series2.getData().add(new XYChart.Data(france, 60));
        series2.getData().add(new XYChart.Data(italy, 20));
        series2.getData().add(new XYChart.Data(usa, 30));

        bc.getData().addAll(series1, series2);

        ObservableList<PieChart.Data> pieChartData
                = FXCollections.observableArrayList(
                        new PieChart.Data("TCC", 30),
                        new PieChart.Data("Trabalho", 20),
                        new PieChart.Data("Viagem Santos", 260),
                        new PieChart.Data("Contas Mensais", 290),
                        new PieChart.Data("Mercado", 120));
        pieChart.setData(pieChartData);
        pieChart.setTitle("");
        pieChart.setLabelLineLength(10);
        pieChart.setLegendSide(Side.LEFT);
        pieChart.setVisible(true);
        

    }

    final static String austria = "Mercado";
    final static String brazil = "Contas Mensais";
    final static String france = "Viagem Santos";
    final static String italy = "Trabalho";
    final static String usa = "TCC";

}
