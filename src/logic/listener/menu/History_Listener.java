package logic.listener.menu;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class History_Listener implements ActionListener{
    public static Date date;
    @Override
    public void actionPerformed(ActionEvent e) {
        date=new Date();
        Desktop desktop=Desktop.getDesktop();
        File file=new File("data/Calculate_history.txt");
        try {
            desktop.open(file);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
