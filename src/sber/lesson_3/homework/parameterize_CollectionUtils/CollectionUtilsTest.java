package sber.lesson_3.homework.parameterize_CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionUtilsTest {

    public static void main(String[] args){

        List<Object> objects = new ArrayList<>();
        List<Object> objects1 = new ArrayList<>();
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        objects.add(object1);
        objects.add(object2);
        objects.add(object3);
        objects1.add(object1);
        objects1.add(object2);


        List<Dog> dogList = new ArrayList<>();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);

        List<Integer> integerArrayList = new ArrayList<>(Arrays.asList(8, 1, 3, 5, 6, 4));


        CollectionUtils.addAll(dogList, objects);
        List arrayList = CollectionUtils.newArrayList();
        int itemIndex = CollectionUtils.indexOf(dogList, dog2);
        List slicedSource = CollectionUtils.limit(dogList, 2);
        CollectionUtils.add(objects, object1);
        CollectionUtils.removeAll(objects, objects1);
        List rangedArrayList = CollectionUtils.range(integerArrayList, 3, 6);

        System.out.println("Индекс объекта dog2 - " + itemIndex);
        System.out.println("Укороченный массив " + slicedSource);
        System.out.println("массив objects содержит в себе все элементы objects: "
                + CollectionUtils.containsAll(objects, objects));
        System.out.println("массив objects содержит в себе хотя бы один элемент objects: "
                + CollectionUtils.containsAny(objects, objects));
        System.out.println("Элементы массива с минимального по максимальный " + rangedArrayList);

    }
}
