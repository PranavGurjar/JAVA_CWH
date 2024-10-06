import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("CBSC mark to percentage");
        Scanner sc= new Scanner(System.in);

        System.out.println("sunject 1 mark");
        int a = sc.nextInt();

        System.out.println("sunject 2 mark");
        int b = sc.nextInt();

        System.out.println("sunject 3 mark");
        int c = sc.nextInt();

        System.out.println("sunject 4 mark");
        int d = sc.nextInt();

        System.out.println("sunject 5 mark");
        int e = sc.nextInt();

        int result = (a+b+c+d+e)/5;
//        float result = (a+b+c+d+e)/5;

//        int percent= sum/5;

        System.out.println("sunject all mark percentage ");
//        System.out.println(percent);
        System.out.println(result);

    }
}