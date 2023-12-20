package processors.searchalgorithms;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch implements SearchAlgorithm{
    @Override
    public int search(int[] array, int target) {
        int index = linearSearch(array, target);
        return index;
    }

    private int linearSearch(int[] array, int target) {
        int length = array.length;

        for(int i = 0; i < length; i++) {
            if(array[i] == target)
                return i;
        }

        return -1;
    }
}
