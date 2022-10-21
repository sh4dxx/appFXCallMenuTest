package com.example.demofxobservable;

import com.example.demofxobservable.models.MainModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuDosController {
    @javafx.fxml.FXML
    private Button btnMenuVolver;
    @javafx.fxml.FXML
    private Label welcomeText;

    @javafx.fxml.FXML
    public void btnMenuVolverClick(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("menuUno.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        VBox vBox = (VBox) ((Node) actionEvent.getSource()).getClip();

        //Scene scene = new Scene(root);
        //stage.setScene(scene);
        //stage.show();

        FXMLLoader fxmlLoaderHello = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Parent rootHello = fxmlLoaderHello.load();
        HelloController helloController = fxmlLoaderHello.getController();

        helloController.actualizaMenu();
    }
}
