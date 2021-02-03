package CodingChallenge;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CodingChallengeA {
    public static void main(String[] args){
        int[] array = new int[7];
        List<Integer> data = Arrays.asList(2,4,1,-2,-4,1,0);
        Iterator<Integer> iterator = data.listIterator();
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < 7; i++) {
            int next = iterator.next();
            if (next > 0){
                array[i] = next;
                sum += array[i];
                counter++;
            }
        }
        System.out.println(sum/counter);
    }
}
