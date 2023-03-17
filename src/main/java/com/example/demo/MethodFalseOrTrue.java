package com.example.demo;

import java.io.File;

public class MethodFalseOrTrue {

    public long folderSize(File directory) {
        long length = 0;
        for (File file : directory.listFiles()) {
            if (file.isFile())
            {
                length += file.length();
            }
            else
            {
                length += folderSize(file);
            }
        }
        return length;
    }
    public int folderQuantity(File directory) {
        int count = 0;
        for (File file : directory.listFiles())
        {
            if (file.isFile())
            {
                count ++;
            }
            else
            {
                count += folderQuantity(file);
            }
        }
        return count;
    }
}
