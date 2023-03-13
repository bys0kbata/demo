package com.example.demo;

/**
 * Sample Skeleton for 'hello-view.fxml' Controller Class
 */


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ToggleButton oneApplyButton;

    @FXML
    private TextField onePass;

    @FXML
    private Button startButton;

    @FXML
    private TableView<?> tableView;

    @FXML
    private ToggleButton threeApplyButton;

    @FXML
    private TextField threePass;

    @FXML
    private ToggleButton twoApplyButton;

    @FXML
    private TextField twoPass;

    @FXML
    void initialize() {
        final String[] thirstPass = new String[1];
        final String[] secondPass = new String[1];
        final String[] thirdPass = new String[1];
        oneApplyButton.setOnAction(actionEvent -> {
            thirstPass[0] =onePass.getText();
        });
        twoApplyButton.setOnAction(actionEvent -> {

            secondPass[0] =twoPass.getText();
        });
        threeApplyButton.setOnAction(actionEvent -> {
            thirdPass[0] =threePass.getText();
        });
        startButton.setOnAction(actionEvent -> {
            System.out.println(thirstPass[0]);
        });

    }

}
