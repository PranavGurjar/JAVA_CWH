import java.util.Scanner;

public class printaday {
    public static void main(String[] args){
        Scanner i=new Scanner(System.in);
        System.out.println("enter the no for day = ");
        int day=i.nextInt();

        switch(day)
        {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Thuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Satday");
                break;
        }
    }
}
