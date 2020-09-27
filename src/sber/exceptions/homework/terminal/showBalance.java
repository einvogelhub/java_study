package sber.exceptions.homework.terminal;

import java.awt.*;
import java.awt.event.ActionEvent;

public class showBalance extends AbstractButton {

    final int frameWidth = 200;
    final int frameHeight = 70;

    public showBalance(){
        button.setText("Состояние счета");
        button.addActionListener((this::actionPerformed));
        button.setPreferredSize(new Dimension(frameWidth, frameHeight));
        button.setBackground(Color.WHITE);
        button.setForeground(Color.BLACK);
    }

    public void actionPerformed(ActionEvent event){
        System.out.println("Запрос состояния счета");

    }
}
