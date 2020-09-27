package sber.exceptions.homework;
import sber.exceptions.homework.terminal.MainFrame;

public class Terminal implements TerminalInterface{


    @Override
    public void runTerminal() {

        MainFrame mainFrame = new MainFrame();
    }

    @Override
    public void showBalance() {



    }

    @Override
    public void depositMoney() {

    }

    @Override
    public void withdrawMoney() {

    }
}
