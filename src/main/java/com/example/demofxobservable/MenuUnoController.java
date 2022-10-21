package com.example.demofxobservable;

import com.example.demofxobservable.models.MainModel;
import com.example.demofxobservable.models.MenuModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.io.IOException;

import static com.example.demofxobservable.HelloController.menuModel;

public class MenuUnoController {
    @javafx.fxml.FXML
    private Button btnMenuOpciones;
    @javafx.fxml.FXML
    private Label welcomeText;

    //MenuModel menuModel = new MenuModel();
    @javafx.fxml.FXML
    public void btnMenuOpcionesClick(ActionEvent actionEvent) throws IOException {

        System.out.println("Menu Opciones");
//        System.out.println(menuModel);
//        menuModel.eliminaMenus();
//        System.out.println(menuModel);

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Parent root = fxmlLoader.load();
        HelloController helloController = fxmlLoader.getController();

        FXMLLoader fxlMenuDos = new FXMLLoader(HelloApplication.class.getResource("menuDos.fxml"));
        VBox vBoxMenuDos = fxlMenuDos.load();
//        HelloController helloController = new HelloController();
        helloController.actualizaMenu();
    }
}