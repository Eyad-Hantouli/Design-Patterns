package processors.sortalgorithms;

import java.util.List;

public class InsertionSort implements SortAlgorithm{
    @Override
    public void sort(int[] array) {
        insertionSort(array);
    }

    public void insertionSort (int[] array) {
        int length = array.length;
        int temp, currentItem;

        for (int i=1; i<length; i++) {
            currentItem = i;
            while (currentItem != 0 && array[currentItem] < array[currentItem - 1]) {
                temp = array[currentItem - 1];
                array[currentItem - 1] = array[currentItem];
                array[currentItem] = temp;
                currentItem--;
            }
        }
    }
}
