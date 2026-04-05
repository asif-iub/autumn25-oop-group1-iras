module com.group1.iras {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.group1.iras to javafx.fxml;
    exports com.group1.iras;

    opens com.group1.iras.mahmood to javafx.fxml;
    exports com.group1.iras.mahmood;
}