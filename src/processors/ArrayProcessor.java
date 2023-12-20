package processors;

import processors.filteralgorithms.FilterAlgorithm;
import processors.searchalgorithms.SearchAlgorithm;
import processors.sortalgorithms.SortAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class ArrayProcessor {
    SortAlgorithm sortAlgorithm;
    SearchAlgorithm searchAlgorithm;
    FilterAlgorithm filterAlgorithm;

    public ArrayProcessor(SortAlgorithm sortAlgorithm, SearchAlgorithm searchAlgorithm, FilterAlgorithm filterAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
        this.searchAlgorithm = searchAlgorithm;
        this.filterAlgorithm = filterAlgorithm;
    }

    public void sort(int[] array) {
        this.sortAlgorithm.sort(array);
    }

    public int search(int[] array, int target) {
        return this.searchAlgorithm.search(array, target);
    }

    public void filter(int[] array) {
        this.filterAlgorithm.filter(array);
    }

}
