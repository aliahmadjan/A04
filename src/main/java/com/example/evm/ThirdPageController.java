package com.example.evm;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ThirdPageController {
    @FXML
    private Button BBtn;
    @FXML
    private Button EBtn;

    @FXML
    private TextField areaField;

    @FXML
    private TextField cnicField;

    @FXML
    private TextField nameField;

    @FXML
    private Button Hbtn;


    @FXML
    void EnterBtn(ActionEvent event) throws IOException
    {
        if(!areaField.getCharacters().toString().isEmpty() &&  !nameField.getCharacters().toString().isEmpty()
                && !cnicField.getCharacters().toString().isEmpty()) {


            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("fourth-page.fxml"));
            StackPane root = new StackPane();
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("VTM ");
            stage.show();



        }

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "flabbergast456");
            System.out.println("Connection Established");
            String sql = "INSERT INTO ap.voter_details (name,cnic,area) VALUES (?,?,?)";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1,nameField.getCharacters().toString());
            statement.setString(2,cnicField.getCharacters().toString());
            statement.setString(3,areaField.getCharacters().toString());

            int rowInserted = statement.executeUpdate();

            if(rowInserted> 0){
                System.out.println("Inserted into Oracle");
            }
        }catch(Exception e){
            System.out.println("Exception Thrown"+ e.getMessage());
        }
    }

    @FXML
    void HomeBtn(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        StackPane root = new StackPane();
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("VTM ");
        stage.show();
    }

    @FXML
    void BackBtn(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("sec-page.fxml"));
        StackPane root = new StackPane();
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("VTM ");
        stage.show();

    }
}