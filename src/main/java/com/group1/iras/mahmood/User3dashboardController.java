package com.group1.iras.mahmood;

import com.group1.iras.BaseController;
import com.group1.iras.SceneSwitcher;
import javafx.event.ActionEvent;

import java.io.IOException;

public class User3dashboardController extends BaseController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void goal2(ActionEvent actionEvent) throws IOException {
        switchTo("/com/group1/iras/mahmood/user3goal2.fxml");
    }

    @javafx.fxml.FXML
    public void goal1(ActionEvent actionEvent) throws IOException{
        switchTo("/com/group1/iras/mahmood/user3goal1.fxml");
    }

}