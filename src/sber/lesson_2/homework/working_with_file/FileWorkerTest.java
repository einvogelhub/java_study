package sber.lesson_2.homework.working_with_file;
import java.io.*;
import java.util.*;

public class FileWorkerTest {
    public static void main(String[] args) {

        String fileName = "/home/einvogel/Projects/java_school/school/src/sber/" +
                "lesson_2/homework/working_with_file/poem.txt";

        FileWorker fileWorker = new FileWorker();
        // Получение списка строк файла
        ArrayList<String> fileLines = fileWorker.openFile(fileName);
        // 1) Подсчитайте количество различных слов в файле
        HashSet<String> setWords = fileWorker.fileWordsHashSet(fileLines);
        // 2) Выведите на экран список различных слов файла, отсортированный по возрастанию их длины
        ArrayList<String> sortedSetWords = fileWorker.sortWordsForLength(setWords);
        // 3) Подсчитайте и выведите на экран сколько раз каждое слово встречается в файле.
        HashMap<String, Integer> wordsQuantityhashMap = fileWorker.countDifferentWordsQuantity(setWords, fileLines);


        System.out.println("Число различных слов в тексте: " + setWords.size());
        System.out.println("Массив, отсортированный по длине: " + sortedSetWords);
        System.out.println("Колличество каждого слова в тексте: " + wordsQuantityhashMap);
    }
}
