package logic.listener.menu;
import GUI.MainFrame;
import Other_functions.gather;
import logic.listener.other.equal;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

public class MyKeyListener implements KeyListener {
    char[] c = new char[]{KeyEvent.VK_ESCAPE, KeyEvent.VK_BACK_SPACE, KeyEvent.VK_0,
            KeyEvent.VK_1,KeyEvent.VK_2,KeyEvent.VK_3,KeyEvent.VK_4,KeyEvent.VK_5,KeyEvent.VK_6,KeyEvent.VK_7,
            KeyEvent.VK_8,KeyEvent.VK_9, KeyEvent.VK_ALL_CANDIDATES, KeyEvent.VK_DIVIDE,KeyEvent.VK_SUBTRACT,
            KeyEvent.VK_ADD,KeyEvent.VK_DECIMAL, KeyEvent.VK_MULTIPLY, KeyEvent.VK_ENTER,KeyEvent.VK_SHIFT};

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        gather g=new gather();
        char ch = e.getKeyChar();
        /**
        for (char c1: c) {
            if (ch==c1){
                System.out.println(ch);

            }
        }**/
        if (ch == KeyEvent.VK_ENTER){
            equal.flag=true;
            try {
                String str = MainFrame.textarea.getText();
                g.calculate();
                equal.save(str,MainFrame.textarea.getText());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }else if(ch == KeyEvent.VK_BACK_SPACE){  //回车
            g.backspace();
        }else if (ch == KeyEvent.VK_ESCAPE){
            g.back0();
        }else MainFrame.textarea.append(String.valueOf(ch));
    }
}
