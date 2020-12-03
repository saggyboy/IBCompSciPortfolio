package Project4;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/andrewseybold/Desktop/CSVs/read.csv");
        Parser parser = new Parser(file);

        List<String> data = parser.getDataInColumn(1);
        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i));
        }

        double avg = 0;
        for (int i = 0; i < data.size(); i++) {
            int curr = Integer.parseInt(data.get(i));
            avg += curr;
        }

        avg /= data.size();

        Writer writer = new Writer("/Users/andrewseybold/Desktop/CSVs/output.csv");
        writer.writeData(String.valueOf(avg));

    }
}
