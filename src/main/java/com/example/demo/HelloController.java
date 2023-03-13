package com.example.demo;

/**
 * Sample Skeleton for 'hello-view.fxml' Controller Class
 */



import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.text.Text;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text freeVal;

    @FXML
    private Text freefile;

    @FXML
    private ToggleButton oneApplyButton;

    @FXML
    private TextField onePass;

    @FXML
    private Text oneVal;

    @FXML
    private Text onefile;

    @FXML
    private Button startButton;

    @FXML
    private ToggleButton threeApplyButton;

    @FXML
    private TextField threePass;

    @FXML
    private ToggleButton twoApplyButton;

    @FXML
    private TextField twoPass;

    @FXML
    private Text twoVal;

    @FXML
    private Text twofile;


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
            MyPane.panel();
        });

    }

}
