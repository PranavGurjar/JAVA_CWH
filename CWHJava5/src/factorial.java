import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("enter the no for factorial = ");
        int num = k.nextInt();
        int facto = 1;
        int i = 1;

        while(i<=num)
        {
            facto = facto * i;
            i++;
        }
        System.out.println("the factorial of using while loop of num  "+num );
        System.out.println(facto);

        facto=1;

        for(i=1; i<=num; i++)
        {
            facto = facto * i;

        }
        System.out.println("the factorial of using for loop of num  "+num );
        System.out.println(facto);


    }
}
