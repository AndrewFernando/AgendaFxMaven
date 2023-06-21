module com.example {
    exports com.example.Controlador;
    opens com.example.Controlador.view to javafx.fxml;
    requires javafx.controls;
    requires javafx.fxml;
    requires jasperreports;
}
