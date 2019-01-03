import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Transpose{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input the String : ");
        String[] str = in.nextLine().split(" ");
        for(String s : str){
            System.out.print(transposing(s)+" ");
        }

    }
    public static String transposing(String s) {
        StringBuffer sb = new StringBuffer(s);
        return sb.reverse().toString();
    }
}
