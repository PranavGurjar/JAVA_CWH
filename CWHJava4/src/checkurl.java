import java.util.Scanner;

public class checkurl {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        System.out.println("check the url ?  ");
        String website=i.next();

        if(website.endsWith(".org"))
        {
            System.out.println("it is the organizational website ");
        }
        else if(website.endsWith(".com"))
        {
            System.out.println("it is the commercial website ");
        }
        else if(website.endsWith(".in"))
        {
            System.out.println("it is the indian website ");
        }
    }
}
