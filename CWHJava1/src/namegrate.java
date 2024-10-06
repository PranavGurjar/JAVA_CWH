import java.util.Scanner;

public class namegrate {
    public static void main(String[] args){
        System.out.println("input the name");
        Scanner n = new Scanner(System.in);

        System.out.println("enter your name1");
        String str1 = n.nextLine();
        System.out.println("Hello," +str1+" have a nice day " );

        System.out.println("enter your name2");
        String str2 = n.next();
        System.out.println("Hello," +str1+" have a nice day " );

    }
}
