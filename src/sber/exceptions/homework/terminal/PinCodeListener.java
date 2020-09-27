package sber.exceptions.homework.terminal;
import sber.exceptions.homework.TerminalServer;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PinCodeListener implements KeyListener {

    private final JTextField passwordMessage;
    TerminalServer terminalServer = new TerminalServer();

    public PinCodeListener(JTextField message){
         passwordMessage = message;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int value = Character.getNumericValue(e.getKeyChar());
        System.out.println(value);
        terminalServer.addPasswordSymbol(value);

        if (value > 10 | value < 0){
            passwordMessage.setText("Неверный символ");
        }else{
            passwordMessage.setText("Введите пароль");

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}