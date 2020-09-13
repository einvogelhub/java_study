package sber.lesson_2.homework.working_with_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FileWorker {

    private static final HashSet<Character> PUNCTUATION = new HashSet<>(Arrays.asList(
            '!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-',
            '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^',
            '_', '`', '{', '|', '}', '~'
    ));

    public ArrayList<String> openFile(String fileName) {

        ArrayList<String> fileLines = new ArrayList<>();
        BufferedReader file;
        try {
            file = new BufferedReader(new FileReader(fileName));
            String line = file.readLine();
            while (line != null) {
                line = removePunctuation(line);
                if (!line.isEmpty()){
                    fileLines.add(line);
                }
                line = file.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileLines;
    }

    private String removePunctuation(String str) {
        StringBuilder result = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!PUNCTUATION.contains(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }

    public HashSet<String> fileWordsHashSet(ArrayList<String> fileLines){

        HashSet<String> setWords = new HashSet<>();
        for (String line: fileLines){
             String[] words = line.split(" ");
            setWords.addAll(Arrays.asList(words));
        }


        return setWords;
    }

    public ArrayList<String> sortWordsForLength(HashSet<String> setWords){
        String[] words = new String[setWords.size()];
        setWords.toArray(words);
        Arrays.sort(words, Comparator.comparingInt(String::length));
        ArrayList<String> sortedArrayWords = new ArrayList<String>(Arrays.asList(words));
        return sortedArrayWords;
    }

    public HashMap<String, Integer> countDifferentWordsQuantity(HashSet<String> setWords,
                                                                ArrayList<String> fileLines){

        HashMap<String, Integer> wordsQuantityHashMap = new HashMap<>();

        for (String word: setWords){
            int wordQuantity = 0;
            for (String line: fileLines){

                if (line.contains(word)){
                    wordQuantity ++;
                }

            }
            wordsQuantityHashMap.put(word, wordQuantity);
        }

        return wordsQuantityHashMap;

    }

    public ArrayList<String> reverseFileLines(ArrayList<String> fileLines){
        ArrayList<String> reversedFileLines = new ArrayList<>(fileLines);
        Collections.reverse(reversedFileLines);
        return reversedFileLines;
    }

    public void reverseIterator(ArrayList<String> fileLines){

        ReverseIterator<String> overrideIteratorFileLines = new ReverseIterator<String>(fileLines);
        for(String lang : overrideIteratorFileLines) {
            System.out.println(lang);
        }
    }

    public String getLineFile(int index, ArrayList<String>fileLines){
        return fileLines.get(index);

    }

}
