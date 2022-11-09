package res;

import java.net.InetAddress;

/**
 * @CreateTime: 2022/8/13 09:51
 * @Author: AndyMa
 */
public class test {
    public static void main(String[] args) {
        test t = new test();
        System.out.println("Local ip:" + t.getLocal());
        System.out.println("Server ip:" + t.getSpecific("www.baidu.com"));

        /**
        File file = new File("/Users/majie/Desktop/QQmusic");
        File into = new File("Users/majie/Desktop/flac");
        if (file.isDirectory()||into.isDirectory()){
            File[] f = file.listFiles();
            for (File value : f) {
                if (value.getName().contains("flac")) {
                    System.out.println(value);
                }
            }
        }
         */
    }

    public InetAddress getLocal(){
        InetAddress local = null;
        try{
            local = InetAddress.getLocalHost();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return local;
    }

    public InetAddress getSpecific(String url){
        InetAddress server = null;
        try{
            server = InetAddress.getByName(url);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return server;
    }

}
