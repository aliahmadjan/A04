package com.example.evm;


import java.io.IOException;
import java.sql.SQLException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloController {
    @FXML
    private Label welcomeText;

    public HelloController() {
    }

    @FXML
    protected void onHelloButtonClick() throws ClassNotFoundException, SQLException, IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("sec-page.fxml"));
        new StackPane();
        Scene scene = new Scene((Parent)fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("VTM ");
        stage.show();
    }
}
