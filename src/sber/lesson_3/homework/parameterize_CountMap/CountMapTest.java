package sber.lesson_3.homework.parameterize_CountMap;

import java.util.Map;

public class CountMapTest {
    public static void main(String[] args){

        int receivingElement = 4;
        int removingElement = 4;

        CountMap map = new ClassCountMap();
        map.add(4);
        map.add(4);
        map.add(5);
        map.add(6);

        CountMap source = new ClassCountMap();
        source.add(1);
        source.add(2);
        source.add(4);

        int quantityElement = map.getCount(receivingElement);
        int quantityElementBeforeDelete = map.remove(removingElement);
        int quantityDifferentElements = map.size();
        map.addAll(source);
        Map mapElements = map.toMap();

        System.out.println("Количество добавляемых элементов " + receivingElement + " - " + quantityElement + " шт");
        System.out.println("Количество добавляемых элементов " + removingElement + " до удаления"
                + " - " + quantityElementBeforeDelete + " шт");
        System.out.println("Количество разных элементов - " + quantityDifferentElements + " шт");
        System.out.println("Элементы и их коллическтво после добавления source" + mapElements);
    }
}
