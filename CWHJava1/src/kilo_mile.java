import java.util.Scanner;

public class kilo_mile {
    public static void main(String[] args){
        System.out.println("kilo to mile");
        Scanner k = new Scanner(System.in);

        System.out.println("Emter the kilogram");
        double kg = k.nextDouble();

        double miles = kg / 1.6;

        System.out.println("Miles = " +miles  );
    }
}
