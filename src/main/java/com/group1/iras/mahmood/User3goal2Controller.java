package com.group1.iras.mahmood;

import com.group1.iras.BaseController;
import com.group1.iras.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;

import java.io.IOException;
import java.util.Optional;

public class User3goal2Controller extends BaseController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        switchTo("/com/group1/iras/mahmood/user3dashboard.fxml");
    }

    @javafx.fxml.FXML
    public void logout(ActionEvent actionEvent) throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText("Are you sure you want to log out?");
        Optional<ButtonType> response = alert.showAndWait();
        if (response.isPresent()
            && response.get().getButtonData().equals(ButtonBar.ButtonData.OK_DONE)) {

            super.logout(actionEvent);
        }
    }
}