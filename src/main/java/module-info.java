module com.example {
    exports com.example.Controlador;
    exports com.example.Controlador.view to javafx.fxml;
    opens com.example.Controlador.view to javafx.fxml;
    requires javafx.controls;
    requires javafx.fxml;
}
