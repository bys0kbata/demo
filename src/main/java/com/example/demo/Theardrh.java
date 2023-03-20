package com.example.demo;

import java.io.File;

import static com.example.demo.HelloController.fileQuantity;
import static com.example.demo.HelloController.fileSize;

public class Theardrh extends Thread {
    String Puth;
    public double MeanSize;
    public int Val;
    String nameDir;
    public Theardrh(String Puth, String nameDir) {
        this.Puth = Puth;
        this.nameDir = nameDir;
    }

    @Override
        public void run()
        {
            MethodFalseOrTrue man = new MethodFalseOrTrue();
            MeanSize = man.folderSize(new File(Puth));
            Val = man.folderQuantity(new File(Puth));
            System.out.println(MeanSize+"  "+ Val);
            MyPane.panel(MeanSize,Val,nameDir);
        }
    }

