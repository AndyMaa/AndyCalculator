package logic.listener.other;

import GUI.MainFrame;
import GUI.textarea;
import Other_functions.Calculate_history;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @CreateTime: 2022/5/22 21:28
 * @Author: AndyMa
 */

public class equal implements ActionListener {
    public static boolean flag;
    textarea area = MainFrame.textarea;
    public static Date d;  //当前时间
    public equal() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str=area.getText();
        add();
        minus();
        multiply();
        divide();

        String str2=area.getText();
        //保存
        if (str==str2){
            flag=false;
        }else{
            flag=true;
        }
        save(str,str2);
    }

    /**
    public void log() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            //reader = new BufferedReader(new FileReader(file));
            writer.write(simpleDateFormat.format(date) + ":" + " " + area.getText());
            writer.newLine();
            writer.flush();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

     */
    public void add(){
        int sum = 0;
        float start = 0;
        for (int i = 0; i < area.getText().length(); i++) {
            if(area.getText().split("")[i].equals("+")){
                //log();

                String[] add = area.getText().split("\\+");
                for (String s : add) {
                    if (s.contains(".")){
                        start += Float.parseFloat(s);
                    }else {
                        sum += Integer.parseInt(s);
                    }
                    area.setText(String.valueOf(sum+start));
                }
            }
        }
    }

    public void minus(){
        int sum = 0;
        int start = 0;
        float start1 = 0;
        float num = 0;
        for (int i = 0; i < area.getText().length(); i++) {
            if(area.getText().split("")[i].equals("-")){
                //log();

                String[] minus = area.getText().split("-");
                for (int j = 0; j<minus.length;j++) {
                    if (minus[j].contains(".")) {
                        num -= Float.parseFloat(minus[j]);
                        if (minus[0].contains(".")) {
                            start1 = Float.parseFloat(minus[0]);
                            //area.setText(String.valueOf(num+2*start1+sum));
                        }
                    } else {
                        if (!minus[0].contains(".")){
                            start = Integer.parseInt(minus[0]);
                            sum -= Integer.parseInt(minus[j]);
                            //area.setText(String.valueOf(start+num));
                        }else {
                            if (!minus[j].contains(".")){
                                sum -= Integer.parseInt(minus[j]);
                            }
                        }
                        //area.setText(String.valueOf(sum+2*start));
                    }
                    area.setText(String.valueOf(sum+2*start+2*start1+num));
                }
            }
        }
    }

    public void multiply(){
        float start;
        int start1 = 0;
        for (int i = 0; i < area.getText().length(); i++) {
            if(area.getText().split("")[i].equals("*")){
                //log();

                String[] multiply = area.getText().split("\\*");
                for (int j = 0; j<multiply.length;j++) {
                    if (multiply[0].contains(".")) {
                        start = Float.parseFloat(multiply[0]);
                        if (multiply[j].contains(".")){
                            start *= Float.parseFloat(multiply[j]);
                        }else {
                            start *= Integer.parseInt(multiply[j]);
                        }
                        area.setText(String.valueOf(start));
                    } else {
                        if (!multiply[0].contains(".")) {
                            start1 = Integer.parseInt(multiply[0]);
                            if (multiply[j].contains(".")) {
                                start1 *= Float.parseFloat(multiply[j]);
                            }else {
                                start1 *= Integer.parseInt(multiply[j]);
                            }
                        }
                        area.setText(String.valueOf(start1));
                    }
                }
            }
        }
    }

    public void divide(){
        int start;
        float num;
        for (int i = 0; i<area.getText().length();i++){
            if (area.getText().split("")[i].equals("/")){
                //log();

                String[] divide = area.getText().split("/");
                for(int j = 0;j<divide.length;j++){
                    if (divide[0].contains(".")){
                        num = Float.parseFloat(divide[0]);
                        if (divide[j].contains(".")&&j!=0){
                            num /= Float.parseFloat(divide[j]);
                        }else {
                            if (j!=0){
                                num /= Integer.parseInt(divide[j]);
                            }
                        }
                        area.setText(String.valueOf(num));
                    }else {
                        start = Integer.parseInt(divide[0]);
                        if(divide[j].contains(".")){
                            start /= Float.parseFloat(divide[j]);
                        }else {
                            if(j!=0){
                                start /= Integer.parseInt(divide[j]);
                            }
                        }
                        area.setText(String.valueOf(start));
                    }
                }
            }
        }
    }

    /**
     * @param s 运算前textarea中的玩意
     * @param s2 运算后textarea中的玩意
     * s与s2不一样
     */

    public static void save(String s,String s2){
        Date date=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str=s+" "+"="+" "+s2;
        try {
            if (flag) Calculate_history.saveFile(simpleDateFormat.format(date)+"\n"+str+"\n"+"\n");
            //30天自动清理历史记录
            Calculate_history.checkDate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
