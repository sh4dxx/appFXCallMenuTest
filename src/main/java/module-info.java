module com.example.demofxobservable {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demofxobservable to javafx.fxml;
    exports com.example.demofxobservable;
}