package GUI;

import logic.listener.numbers.*;
import logic.listener.other.*;
import javax.swing.*;
import java.awt.*;

/**
 * @CreateTime: 2022/5/18 20:22
 * @Author: AndyMa
 */

public class buttons {
    boolean i = false;
    //String style;
    //File fontFile = new File("/Users/majie/AndyCalculator/src/res/Font_Style_Color.txt");
    public static final JButton[] buttons = new JButton[20];
    static final JButton plus = new JButton("+");
    static final JButton divide = new JButton("/");
    static final JButton subtract = new JButton("-");
    static final JButton multiply = new JButton("*");
    static final JButton squares = new JButton("^");
    static final JButton cancel = new JButton("back");
    public static JButton equal = new JButton("=");
    static final JButton backZero = new JButton("AC");
    static final JButton zero = new JButton("0");
    static final JButton one = new JButton("1");
    static final JButton two = new JButton("2");
    static final JButton three = new JButton("3");
    static final JButton four = new JButton("4");
    static final JButton five = new JButton("5");
    static final JButton six = new JButton("6");
    static final JButton seven = new JButton("7");
    static final JButton eight = new JButton("8");
    static final JButton nine = new JButton("9");
    static final JButton dot = new JButton(".");
    static final JButton percent = new JButton("%");
    static final JButton sqrt = new JButton("√");

    public void init() throws Exception {
        i=true;
        buttons[11] = plus;
        buttons[2] = divide;
        buttons[7] = subtract;
        buttons[3] = multiply;
        buttons[15] = equal;
        buttons[0] = backZero;
        buttons[17] = zero;
        buttons[12] = one;
        buttons[13] = two;
        buttons[14] = three;
        buttons[8] = four;
        buttons[9] = five;
        buttons[10] = six;
        buttons[4] = seven;
        buttons[5] = eight;
        buttons[6] = nine;
        buttons[18] = dot;
        buttons[1] = percent;
        buttons[16] = sqrt;
        buttons[19] = cancel;

        plus.addActionListener(new plus());
        subtract.addActionListener(new minus());
        divide.addActionListener(new divide());
        sqrt.addActionListener(new Sqrt());
        equal.addActionListener(new equal());
        one.addActionListener(new one());
        two.addActionListener(new two());
        three.addActionListener(new three());
        four.addActionListener(new four());
        five.addActionListener(new five());
        six.addActionListener(new six());
        seven.addActionListener(new seven());
        eight.addActionListener(new eight());
        nine.addActionListener(new nine());
        zero.addActionListener(new zero());
        backZero.addActionListener(new backZero());
        multiply.addActionListener(new multiply());
        dot.addActionListener(new dot());
        percent.addActionListener(new percent());
        cancel.addActionListener(new back());

        for (JButton button : buttons){
            button.setFont(new Font("SansSerif", Font.ITALIC, 30));
            button.setBackground(Color.BLACK);
            button.setFocusable(false);
        }
        /**
        String getFont = getFont();
        for (JButton button: buttons) {
            button.setFont(new Font(getFont, getStyle(), 30));
            button.setBackground(settingsListener.ColorMap.get(getColor()));
        }

         **/
    }

    /**
    public String getFont(){
        String font = null;
        if (i) {
            try{
                if (fontFile.createNewFile() || fontFile.exists()){
                    BufferedReader reader = new BufferedReader(new FileReader(fontFile));
                    String read = reader.readLine();
                    String[] str = read.split(";");
                    for (String s : str){
                        if (settingsListener.map.containsKey(s)){
                            font = s;
                        }
                    }

                    /**String[] f = reader.readLine().split("\\+");
                    for (String fo:
                         f) {
                        if (settingsListener.map.containsKey(fo)){
                            font = fo;
                        }
                    }
                }else {
                    System.out.println("No such file");
                }
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
        return font;
    }
    */

    /**
    public int getStyle(){
        int intStyle = 0;
        if (i) {
            try {
                if (fontFile.createNewFile() || fontFile.exists()) {
                    style = getFont();
                    intStyle = settingsListener.map.get(style);
                }else {
                    System.out.println("No such file");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return intStyle;
    }

    public String getColor(){
        String color = null;
        if (i) {
            try{
                if (fontFile.createNewFile() || fontFile.exists()) {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(fontFile));
                    String read = bufferedReader.readLine();
                    String[] str = read.split(";");
                    for (String s : str) {
                        if (settingsListener.ColorMap.containsKey(s)){
                            color = s;
                        }
                    }
                }
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
        return color;
    }
    **/
    public buttons() throws Exception{
        init();
    }
}
