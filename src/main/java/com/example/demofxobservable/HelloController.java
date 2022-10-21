package com.example.demofxobservable;

import com.example.demofxobservable.models.MainModel;
import com.example.demofxobservable.models.MenuModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
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


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("menuUno.fxml"));
            VBox vBoxUno = fxmlLoader.load();
            vboxContenidos.getChildren().add(vBoxUno);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void actualizaMenu() throws IOException {

        //menuModel.eliminaMenus();
        //this.vboxContenidos = new VBox();
        //this.vboxContenidos = (VBox) vboxContenidos.getChildren();
        //FXMLLoader fxlMenuDos = new FXMLLoader(HelloApplication.class.getResource("menuDos.fxml"));
        //VBox vBoxMenuDos = fxlMenuDos.load();

        vboxContenidos.getChildren().removeAll(vboxContenidos);
//        vboxContenidos.getChildren().removeAll(vboxContenidos.getChildren());
//        vboxContenidos.getChildren().add(vBoxMenuDos);
    }

    @FXML
    public void btnAccionClick(ActionEvent actionEvent) {
        vboxContenidos.getChildren().removeAll(vboxContenidos.getChildren());
    }

    @FXML
    public void btnAccion2Click(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxlMenuDos = new FXMLLoader(HelloApplication.class.getResource("menuDos.fxml"));
        VBox vBoxMenuDos = fxlMenuDos.load();
        vboxContenidos.getChildren().removeAll(vboxContenidos.getChildren());
        vboxContenidos.getChildren().add(vBoxMenuDos);
    }
}