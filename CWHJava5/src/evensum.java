import java.util.Scanner;

public class evensum {
    public static void main(String[] args) {
        Scanner k= new Scanner(System.in);
        System.out.println("enter the no = ");
        int a=k.nextInt();
//        int s = 0;
//        int  i;
//        System.out.println("enter the number using for loop sum of even= ");
//        for(i=0; i<=a;i++)
//        {
//            s = s + (2*i);
//        }
//        System.out.println(s);

        int s=0;
        int i1=0;
        System.out.println("enter the number using while loop sum of even= ");
        while(i1<=a)
        {
            s = s + (2*i1);
            i1++;
        }
        System.out.println(s);


//        s=0;
//        System.out.println("enter the number for sum of odd= ");
//        for(i=0; i<=a;i++)
//        {
//            s = s + ((2*i)+1);
//        }
//        System.out.println(s);


    }
}
