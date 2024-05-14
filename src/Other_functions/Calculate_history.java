package Other_functions;

import java.io.File;
import java.io.FileWriter;
import java.util.Date;
import logic.listener.other.equal;

public class Calculate_history {
    public static Date date;   //上一次修改时间
    static String path = "data/Calculate_history.txt";
    static File file = new File(path);
    public static void saveFile(String fileContent){
        checkData();
        date=new Date();
        FileWriter fileWriter;
        // 创建文件输出流
        try{
            fileWriter=new FileWriter(file,true);
            fileWriter.write(fileContent);
            fileWriter.flush();
            fileWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //检查日期是否超过30天
    public static void checkDate(){
        if (equal.d.getDay() == date.getDay()+30){
            FileWriter fileWriter;
            try{
                fileWriter=new FileWriter(file,true);
                fileWriter.write("");
                fileWriter.flush();
                fileWriter.close();
            }catch (Exception e){
                e.printStackTrace();
            }
            //TODO
        }
    }

    //控制文件大小
    public static void checkData(){
        FileWriter fileWriter;
        if (file.exists() && file.isFile()) {
            long i = file.length();
            if (i>=104857600){
                try{
                    fileWriter=new FileWriter(file,true);
                    fileWriter.write(" ");
                    fileWriter.flush();
                    fileWriter.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

    /**
    public static void main(String[] args) {
        // 相对路径，相对于类路径（classpath）
        String relativePath = "data";
        // 文件名
        String fileName = "example.txt";
        // 文件内容
        String content = "Hello, World!";
        byte[] fileContent = content.getBytes();

        try {
            saveFile(relativePath, fileName, fileContent);
            System.out.println("文件保存成功！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }**/
}
