import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Countchar {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input the String : ");
        String str = in.nextLine();

        String[] strArr = str.split("\\s+|\\n");
        String[] sorted = sorting(strArr);
        for(String s : sorted){
            System.out.println(s+" ");
        }

    }
    public static String[] sorting(String[] s) {
        Arrays.sort(s);
        return s;
    }
}