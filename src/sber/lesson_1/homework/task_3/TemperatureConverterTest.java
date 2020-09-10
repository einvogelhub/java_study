package sber.lesson_1.homework.task_3;

public class TemperatureConverterTest {

    public static void main(String[] args){

        int celsius = 10;
        TemperatureConverter converter = new TemperatureConverter();
        float kelvin = converter.kelvinConvert(celsius);
        float fahrenheit = converter.fahrenheitConvert(celsius);
        float rankine = converter.rankineConvert(celsius);
        float reamure = converter.reamureConvert(celsius);
        System.out.println("Температура в Цельсиях: " + celsius);
        System.out.println("Температура в Кельвинах: " + kelvin);
        System.out.println("Температура в Фаренгейтах: " + fahrenheit);
        System.out.println("Температура в Ранкинах: " + rankine);
        System.out.println("Температура в шкале Реамюре: " + reamure);
    }
}
