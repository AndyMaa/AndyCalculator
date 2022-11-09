package logic.listener.numbers;

import GUI.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @CreateTime: 2022/5/22 17:41
 * @Author: AndyMa
 */
public class eight implements ActionListener {
    JTextArea area = MainFrame.textarea;
    @Override
    public void actionPerformed(ActionEvent e) {
        area.append("8");
        area.remove(1);
    }
}
