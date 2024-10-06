
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("The 0 for Rock, 1 for Paper, 2 for Scissor = ");
        int user= sc.nextInt();

        Random random = new Random();

        int computer = random.nextInt(3);

        if(user == computer)
        {
            System.out.println("Draw");
        }
        else if(user==0 && computer==2 || user==1 && computer==0 || user==2 && computer==1 )
        {
            System.out.println("User Win ");
        }
        else
        {
            System.out.println("Computer Win ");
        }
        //System.out.println("user Choice = "+user);
        //System.out.println("Computer Choice = "+computer);


        if(user==0)
        {
            System.out.println("user Choice = Rock");
        }
        else if(user==1)
        {
            System.out.println("user Choice = Paper");
        }
        else if(user==2)
        {
            System.out.println("user Choice = Scissor");
        }


        if(computer==0)
        {
            System.out.println("Computer Choice = Rock");
        }
        else if(computer==1)
        {
            System.out.println("Computer Choice = Paper");
        }
        else if(computer==2)
        {
            System.out.println("Computer Choice = Scissor");
        }


    }
}