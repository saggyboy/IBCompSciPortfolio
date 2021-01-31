package SemesterFinalProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(9, 3456, 268, 12, 45679, 296);
        int[] three = new int[1];
        int spot = 0;

        for (int i = 0; i < numbers.size(); i++) {
            int curr = numbers.get(i);
            if (curr > 99 && curr < 1000){
                int onesPlace = curr%10;
                int tensPlace = (curr%100)/10;
                int hundredsPlace = curr/100;
                if ((hundredsPlace < tensPlace) && (tensPlace < onesPlace)){
                    three[spot] = curr;
                    spot++;
                }
            }
        }
        if (spot == 0){
            System.out.println("no such numbers");
        }

        for (int i : three) {
            System.out.println(i);
        }
    }
}
