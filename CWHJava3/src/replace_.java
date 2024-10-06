import java.util.Scanner;

public class replace_ {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        String name="    pranav    ";
        System.out.println(name.replace(" " ,"_"));

        System.out.println("enter the string with space = ");
        String str = i.nextLine();
        String s = str.replace(" ","_");
        System.out.println(s);
    }
}
