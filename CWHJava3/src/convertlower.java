import java.util.Scanner;

public class convertlower {
    public static void main(String[] args){
        String name = "PRANAV";
        System.out.println(name.toLowerCase());
        Scanner i = new Scanner(System.in);
        System.out.println("enter the string = ");
        String name1 = i.nextLine();
        System.out.println(" the string = "+name1.toLowerCase());
    }
}
