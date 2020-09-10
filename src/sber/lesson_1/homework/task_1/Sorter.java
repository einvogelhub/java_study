package sber.lesson_1.homework.task_1;

public class Sorter {

    public int[] bubbleSort(int [] array) {

        String label = "not sorted";

        while (!label.equals("sorted")) {
            // При итерациях по массиву, допустим, что массив отсортирован
            label = "sorted";

            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int temporary_value = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temporary_value;
                    label = "not_sorted";
                }
            }
        }
        return array;
    }
}
