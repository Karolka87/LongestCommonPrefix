import java.util.ArrayList;
import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args){
        String[] lista1 = new String[3];
        lista1[0] = "cypr";
        lista1[1] = "cygaro";
        lista1[2] = "cyniczny";
        //lista1[3] = "pomidor";
        //lista1[4] = "gruszka";

        Arrays.sort(lista1);
        System.out.println(Arrays.toString(lista1));
        String t1 = lista1[0];
        String t2 = lista1[lista1.length - 1];
        int idx = 0;
        while (idx < t1.length() && idx < t2.length()) {
            if(t1.charAt(idx) == t2.charAt(idx)) {
                idx++;
            }
            else {
                break;
            }
        }
        System.out.println(t1.substring(0, idx));

    }
}
