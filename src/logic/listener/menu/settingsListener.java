package logic.listener.menu;

import GUI.MainFrame;
import GUI.buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @CreateTime: 2022/5/24 21:33
 * @Author: AndyMa
 */

public class settingsListener implements ActionListener {
    JFrame frame;
    String[] FontList;
    String[] StyleList;
    String[] ColorList;
    JPanel panel;
    JLabel setFont;
    JLabel setStyle;
    JLabel setColor;
    JList<String> font;
    JList<String> style;
    JList<String> color;
    JScrollPane f;
    JScrollPane s;
    JScrollPane c;
    public static final Map<String, Integer> map = new HashMap<>();
    public static final Map<String, Color> ColorMap = new HashMap<>();
    String fontSelection = null;
    String styleSelection = null;
    String colorSelection = null;
    int selection;
    /*
    File fontFile = new File("/Users/majie/AndyCalculator/src/res/Font_Style_Color.txt");
    static BufferedWriter writer_F;
    static BufferedWriter writer_S;
    static BufferedWriter writer_C;
    */

    @Override
    public void actionPerformed(ActionEvent e) {
        /*
        try {
            writer_F = new BufferedWriter(new FileWriter(fontFile));
            writer_S = new BufferedWriter(new FileWriter(fontFile));
            writer_C = new BufferedWriter(new FileWriter(fontFile));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        */

        frame = new JFrame("设置");
        frame.setSize(550, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        panel = new JPanel();
        FontList = new String[]{"SansSerif", "Serif", "DialogInput", "Dialog", "Monospaced"};
        StyleList = new String[] {"Plain", "Bold", "Italic", "Roman_Baseline", "Center_Baseline",
                "Hanging_Baseline", "TrueType_Font", "Type1_Font"};
        ColorList = new String[]{"Red", "Gray", "Dark_Gray", "Black", "Yellow", "Blue", "Green", "Pink"};

        setFont = new JLabel("设置字体:");
        setStyle = new JLabel("设置风格:");
        setColor = new JLabel("设置颜色:");

        map.put("Plain", Font.PLAIN);
        map.put("Bold", Font.BOLD);
        map.put("Italic", Font.ITALIC);
        map.put("Roman_Baseline", Font.ROMAN_BASELINE);
        map.put("Center_Baseline", Font.CENTER_BASELINE);
        map.put("Hanging_Baseline", Font.HANGING_BASELINE);
        map.put("TrueType_Font", Font.TRUETYPE_FONT);
        map.put("Type1_Font", Font.TYPE1_FONT);

        ColorMap.put("Red", Color.RED);
        ColorMap.put("Gray", Color.GRAY);
        ColorMap.put("Dark_Gray", Color.darkGray);
        ColorMap.put("Black", Color.BLACK);
        ColorMap.put("Yellow", Color.yellow);
        ColorMap.put("Blue", Color.blue);
        ColorMap.put("Green", Color.green);
        ColorMap.put("Pink", Color.pink);

        font = new JList<>(FontList);
        style = new JList<>(StyleList);
        color = new JList<>(ColorList);

        //字体
        font.setVisibleRowCount(FontList.length);
        font.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        font.addListSelectionListener(a -> {
            if(!a.getValueIsAdjusting()){
                fontSelection = font.getSelectedValue();

                for (int i = 0; i < FontList.length; i++) {
                    if (FontList[i].equals(fontSelection)){
                        font.setSelectedIndex(i);
                    }
                }

                //saveFont(fontSelection);

                setFont(fontSelection, selection, 30);
                MainFrame.textarea.setFont(Font.getFont(fontSelection));
                JDialog dialog = new JDialog();
                dialog.setTitle("Tip");
                dialog.setVisible(true);
                dialog.setLocation(200, 200);
                dialog.setSize(300, 100);
                JLabel label = new JLabel("已成功更换font为 : " + fontSelection);
                Container container = dialog.getContentPane();
                container.add(label);
                label.setHorizontalAlignment(SwingConstants.CENTER);
                System.out.println(fontSelection);
            }
        });

        //风格
        style.setVisibleRowCount(StyleList.length);
        style.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        style.addListSelectionListener(b -> {

            if(!b.getValueIsAdjusting()){
                styleSelection = style.getSelectedValue();

                for (int i = 0; i < StyleList.length; i++) {
                    if (StyleList[i].equals(styleSelection)){
                        style.setSelectedIndex(i);
                    }
                }

                selection = map.get(styleSelection);
                //saveStyle(styleSelection);

                setFont(fontSelection, selection, 30);
                JDialog dialog = new JDialog();
                dialog.setTitle("Tip");
                dialog.setVisible(true);
                dialog.setLocation(200, 200);
                dialog.setSize(300, 100);
                JLabel label = new JLabel("已成功更换style为 : " + styleSelection);
                Container container = dialog.getContentPane();
                container.add(label);
                label.setHorizontalAlignment(SwingConstants.CENTER);
                System.out.println(styleSelection);
            }
        });

        //颜色
        color.setVisibleRowCount(ColorList.length);
        color.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        color.addListSelectionListener(e1 -> {

            if (!e1.getValueIsAdjusting()) {
                colorSelection = color.getSelectedValue();
                for (int i = 0;i < ColorList.length; i++){
                    if(ColorList[i].equals(colorSelection)){
                        color.setSelectedIndex(i);
                    }
                }
                //saveColor(colorSelection);
                setColor(ColorMap.get(colorSelection));

                JDialog dialog = new JDialog();
                dialog.setTitle("Tip");
                dialog.setVisible(true);
                dialog.setLocation(200, 200);
                dialog.setSize(300, 100);
                JLabel label = new JLabel("已成功更换color为 : " + colorSelection);
                Container container = dialog.getContentPane();
                container.add(label);
                label.setHorizontalAlignment(SwingConstants.CENTER);
                System.out.println(colorSelection);
            }
        });

        f = new JScrollPane(font);
        s = new JScrollPane(style);
        c = new JScrollPane(color);

        f.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        f.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        f.setEnabled(true);
        f.setWheelScrollingEnabled(true);

        s.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        s.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        s.setEnabled(true);
        s.setWheelScrollingEnabled(true);

        c.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        c.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        c.setEnabled(true);
        c.setWheelScrollingEnabled(true);

        panel.setLayout(new FlowLayout());

        panel.add(setFont);
        panel.add(f);
        panel.add(setStyle);
        panel.add(s);
        panel.add(setColor);
        panel.add(c);
        frame.add(panel);
    }

    //other methods
    public void setColor(Color color){
        for (JButton button: buttons.buttons) {
            button.setForeground(color);
        }
    }

    public void setFont(String font, int style, int size){
        for (JButton button: buttons.buttons) {
            button.setFont(new Font(font, style, size));
        }
    }

    /**
    public void saveFont(String font){
        try {
            writer_F.write(font + ";");
            writer_F.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveStyle(String style){
        try {
            writer_S.write(style + ";");
            writer_S.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveColor(String color){
        try{
            writer_C.write(color + ";");
            writer_C.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
     */
}
