package Project2.Tools;

public class BMath {

    public static String booleanArrayToString(boolean[] b) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < b.length; i++) {
            if (b[i] == true) {
                sb.append("1");
            } else {
                sb.append("0");
            }
        }
        return sb.toString();
    }

    public static boolean[] stringToBooleanArray(String s) {
        boolean[] b = new boolean[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i,i+1).equals("0")) {
                b[i]=false;
            } else {
                b[i]=true;
            }
        }
        return b;
    }


}
