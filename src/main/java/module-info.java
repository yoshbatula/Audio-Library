module org.example.audiolibrary {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens org.example.audiolibrary to javafx.fxml;
    exports org.example.audiolibrary;
}