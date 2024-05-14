package GUI;

import javax.swing.*;
import logic.listener.other.*;

/**
 * @CreateTime: 2022/5/19 20:28
 * @Author: AndyMa
 */

public class textarea extends JTextArea {
    equal e = new equal();
    String[] str1 = getText().split("\\+");
    String[] str2 = getText().split("-");
    String[] str3 = getText().split("\\*");
    String[] str4 = getText().split("/");
    String[] str5 = getText().split("√");
    String[] str6 = getText().split("%");

    public void init(){
        setEnabled(true);
        setEditable(false);
        setVisible(true);
        setLineWrap(true);
        setFocusable(false);
        control();
    }

    public textarea(int rows, int columns) throws Exception {
        super(rows, columns);
    }

    public textarea() throws Exception {}

    public void control(){
        if(str1.length == 2||str2.length==2||str3.length==2||str4.length==2||str5.length==2||str6.length==2){
            setEnabled(false);
            setEditable(false);

            /**for (JButton button : buttons.buttons){
             * if (button.isSelected()){
             *      append(getText().replace(button.getText(), ""));
             *      this.repaint();
             *     }
             * }*/
        }
    }
}
