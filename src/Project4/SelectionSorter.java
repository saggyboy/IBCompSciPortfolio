package Project4;

import java.util.ArrayList;

public class SelectionSorter implements Sorter{

    @Override
    public double[] sort(double[] data) {
        double[] sorted = new double[data.length];
        double[] unsorted = data.clone();

        double smallestValue = unsorted[0];
        int smallestValueIndex = 0;
        for (int i = 0; i < unsorted.length; i++) {
            for (int j = 0; j < unsorted.length; j++) {
                double curr = unsorted[j];
                if (curr < smallestValue){
                    smallestValue = curr;
                    smallestValueIndex = j;
                }
            }
            sorted[i] = smallestValue;
            unsorted[smallestValueIndex] = Double.MAX_VALUE;
            smallestValue = Double.MAX_VALUE;
        }

        return sorted;
    }
}
