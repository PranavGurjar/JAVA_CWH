import java.util.Scanner;

public class replaceName {
    public static void main(String[] args){
        Scanner i= new Scanner(System.in);
        String text = "Hello Name , Thank a lot ";

        String tx = text.replace("Name","Pranav");

        System.out.println(tx);
        System.out.println("enter the name = ");
        String str = i.nextLine();

        String str1 = text.replace("Name", str);

        System.out.println(str1);

    }
}
