import java.util.Scanner;

public class Characteroccurence {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input the String : ");
        String str = input.nextLine();
        System.out.println("Input the Character : ");
        String c = input.next();
        System.out.println("Number of occurrences of "+c+" is "+countOcc(str,c));


    }
    public static int countOcc(String str,String charac){
        int count = str.length()- str.replace( charac, "").length();
        return count;
    }

}
