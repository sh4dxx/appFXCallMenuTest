package com.example.demofxobservable;

import com.example.demofxobservable.models.MainModel;
import com.example.demofxobservable.models.MenuModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static com.example.demofxobservable.HelloController.menuModel;

public class MenuUnoController implements Initializable {
    @javafx.fxml.FXML
    private Button btnMenuOpciones;
    @javafx.fxml.FXML
    private Label welcomeText;

    //MenuModel menuModel = new MenuModel();
    @javafx.fxml.FXML
    public void btnMenuOpcionesClick(ActionEvent actionEvent) throws IOException {

        System.out.println("llamar a menuDos");
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Parent root = fxmlLoader.load();
//        HelloController helloController = fxmlLoader.getController();
//
//        FXMLLoader fxlMenuDos = new FXMLLoader(HelloApplication.class.getResource("menuDos.fxml"));
//        VBox vBoxMenuDos = fxlMenuDos.load();
//        helloController.actualizaMenu(vBoxMenuDos);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("inicio");
//
//        btnMenuOpciones.setOnMouseClicked(mouseEvent -> {
//
//            try {
//
//                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//                Parent root = fxmlLoader.load();
//                HelloController helloController = fxmlLoader.getController();
//                helloController.eliminaMenu();
//
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//
//        });


    }
}