package sber.lesson_1.homework.binarySearchAndBubbleSort;

import java.util.Arrays;

public class BubbleSortTest {

    public static void main(String[] args){

        Sorter sorter = new Sorter();

        int [] array_of_numbers = {3, 8, 2, 5, 1, 6, 2, 6, 3};
        int [] sorted_array = sorter.bubbleSort(array_of_numbers);

        System.out.println("Входной массив " + Arrays.toString(array_of_numbers));
        System.out.println("Отсортированный массив " + Arrays.toString(sorted_array));
    }
}
