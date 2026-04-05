package com.group1.iras;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.IOException;

public class LoginController
{
    @javafx.fxml.FXML
    private TextField usernameField;
    @javafx.fxml.FXML
    private PasswordField passwordField;
    @javafx.fxml.FXML
    private Label label;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void login(ActionEvent actionEvent) throws IOException {
        if (usernameField.getText().equals("asif")
                && passwordField.getText().equals("1234")
        ) {
            label.setText("Log in successful");
            SceneSwitcher.switchTo("/com/group1/iras/mahmood/user3dashboard.fxml");
        }
        else
            label.setText("Log in failed");
    }
}