package sber.lesson_1.homework.task_3;

public class TemperatureConverter {

    public float kelvinConvert(float celsius){
        return (float) (celsius + 273.15);
    }

    public float fahrenheitConvert(float celsius){
        return (celsius * (float) 9 / 5) + 32;
    }

    public float rankineConvert(float celsius){
        return (float) ((celsius + 273.15) * (float) 9 / 5);
    }

    public float reamureConvert(float celsius){
        return (celsius) * (float) 4 / 5;
    }
}
