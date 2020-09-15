package sber.lesson_3.homework.parameterize_CountMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ClassCountMap implements CountMap{
    ArrayList<Object> arrayElements = new ArrayList<>();
    public void add(Object o){
        arrayElements.add(o);
    }

    @Override
    public int getCount(Object o) {
        int elementQuantity = 0;
        for (Object element: arrayElements){
            if (element.equals(o)){
                elementQuantity ++;
            }
        }
        return elementQuantity;
    }

    @Override
    public int remove(Object o) {
        int elementQuantity = getCount(o);
        arrayElements.remove(o);
        return elementQuantity;
    }

    @Override
    public int size() {
        HashSet<Object> setElements = new HashSet<>(arrayElements);
        int quantityDifferentElements = setElements.size();
        return quantityDifferentElements;
    }

    @Override
    public void addAll(CountMap source) {
        Map mapElements = source.toMap();
        for (Object key : mapElements.keySet()) {
            Object elementQuantity = mapElements.get(key);
            for (int i = 1; i <= (int) elementQuantity; i ++){
                arrayElements.add(key);
            }
        }
    }

    @Override
    public Map toMap() {
        Map<Object, Integer> mapElements = new HashMap<>();

        for (Object element: arrayElements){
            int elementQuantity = getCount(element);
            mapElements.put(element, elementQuantity);
        }
        return mapElements;
    }

    @Override
    public void toMap(Map destination) {

        destination = toMap();
    }
}
