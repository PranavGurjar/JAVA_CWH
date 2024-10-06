import java.util.Scanner;
public class revpatternuserecs {
        static void patternrec(int n){
            if(n>0)
            {
                for(int i=n;i>0;i--)
                {
                    System.out.print("*");
                }
                System.out.println();
                patternrec(n-1);
            }
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("The Number Of ");
            int num = in.nextInt();

            patternrec(num);

        }
    }
