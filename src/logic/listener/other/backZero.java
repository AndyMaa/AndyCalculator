package logic.listener.other;

import GUI.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @CreateTime: 2022/5/22 17:52
 * @Author: AndyMa
 */
public class backZero implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        go();
    }

    public void go(){
        MainFrame.textarea.setText("");
    }
}
