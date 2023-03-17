package com.example.demo;

import javax.swing.*;

public class MyPane {
    private static String[] message1 = new String[1];
    private static String message1(String nameDir, int fileQuantity1, String result)
    {
        String[] message90 = new String[1];
        message90[0] = nameDir+" папка\nКоличество файлов:"+ fileQuantity1 + "\nРазмер данных:"+result+"ГБ";
        return message90[0];
    }

    public static void panel(double filesize1 , int fileQuantity1 )
    {
        String[] nameDir = {"1) Первая","2) Вторая","3) Третья"};
        String result = String.format("%.3f",(filesize1/1073741824));
        message1[0] = "Первая папка\nКоличество файлов:"+ fileQuantity1 + "\nРазмер данных:"+result+"ГБ";

       JOptionPane.showMessageDialog(null,message1(nameDir[0],fileQuantity1,result)+"\n"+message1(nameDir[1],fileQuantity1,result)+"\n"+message1(nameDir[2],fileQuantity1,result), "Отчет о выполнений программы",JOptionPane.PLAIN_MESSAGE );
    }
}
