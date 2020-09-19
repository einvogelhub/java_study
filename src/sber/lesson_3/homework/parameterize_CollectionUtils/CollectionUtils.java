package sber.lesson_3.homework.parameterize_CollectionUtils;

import java.util.*;

public class CollectionUtils {
    // T - это обозначение универсального типа данных
    // List<? extends T> source - означает, что объекты в массиве source могут быть наследниками объекта T
    // List<? super T> destination - в массиве могут быть родители объекта T

    public static<T> void addAll(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
    }

    public static List newArrayList() {
        List<String> arrayList = new ArrayList<>();
        return arrayList;
    }

    public static int indexOf(List source, Object o) {
        int itemIndex = source.indexOf(o);
        return itemIndex;

    }

    public static List limit(List source, int size) {
        List slicedSource = source.subList(0, size);
        return slicedSource;
    }

    public static void add(List source, Object o) {
        source.add(o);
    }

    public static void removeAll(List removeFrom, List c2) {
        removeFrom.removeAll(c2);
    }

    public static boolean containsAll(List c1, List c2) {
        if (c1.containsAll(c2)){
            return true;
        }else {
            return false;
        }

    }

    public static boolean containsAny(List c1, List c2) {
        if (!Collections.disjoint(c1, c2))
        {
            return true;
        }else{
            return false;
        }
    }

    public static List range(List list, Object min, Object max) {
        Collections.sort(list);
        int minIndex = list.indexOf(min);
        int maxIndex = list.indexOf(max);
        List slicedSource = list.subList(minIndex, maxIndex + 1);
        return slicedSource;
    }
}

