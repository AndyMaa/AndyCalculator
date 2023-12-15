package logic.listener.other;

import GUI.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @CreateTime: 2022/9/14 21:18
 * @Author: AndyMa
 */
public class Sqrt implements ActionListener {
    //JTextArea area = MainFrame.textarea;

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = MainFrame.textarea.getText();
        int n = Integer.parseInt(str);
        MainFrame.textarea.setText(String.valueOf(Math.sqrt(n)));
    }
}
