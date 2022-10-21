package com.example.demofxobservable;

import com.example.demofxobservable.models.MainModel;
import com.example.demofxobservable.models.Person;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @javafx.fxml.FXML
    private Button btnClickMe;
    @javafx.fxml.FXML
    private Label lblName;
    @javafx.fxml.FXML
    private ListView lstNames;

    private MainModel mainModel = new MainModel();
    @javafx.fxml.FXML
    private Button btnDelete;
    @javafx.fxml.FXML
    private Button btnInsert;
    @javafx.fxml.FXML
    private Button btnUpdate;
    @javafx.fxml.FXML
    private TextField txtInsert;
    @javafx.fxml.FXML
    private TextField txtUpdate;

    @javafx.fxml.FXML
    private void btnClickMe(ActionEvent actionEvent) {
        lblName.setText("HELLO!!");
        mainModel.loadFromDB();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lstNames.setItems(mainModel.getNames());
    }

    @javafx.fxml.FXML
    private void btnInsertClick(ActionEvent actionEvent) {
        Person person = new Person(txtInsert.getText());
        mainModel.insert(person);
        txtInsert.setText("");
    }

    @javafx.fxml.FXML
    private void btnDeleteClick(ActionEvent actionEvent) {
        Person person = (Person) lstNames.getSelectionModel().getSelectedItem();
        mainModel.delete(person);
    }

    @javafx.fxml.FXML
    private void btnUpdateClick(ActionEvent actionEvent) {
        Person personSelected = (Person) lstNames.getSelectionModel().getSelectedItem();
        personSelected.setName(txtUpdate.getText());
//        txtUpdate.setText(personOne.getName());

    }
}