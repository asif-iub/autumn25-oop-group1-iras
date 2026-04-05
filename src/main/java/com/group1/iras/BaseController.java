package com.group1.iras;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class BaseController {
    @javafx.fxml.FXML
    public void logout(ActionEvent actionEvent) throws IOException {
        System.out.println("logout method from the BaseController class");

        switchTo("/com/group1/iras/login.fxml");
    }

    public void switchTo(String fxml) throws IOException{
        Parent root = FXMLLoader.load(HelloApplication.class.getResource(fxml));
        Scene scene = new Scene(root);
        HelloApplication.stage.setScene(scene);
    }
}
