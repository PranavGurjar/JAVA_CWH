import java.util.Scanner;

public class leafyearornot {
    public static void main(String[] args){
        Scanner i=new Scanner(System.in);
        System.out.println("enter the year? ");
        int year = i.nextInt();

        if(year%4==0 || year%400==0)
        {
            System.out.println(year +" it is leap year");
        }
        else
        {
            System.out.println(year +" it is not leap year");
        }
    }
}
