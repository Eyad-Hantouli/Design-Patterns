import processors.ArrayProcessor;
import processors.filteralgorithms.LessThan;
import processors.searchalgorithms.BinarySearch;
import processors.searchalgorithms.LinearSearch;
import processors.sortalgorithms.BubbleSort;
import processors.sortalgorithms.InsertionSort;
import processors.sortalgorithms.MergeSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayProcessor arrayProcess = new ArrayProcessor(
                new MergeSort(),
                new BinarySearch(),
                new LessThan()
        );

        int[] array = {1, 6, 10, 5, 2, 7};

        arrayProcess.sort(array);
        System.out.println(arrayProcess.search(array, 2));
        System.out.println(Arrays.toString(array));
        arrayProcess.filter(array);
    }
}