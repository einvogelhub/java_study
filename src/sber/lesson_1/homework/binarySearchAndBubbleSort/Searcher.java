package sber.lesson_1.homework.binarySearchAndBubbleSort;

import java.util.Arrays;

public class Searcher {

    public String binarySearch(int searching_number, int[] array) {

        Arrays.sort(array);
        int left_index = 0;
        int right_index = array.length;
        int middle_index = 0;

        while (left_index != right_index) {
            middle_index = left_index + (right_index - left_index) / 2;

            if (searching_number < array[middle_index]) {
                right_index = middle_index;
            }

            else if (searching_number > array[middle_index]){
                left_index = middle_index + 1;
            }
            else if (searching_number == array[middle_index]){
                break;
            }

        }

        if (searching_number == array[middle_index]){
            return String.format("Число %s находится по индексу %s в массиве %s",
                    searching_number,
                    middle_index,
                    Arrays.toString(array));
        }else {
            return String.format("Числа %s нет в массиве %s",
                    searching_number,
                    Arrays.toString(array));
        }


    }
}
