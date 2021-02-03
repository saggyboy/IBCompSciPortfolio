package CodingChallenge;

import java.util.HashMap;
import java.util.Map;

public class Converter {
    public static String convert(int dayOfWeek){
        //Totally arbitrary way of doing this but visually clean. If statements work just as well.
        Map<Integer, String> days = new HashMap<>();
        days.put(0, "Monday");
        days.put(1, "Tuesday");
        days.put(2, "Wednesday");
        days.put(3, "Thursday");
        days.put(4, "Friday");
        days.put(5, "Saturday");
        days.put(6, "Sunday");

        return days.get(dayOfWeek);
    }
}
