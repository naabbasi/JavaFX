package com.qterminals.demo.controllers;

import com.qterminals.demo.scenes.DashboardScene;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {
    @FXML
    private TextField txtUsername;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private Button btnLogin;

    @FXML
    private void onLoginClick(ActionEvent actionEvent) {
        System.out.println("txtUsername.getText() = " + txtUsername.getText());
        System.out.println("txtPassword.getText() = " + txtPassword.getText());

        Scene parentScene = ((Node) actionEvent.getSource()).getScene();
        Stage loginStage = (Stage) parentScene.getWindow();

        loginStage.hide();

        DashboardScene.switchToDashboard(loginStage);

        if("admin".equalsIgnoreCase(txtUsername.getText()) && "x".equalsIgnoreCase(txtPassword.getText())){

        }
    }
}