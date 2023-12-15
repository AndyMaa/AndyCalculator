package logic.listener.menu;

import GUI.MainFrame;
import Other_functions.gather;
import logic.listener.other.equal;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

public class MyKeyListener implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //MainFrame.textarea.append(String.valueOf(e.getKeyChar()));
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //System.out.println(e.getKeyChar());
        if (e.getKeyChar() == KeyEvent.VK_ENTER){
            try {
                new gather();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }else MainFrame.textarea.append(String.valueOf(e.getKeyChar()));
    }
}
