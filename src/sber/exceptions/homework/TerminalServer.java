package sber.exceptions.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class TerminalServer {

    ArrayList<Integer> password = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
    ArrayList<Integer> passwordInput = new ArrayList<>();

    public void addPasswordSymbol(int symbol){
        passwordInput.add(symbol);
        if (passwordInput.size() == 4){
            boolean answer = validatePassword();
            System.out.println(answer);

        }
    }

    boolean validatePassword(){
        if (password.equals(passwordInput)){
            return true;
        }else {
            return false;
        }
    }


}
