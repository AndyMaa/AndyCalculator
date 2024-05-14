package Other_functions;

import GUI.MainFrame;
import logic.listener.other.back;
import logic.listener.other.backZero;
import logic.listener.other.equal;

import java.io.IOException;

public class gather {
    /**
    public gather() throws IOException {
        equal e = new equal();
        e.add();
        e.minus();
        e.divide();
        e.divide();
    }**/

    public void calculate() throws IOException {
        equal e = new equal();
        e.add();
        e.minus();
        e.divide();
        e.divide();
    }

    public void backspace(){
        new back().go();
    }

    public void back0(){
        new backZero().go();
    }
/**
    public static String result() throws IOException {
        equal e = new equal();
        e.add();
        e.minus();
        e.divide();
        e.divide();
        return MainFrame.textarea.getText();
    }**/
}
