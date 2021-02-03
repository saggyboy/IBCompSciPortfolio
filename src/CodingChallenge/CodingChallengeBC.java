package CodingChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CodingChallengeBC {
    public static void main(String[] args){
        //b.
        List<Integer> passengers = Arrays.asList(212, 454, 342, 170, 632, 462, 505, 234, 654, 736);
        Iterator<Integer> iterator = passengers.listIterator();
        int[] p_array = new int[passengers.size()];
        for (int i = 0; i < passengers.size(); i++) {
            p_array[i] = iterator.next();
        }

        //c.
        int mostPassengers = p_array[0];
        int mostPassengersIndex = 0;
        for (int i = 0; i < p_array.length; i++) {
            int curr = p_array[i];
            if (curr > mostPassengers){
                mostPassengers = curr;
                mostPassengersIndex = i;
            }
        }
        //Find day number in any week
        int dayWithinWeek = mostPassengersIndex%7;
        String dayWithMostPassengers = Converter.convert(dayWithinWeek);
        System.out.println(dayWithMostPassengers);
    }
}
