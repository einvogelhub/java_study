package sber.lesson_2.homework.classification_on_types;

import java.util.ArrayList;

public class ClassifierTest {
    public static void main(String[] args){
        ArrayList<String> carList = new ArrayList<>();
        carList.add("Лада седан");
        carList.add("Лада хэтчбек");
        carList.add("Мерседес седан");
        carList.add("Бмв кроссовер");
        carList.add("Форд хэтчбек");
        carList.add("Пежо кроссовер");
        carList.add("Тойота седан");

        Classifier classifier = new Classifier();
        classifier.SplitForTypes(carList);


    }
}
