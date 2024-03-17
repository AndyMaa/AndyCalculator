package Other_functions;

import java.io.File;
import java.io.FileWriter;

public class Calculate_history {
    public static void saveFile(String fileContent){
        // 获取相对路径的绝对路径
        String absolutePath = Calculate_history.class.getClassLoader().getResource("data.Calculate_history").getPath();
        // 创建文件对象
        File file = new File(absolutePath);
        FileWriter fileWriter;
        // 创建文件输出流
        try{
            fileWriter=new FileWriter(file,true);
            fileWriter.write(fileContent);
        }catch (Exception e){
            e.printStackTrace();
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
