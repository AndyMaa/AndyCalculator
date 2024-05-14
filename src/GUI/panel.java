package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * @CreateTime: 2022/5/18 20:11
 * @Author: AndyMa
 */

public class panel extends JPanel {
    JButton[] button = buttons.buttons;

    public void init() throws Exception {
        new buttons().init();
        setLayout(new GridLayout(5, 4, 5, 5));
        setBackground(Color.GRAY);
        setVisible(true);
        setSize(520, 760);
        for (JButton button : button) {
            if (button != null) {
                add(button);
            } else {
                System.out.println("null!");
            }
        }
    }

    public panel()throws Exception{
        init();
    }
}
