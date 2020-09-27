package sber.exceptions.homework.terminal;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class FrameShowBalance extends Frame {

    showBalance showBalance = new showBalance();
    JPanel panel = new JPanel(new BorderLayout());
    JFrame frame = new JFrame();
    JTextField message = new JTextField("Введите пин код");

    public FrameShowBalance(){
        // Расстановка кнопок
        frame.setLayout(new GridBagLayout());
        frame.getContentPane().add(panel);
        frame.getContentPane().add(showBalance.button);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(frameWidth, frameHeight);
        frame.add(message);
        frame.setVisible(true);

        message.setEditable(false);

    }

    public void actionPerformed(ActionEvent event){
        System.out.println("Запрос состояния счета");

    }
}
