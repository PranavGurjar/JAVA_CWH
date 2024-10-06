import java.util.Scanner;

public class searchnum {
    public static void main(String[] args) {
        double [] num={8.9, 6.2, 2.5, 8.4, 9.0};
        double no=9.8;
        boolean isanarray=false;

        for(double elem: num)
        {
            if(elem==no)
            {
                isanarray=true;
                break;
            }
        }
        if(isanarray)
        {
            System.out.println("the num is occur " +no);
        }
        else
        {
            System.out.println("the num is not occur "+no);
        }
    }
}
