package logic.listener.other;

import GUI.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @CreateTime: 2022/7/17 23:13
 * @Author: AndyMa
 */
public class percent implements ActionListener {
    JTextArea area = MainFrame.textarea;

    @Override
    public void actionPerformed(ActionEvent e) {
        int length = area.getText().length();
        if (length>2){
            area.insert(".", length-2);
            area.remove(length-2);
        }else {
            if (length==1){
                String str = area.getText();
                area.setText("0.0"+str);
                area.remove(1);
            }
            if (length==2){
                String str = area.getText();
                area.setText("0."+str);
                area.remove(1);
            }
        }
    }
}
