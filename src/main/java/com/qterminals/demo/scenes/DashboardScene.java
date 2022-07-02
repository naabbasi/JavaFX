package com.qterminals.demo.scenes;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardScene {
    public static void switchToDashboard(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(DashboardScene.class.getResource("/com/qterminals/demo/dashboard-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("QTerminals - Dashboard");
            stage.setScene(scene);
            stage.setFullScreen(false);
            stage.setResizable(true);
            stage.show();
        } catch (IOException ioException){
            ioException.printStackTrace();
        }
    }
}
