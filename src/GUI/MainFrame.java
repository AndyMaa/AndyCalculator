package GUI;

import logic.listener.menu.AboutListener;
import logic.listener.menu.History_Listener;
import logic.listener.menu.MyKeyListener;
import logic.listener.menu.settingsListener;

import javax.swing.*;
import java.awt.*;

/**
 * @CreateTime: 2022/5/18 20:08
 * @Author: AndyMa
 */
public class MainFrame extends JFrame {
    public static MainFrame instance;

    panel p = new panel();
    public static textarea textarea;

    static final JMenu settings = new JMenu("设置");
    static final JMenuItem preferences = new JMenuItem("Preferences");
    static final JMenuItem repo = new JMenuItem("Github中国仓库");
    static final JMenu history = new JMenu("About");
    static final JMenuBar bar = new JMenuBar();

    static final JMenuItem his = new JMenuItem("计算历史");

    public void init() throws Exception {
        instance=this;
        textarea = new textarea();
        p.init();
        textarea.init();
        addKeyListener(new MyKeyListener());
        /*addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                System.out.println("get");
            }

            @Override
            public void focusLost(FocusEvent e) {
                System.out.println("lost");
            }
        });**/
        setTitle("Andy's calculator");
        setSize(520, 760);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        setLayout(new BorderLayout());
        getContentPane().add(textarea, BorderLayout.NORTH);
        getContentPane().add(p, BorderLayout.CENTER);

        preferences.addActionListener(new settingsListener());
        repo.addActionListener(new AboutListener());
        his.addActionListener(new History_Listener());
        settings.add(preferences);
        history.add(repo);
        history.add(his);


        bar.add(settings);
        bar.add(history);
        setJMenuBar(bar);
    }

    public MainFrame()throws Exception{
        init();
    }
}
