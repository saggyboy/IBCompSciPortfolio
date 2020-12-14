package Project4;

public class BubbleSorter implements Sorter{

    @Override
    public double[] sort(double[] data) {
        double[] sortedData = data.clone();
        for (int i = 0; i < data.length; i++) {
            double previousValue = sortedData[0];
            for (int j = 1; j < data.length; j++) {
                double current = sortedData[j];
                if (previousValue > current) {
                    sortedData[j - 1] = current;
                    sortedData[j] = previousValue;
                }
                previousValue = sortedData[j];
            }
        }

        return sortedData;
    }
}
