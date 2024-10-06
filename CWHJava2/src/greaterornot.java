import java.util.Scanner;

public class greaterornot {
    public static void main(String[] args){
        Scanner g= new Scanner(System.in);

        System.out.println("greater than 18 or not");

        System.out.println("Enter the no = ");
        float a= g.nextInt();


//        if(a>18)
//        {
//            System.out.println(a+" is greater than 18");
//        }
//        else
//        {
//            System.out.println(a+" is smaller than 18");
//        }

        System.out.println("greater or not = "+(a>18));
    }
}
