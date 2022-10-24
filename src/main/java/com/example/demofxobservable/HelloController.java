package com.example.demofxobservable;

import com.example.demofxobservable.models.MainModel;
import com.example.demofxobservable.models.MenuModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private VBox vboxContenidos;

    @FXML
    private ListView llisViewCosas;

    private MainModel mainModel = new MainModel();
//    private MenuModel menuModel = new MenuModel();
    public static MenuModel menuModel;
    @FXML
    private Button btnAccion;
    @FXML
    private Button btnAccion2;
    @FXML
    private StackPane boxStackPane;
    @FXML
    private Button btnAddBox;
    @FXML
    private Label welcomeText1;
    @FXML
    private Button btnMenuVolver;
    @FXML
    private Label welcomeText;
    @FXML
    private VBox vBoxMenuDos;
    @FXML
    private VBox vBoxMenuUno;
    @FXML
    private Button btnMenuDos;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        vBoxMenuUno.setVisible(true);
        vBoxMenuDos.setVisible(false);
    }

    @FXML
    public void btnAccionClick(ActionEvent actionEvent) {

    }

    @FXML
    public void btnAccion2Click(ActionEvent actionEvent) throws IOException {

    }

    @FXML
    public void btnAddBoxClick(ActionEvent actionEvent) throws IOException {

    }

    @FXML
    public void btnMenuDosClick(ActionEvent actionEvent) {
         vBoxMenuUno.setVisible(false);
         vBoxMenuDos.setVisible(true);
    }

    @FXML
    public void btnVolverMenuUnoClick(ActionEvent actionEvent) {
        vBoxMenuDos.setVisible(false);
        vBoxMenuUno.setVisible(true);
    }
}