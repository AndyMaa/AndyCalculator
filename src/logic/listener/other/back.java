package logic.listener.other;

import GUI.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

/**
 * @CreateTime: 2022/7/23 22:56
 * @Author: AndyMa
 */
public class back implements ActionListener {
    JTextArea area = MainFrame.textarea;
    @Override
    public void actionPerformed(ActionEvent e){
        go();
    }

    public void go(){
        String str = area.getText();
        String[] array = str.split("");
        int length = array.length;

        String[] newArray = new String[length-1];

        for (int i = 0;i< newArray.length;i++){
            newArray[i] = array[i];
        }

        area.setText("");
        System.out.println(Arrays.toString(newArray));
        for (int j = 0;j<length;j++){
            area.append(newArray[j]);
        }
    }
}
