import java.util.Scanner;

public class cgpa3mark {
    public static void main(String[] args){
        System.out.println("CGPA 3 SUBJECT COUNT");
        Scanner i = new Scanner(System.in);
        System.out.println("subject math 1");
        int a=i.nextInt();

        System.out.println("subject phy 2");
        int b=i.nextInt();

        System.out.println("subject chem. 3");
        int c=i.nextInt();

        float sum = a+b+c;

        float cgpa= sum/3;

        System.out.println("result CGPA =  " +cgpa);

    }
}
