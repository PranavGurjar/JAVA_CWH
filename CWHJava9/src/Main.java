//guess the number



import java.util.Scanner;
import java.util.Random;


class Game{
    public int comp, user, c=0;


    public int ranum()
    {
        Random random = new Random();
        comp=random.nextInt(100);
        return comp;
    }

    public void guessnum()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number  = ");
        user = sc.nextInt();
        do
        {
            if(comp<user)
            {
                System.out.println("Enter the big value.");
            }
            else if(comp>user)
            {
                System.out.println("Enter the small value.");
            }
            c++;
        }while(comp!=user);
    }
    public void correctguess()
    {
        System.out.println("You Win!");
    }


    public void guesscount()
    {
        System.out.println("Guess Time of number"+c);
        if(c<=3)
        {
            System.out.println("Pro Player!!");
        }
        else if(c>=3&&c<=7)
        {
            System.out.println("Good Player!!");
        }
        else
        {
            System.out.println("nice try but to do better !!");
        }
    }



}







public class Main {
    public static void main(String[] args) {
        Game my = new Game();
        my.ranum();
        my.guessnum();
        my.correctguess();
        my.guesscount();


    }
}