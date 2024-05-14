package logic.listener.menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

/**
 * @CreateTime: 2022/8/8 19:40
 * @Author: AndyMa
 */

public class AboutListener extends JLabel implements ActionListener {
    JFrame frame;

    @Override
    public void actionPerformed(ActionEvent e) {
        frame = new JFrame("About author");
        frame.setSize(400, 100);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        JLabel label = new JLabel();
        label.setText("请多多支持作者吧！Thanks for your support!    ——AndyMa");
        //label.setText("请至\"AndyCalculator/src/logSep.txt查看\"\n（只保存最近一次的计算记录）");
        frame.getContentPane().add(label, BorderLayout.CENTER);

        try {
            if (Desktop.isDesktopSupported()){
                Desktop.getDesktop().browse(new URI("https://github.com/AndyMaa/AndyCalculator"));
                //Desktop.getDesktop().browse(new URI("https://github.com/AndyMaa/AndyCalculator/releases/tag/Andy"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        /**
        panel = new JPanel(new FlowLayout());

        panel.setBackground(Color.GRAY);
        panel.setVisible(true);
        scrollPane = new JScrollPane();
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setVisible(true);
        if (buttons.equal.isSelected()){
            String str = new textarea().getText();
            area = new JTextArea(4, 20);
            area.setText(str);
            area.setVisible(true);
        }
        panel.add(area);
        frame.add(panel);
         */
    }
}
