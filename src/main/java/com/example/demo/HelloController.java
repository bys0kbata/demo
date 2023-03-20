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
    public static double fileSize;
    public static int fileQuantity;
    static final String[] thirstPass = new String[1];
    final String[] secondPass = new String[1];
    final String[] thirdPass = new String[1];
    final String[] onQueue = new String[1];
    final String[] twQueue = new String[1];
    final String[] freQueue = new String[1];


    @FXML
    void initialize() {
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
            Theardrh mSecondThread = new Theardrh(thirstPass[0],"Первая");
            Theardrh mSecondThread1 = new Theardrh(secondPass[0],"Вторая");
            Theardrh mSecondThread2 = new Theardrh(thirdPass[0],"Третья");
            mSecondThread.setPriority(Integer.parseInt(onQueue[0]));
            mSecondThread1.setPriority(Integer.parseInt(twQueue[0]));
            mSecondThread2.setPriority(Integer.parseInt(freQueue[0]));
            mSecondThread.start();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            mSecondThread1.start();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            mSecondThread2.start();
        });
    }
}
