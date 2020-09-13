package sber.lesson_2.homework.working_with_file;
import java.util.ArrayList;
import java.util.Iterator;

public class ReverseIterator<String> implements Iterable<String> {
    private final ArrayList<String> arrayList;
    private final int currentSize;

    public ReverseIterator(ArrayList<String> newArray) {
        this.arrayList = newArray;
        this.currentSize = arrayList.size();
    }

    @Override
    public Iterator<String> iterator() {
        Iterator<String> it = new Iterator<>() {

            private int currentIndex = currentSize - 1;

            @Override
            public boolean hasNext() {
                return currentIndex < currentSize && currentIndex >= 0 && arrayList.get(currentIndex) != null;
            }

            @Override
            public String next() {
                return arrayList.get(currentIndex--);
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }
}