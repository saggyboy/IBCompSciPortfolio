package Project4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Parser {
    private Scanner scanner;
    private File file;

    public Parser(File file) {
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("file was not found");
            e.printStackTrace();
        }
    }

    public void printData(){
        while(scanner.hasNext()){
            scanner.next();
        }
    }

    public List getDataInColumn(int column){
        List data = new ArrayList<String>();
        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNext()){
            List separationIndexes = new ArrayList<Integer>();

            if (scanner.next().contains(",")){
                for (int i = 0; i < scanner.next().length(); i++) {
                    char charCurr = scanner.next().charAt(i);

                    if (charCurr == ','){
                        separationIndexes.add(i);
                    }
                }

                //Check the separation indexes given the column number
                int start = (int) separationIndexes.get(column);
                for (int i = start + 1; i < scanner.next().length(); i++) {
                    char charCurr = scanner.next().charAt(i);
                    if (charCurr == ','){
                        break;
                    }
                    stringBuilder.append(scanner.next().charAt(i));
                }
            } else {
                stringBuilder.append(scanner.next());
            }

            data.add(stringBuilder.toString());
            stringBuilder.setLength(0);
        }

        return data;
    }

}
