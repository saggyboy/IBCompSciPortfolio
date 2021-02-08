package CodingChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CodingChallengeBC {
    public static void main(String[] args){
        //b.
        List<Integer> passengers = Arrays.asList(300, 100, 100, 100, 200, 400, 450, 450, 500, 550);
        Iterator<Integer> iterator = passengers.listIterator();
        int[] p_array = new int[passengers.size()];
        for (int i = 0; i < passengers.size(); i++) {
            p_array[i] = iterator.next();
        }

        //c.
        int[] averagesPerDay = new int[7];
        for (int i = 0; i < p_array.length; i++) {
            averagesPerDay[i%7] += p_array[i];
        }

        int mostPassengers = 0;
        int mostPassengersIndex = 0;
        for (int i = 0; i < 7; i++) {
            int curr = averagesPerDay[i];

            if (i < (p_array.length%7)){
                curr /= (p_array.length/7 + 1);
            } else {
                curr /= (p_array.length/7);
            }
            System.out.println(curr);

            if (curr > mostPassengers){
                mostPassengers = curr;
                mostPassengersIndex = i;
            }
        }
        //Find day number in any week
        int dayWithinWeek = mostPassengersIndex;
        String dayWithMostPassengers = Converter.convert(dayWithinWeek);
        System.out.println(dayWithMostPassengers);
    }
}
