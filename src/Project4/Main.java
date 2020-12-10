package Project4;

import java.io.File;
import java.io.IOException;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/andrewseybold/Desktop/CSVs/read.csv");
        Parser parser = new Parser(file);

        Writer writer = new Writer("/Users/andrewseybold/Desktop/CSVs/output.csv");

        SelectionSorter selectionSorter = new SelectionSorter();

        double[] data = parser.getData();
        double[] sortedData = selectionSorter.sort(data);

        System.out.println("hello");

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
            double sortedDatum = sortedData[i];
            stringBuilder.append(sortedDatum + " ");
        }
        writer.writeData((stringBuilder.toString()));

    }
}
