import java.util.Scanner;

public class checkpass {
    public static void main(String[] args){
//        System.out.println("enter the marks = ");
//        Scanner i = new Scanner(System.in);
//        int marks= i.nextInt();

//        if(marks>=45)
//        {
//            System.out.println("Pass ");
//        }
//        else
//        {
//            System.out.println("Fail");
//        }

        Scanner i = new Scanner(System.in);

        System.out.println("enter the marks math= ");
        int m1= i.nextInt();

        System.out.println("enter the marks phy= ");
        int m2= i.nextInt();

        System.out.println("enter the marks chem= ");
        int m3= i.nextInt();

        float avg=(m1+m2+m3)/3.0f;

        if(avg>=40 && m1 >= 33 && m2 >= 33 && m3 >= 33)
        {
            System.out.println("Congratulation! pass");
        }
        else
        {
            System.out.println("fail");
        }

    }
}
