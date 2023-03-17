package com.example.demo;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField freeQueue;

    @FXML
    private ToggleButton oneApplyButton;

    @FXML
    private  TextField onePass;

    @FXML
    private TextField oneQueue;

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
    private TextField twoQueue;
    public double fileSize;
    public int fileQuantity;


    @FXML
    void initialize() {
        final String[] thirstPass = new String[1];
        final String[] secondPass = new String[1];
        final String[] thirdPass = new String[1];
        final String[] onQueue = new String[1];
        final String[] twQueue = new String[1];
        final String[] freQueue = new String[1];
        oneApplyButton.setOnAction(actionEvent -> {
            thirstPass[0] =onePass.getText();
            onQueue[0] = oneQueue.getText();
        });
        twoApplyButton.setOnAction(actionEvent -> {

            secondPass[0] =twoPass.getText();
            twQueue[0]=twoQueue.getText();
        });
        threeApplyButton.setOnAction(actionEvent -> {
            thirdPass[0] =threePass.getText();
            freQueue[0] = freeQueue.getText();
        });
        startButton.setOnAction(actionEvent -> {
            MethodFalseOrTrue man = new MethodFalseOrTrue();
            fileSize = man.folderSize(new File(thirstPass[0]));
            fileQuantity = man.folderQuantity(new File(thirstPass[0]));
            MyPane.panel(fileSize,fileQuantity);
        });

    }

}
