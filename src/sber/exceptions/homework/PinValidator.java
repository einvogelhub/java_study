package sber.exceptions.homework;

public class PinValidator {

    public final boolean validateChar(char symbol){
        int value = Character.getNumericValue(symbol);
        System.out.println(value);
        return value < 10 && value >= 0;
    }
}
