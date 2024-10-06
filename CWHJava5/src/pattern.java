import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        System.out.println("print the pattern = ");
        Scanner k = new Scanner(System.in);
        int ptn = k.nextInt();
        int i;
        int j;

//        for(i=0; i<=ptn; i++);
//        {
//            for( j=i; j>=0;j--);
//            {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

        System.out.println("for loop using 1  ");

        for(i=ptn ; i>0 ; i--)
        {
            for(j=0; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }

//        System.out.println("while loop using 1  ");
//        i = ptn;
//        j = 0;
//        while(i>0)
//        {
//            while(j<i)
//            {
//                System.out.print("*");
//                j++;
//            }
//            i--;
//            System.out.print("\n");
//        }

    }
}