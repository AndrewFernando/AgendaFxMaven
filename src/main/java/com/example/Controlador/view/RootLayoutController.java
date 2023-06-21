package com.example.Controlador.view;

import com.example.Controlador.MainApp;

import javafx.fxml.FXML;

/**
 * The controller for the root layout. The root layout provides the basic
 * application layout containing a menu bar and space where other JavaFX
 * elements can be placed.
 * 
 * @author Marco Jakob
 */
public class RootLayoutController {
    private MainApp mainApp;

    // Constructor
    public RootLayoutController() {
        // Inicializar mainApp
        this.mainApp = new MainApp();
    }

    // Otro método de configuración
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
    @FXML
    private void handleShowBirthdayStatistics() {
        mainApp.showBirthdayStatistics();
    }

    @FXML
    private void handleExit() {
        System.exit(0);
    }
}