package sber.lesson_1.homework.binarySearchAndBubbleSort;

public class BinarySearchTest {

    public static void main(String[] args){

        int [] array_of_numbers = {3, 8, 9, 5, 1, 6, 2, 7, 4};
        int searching_number = 4;

        Searcher searcher = new Searcher();
        String answer = searcher.binarySearch(searching_number, array_of_numbers);
        System.out.println(answer);
    }



}
