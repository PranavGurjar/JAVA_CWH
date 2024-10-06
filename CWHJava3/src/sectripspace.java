import java.util.Scanner;
public class sectripspace {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        String str="hello i am  Pranav   Mahajan";
        System.out.println(str.indexOf("  "));
        System.out.println(str.indexOf("   "));
        System.out.println("enter the text for find = ");
        String s = i.nextLine();
        System.out.println("result = "+str.indexOf(s));

    }
}
