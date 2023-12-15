package logic.listener.numbers;

import GUI.MainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @CreateTime: 2022/5/22 17:41
 * @Author: AndyMa
 */
public class zero implements ActionListener {
    //JTextArea area = MainFrame.textarea;
    @Override
    public void actionPerformed(ActionEvent e) {
        MainFrame.textarea.append("0");
        MainFrame.textarea.remove(1);
    }
}
