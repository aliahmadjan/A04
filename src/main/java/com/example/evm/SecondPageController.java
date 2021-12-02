package com.example.evm;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SecondPageController {

    @FXML
    private Button BBBtn;

    @FXML
    private Button FzlBtn;

    @FXML
    private Button IKBtn;

    @FXML
    private Button SSBtn;

    @FXML
    private Button BBtn;


    @FXML
    void BilawalBtn(ActionEvent event) throws IOException {



        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "flabbergast456");
            System.out.println("Connection Established");
            String sql = "INSERT INTO ap.candidate (cand_name) VALUES (?)";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, "Ali");
            int rowInserted = statement.executeUpdate();
            if (rowInserted > 0) {
                System.out.println("Inserted into Oracle");
            }
        } catch (Exception var6) {
            System.out.println("Exception Thrown" + var6.getMessage());
        }


        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("third-page.fxml"));
        StackPane root=new StackPane();
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage=new Stage();
        stage.setScene(scene);
        stage.setTitle("VTM ");
        stage.show();
    }


    @FXML
    void FazalBtn(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("third-page.fxml"));

        StackPane root=new StackPane();
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage=new Stage();
        stage.setScene(scene);
        stage.setTitle("VTM ");
        stage.show();

    }

    @FXML
    void ImranKhanBtn(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("third-page.fxml"));
        StackPane root=new StackPane();
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage=new Stage();
        stage.setScene(scene);
        stage.setTitle("VTM ");
        stage.show();

    }

    @FXML
    void ShahbazBtn(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("third-page.fxml"));
        StackPane root=new StackPane();
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage=new Stage();
        stage.setScene(scene);
        stage.setTitle("VTM ");
        stage.show();

    }


    @FXML
    void BackBtn(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        StackPane root = new StackPane();
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("VTM ");
        stage.show();

    }



}
