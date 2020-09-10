package sber.lesson_2.homework.classification_on_types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Classifier {

    public void SplitForTypes(ArrayList<String> carList) {

        // 1) Получаем множество типов машин
        HashSet<String> carTypes = getHashSetCarTypes(carList);
        // 2) Получаем хеш-таблицу вида {'Тип машины': [Машины]}
        HashMap<String, ArrayList<String>> hashMapCarTypes = getHashMapCarTypes(carTypes);
        // 3) Заполняем хеш-таблицу
        HashMap<String, ArrayList<String>> filledHashMapCarTypes = fillHashMapCarTypes(hashMapCarTypes, carList);
        System.out.println(filledHashMapCarTypes);

    }

    private HashSet<String> getHashSetCarTypes(ArrayList<String> carList) {

        HashSet<String> carTypes = new HashSet<>();

        for (String car : carList) {
            int secondWordIndex = 1;
            // Достаем тип машины
            String carType = car.split(" ")[secondWordIndex];
            carTypes.add(carType);
        }

        return carTypes;

    }

    private HashMap<String, ArrayList<String>> getHashMapCarTypes(HashSet<String> carTypes){

        HashMap<String, ArrayList<String>> hashMapCarTypes = new HashMap<>();

        for (String type: carTypes){
            ArrayList<String> carListSimilarType = new ArrayList<>();
            hashMapCarTypes.put(type, carListSimilarType);
        }

        return hashMapCarTypes;
    }

    private HashMap<String, ArrayList<String>> fillHashMapCarTypes(HashMap<String, ArrayList<String>> hashMapCarTypes,
                                                                   ArrayList<String> carList){

        for (String car : carList) {
            int secondWordIndex = 1;
            String carType = car.split(" ")[secondWordIndex];
            ArrayList<String> carListSimilarType  = hashMapCarTypes.get(carType);
            carListSimilarType.add(car);
        }

        return hashMapCarTypes;
    }
}
