import java.util.Scanner;

public class sum {
    int logic(int x, int y){
        int z= x+y;
        return z; }

    public static void main(String args[]){
        Scanner io = new Scanner(System.in);
        sum obj = new sum();

        int a = io.nextInt();
        int b = io.nextInt();
        int c;

        c = obj.logic(a, b);
        System.out.println(c);
    }
}



//
//import java.util.Scanner;
//
//public class sum {
//    static int logic(int x, int y){
//        int z= x+y;
//        return z; }
//
//    public static void main(String args[]){
//        Scanner io = new Scanner(System.in);
//
//        int a = io.nextInt();
//        int b = io.nextInt();
//        int c;
//
//        c = logic(a, b);
//        System.out.println(c);
//    }
//}

