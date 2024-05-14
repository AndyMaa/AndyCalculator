package logic.listener.numbers;

import GUI.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @CreateTime: 2022/5/22 17:39
 * @Author: AndyMa
 */
public class three implements ActionListener {
    //JTextArea area = MainFrame.textarea;
    @Override
    public void actionPerformed(ActionEvent e) {
        MainFrame.textarea.append("3");
        MainFrame.textarea.remove(1);
    }
}
