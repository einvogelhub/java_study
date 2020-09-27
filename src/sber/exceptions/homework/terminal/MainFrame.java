package sber.exceptions.homework.terminal;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends Frame{

    JPanel panel = new JPanel(new BorderLayout());
    JFrame frame = new JFrame();
    JTextField message = new JTextField(12);
    JPasswordField password = new JPasswordField(3);

    public MainFrame(){
        setFrame();
        setTextField();
        setPassword();
    }

    private void setFrame(){
        // Расстановка кнопок
        frame.setLayout(new GridBagLayout());
        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(frameWidth, frameHeight);
        frame.add(message);
        frame.add(password);
        frame.setVisible(true);
    }

    private void setTextField(){
        message.setText("Введите пароль");
        message.setEditable(false);
    }

    private void setPassword(){
        password.setEchoChar('*');
        password.addKeyListener(new PinCodeListener(message));
    }
}
