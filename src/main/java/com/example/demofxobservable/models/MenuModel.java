package com.example.demofxobservable.models;

import com.example.demofxobservable.HelloApplication;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableSet;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MenuModel {

    private ObservableList<VBox> menus;

    public MenuModel(){
        this.menus = FXCollections.observableArrayList();
    }

    public ObservableList<VBox> getMenus() {
        return menus;
    }

    public void cargaMenus() throws IOException {

        List<VBox> vBoxMenus = new ArrayList<>();
//        FXMLLoader fxmlLoader = new FXMLLoader();
//        fxmlLoader.setLocation(HelloApplication.class.getResource("menuUno.fxml"));
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("menuUno.fxml"));
        VBox vBoxUno = fxmlLoader.load();

        vBoxMenus.add(vBoxUno);

        this.menus.clear();
        this.menus.addAll(vBoxMenus);
    }

    public void eliminaMenus(){
        this.menus.clear();
    }

    public void delete(VBox vbMenu) {
        this.menus.remove(vbMenu);
    }

    public void insert(VBox vbMenu) {
        this.menus.add(vbMenu);
    }

    @Override
    public String toString() {
        return "{" +
                "menus=" + menus +
                '}';
    }
}
