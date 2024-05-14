package logic.listener.other;

import GUI.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @CreateTime: 2022/7/17 23:10
 * @Author: AndyMa
 */
public class dot implements ActionListener {
    //JTextArea textArea = MainFrame.textarea;

    @Override
    public void actionPerformed(ActionEvent e) {
        MainFrame.textarea.append(".");
        MainFrame.textarea.remove(1);
    }
}
