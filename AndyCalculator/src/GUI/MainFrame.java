package GUI;

import logic.listener.menu.AboutListener;
import logic.listener.menu.settingsListener;

import javax.swing.*;
import java.awt.*;

/**
 * @CreateTime: 2022/5/18 20:08
 * @Author: AndyMa
 */
public class MainFrame extends JFrame{
    panel p = new panel();
    public static textarea textarea;

    static {
        try {
            textarea = new textarea(4, 20);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static final JMenu settings = new JMenu("设置");
    static final JMenuItem preferences = new JMenuItem("Preferences");
    static final JMenuItem his = new JMenuItem("Github中国仓库");
    static final JMenu history = new JMenu("About");
    static final JMenuBar bar = new JMenuBar();

    public void init() throws Exception {
        textarea = new textarea();
        p.init();
        textarea.init();
        setTitle("Andy's calculator");
        setSize(520, 760);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new BorderLayout());
        getContentPane().add(textarea, BorderLayout.NORTH);
        getContentPane().add(p, BorderLayout.CENTER);

        preferences.addActionListener(new settingsListener());
        his.addActionListener(new AboutListener());
        settings.add(preferences);
        history.add(his);

        bar.add(settings);
        bar.add(history);
        setJMenuBar(bar);
    }

    public MainFrame()throws Exception{
        init();
    }
}
