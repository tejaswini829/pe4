import java.util.Scanner;

public class Charreplace {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input the String : ");
        String str = in.nextLine();
        System.out.println("String after replacement is : "+replacing(str));
    }
    public static String replacing(String str){
        String res = str.replaceAll("d","f").replaceAll("l","t");
        return res;
    }
}
