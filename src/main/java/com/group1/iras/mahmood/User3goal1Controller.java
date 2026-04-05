package com.group1.iras.mahmood;

import com.group1.iras.BaseController;
import com.group1.iras.SceneSwitcher;
import javafx.event.ActionEvent;

import java.io.IOException;

public class User3goal1Controller extends BaseController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        switchTo("/com/group1/iras/mahmood/user3dashboard.fxml");
    }
}