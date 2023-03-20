package com.example.demo;

import javax.swing.*;

public class MyPane {
    private static String message1(String nameDir, int fileQuantity1, String result, String result1)
    {
        String[] message90 = new String[1];
        message90[0] = nameDir+" папка\nКоличество файлов:"+ fileQuantity1 + "\nРазмер данных:"+result+"ГБ" + "\n"+result1+ "КБ";
        return message90[0];
    }

    public static void panel(double filesize1 , int fileQuantity1, String nameDir )
    {
        String result = String.format("%.3f",(filesize1/1073741824));
        String result1 = String.format("%.3f",(filesize1/1024));

       JOptionPane.showMessageDialog(null,message1(nameDir,fileQuantity1,result,result1), "Отчет о выполнений программы",JOptionPane.PLAIN_MESSAGE);
    }
}
