package logic.listener.other;

import GUI.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @CreateTime: 2022/5/22 21:57
 * @Author: AndyMa
 */
public class radical implements ActionListener {
    //JTextArea area = MainFrame.textarea;
    @Override
    public void actionPerformed(ActionEvent e) {
        MainFrame.textarea.append("^");
        MainFrame.textarea.remove(1);
    }
}
