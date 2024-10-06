import java.util.Scanner;
public class patternuserecs {
        static void patternrec(int n){
            if(n>0)
            {
                patternrec(n-1);
                for(int i=0; i<n;i++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("The Number Of ");
            int num = in.nextInt();

            patternrec(num);

        }
    }


