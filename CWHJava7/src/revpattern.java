
import java.util.Scanner;

public class revpattern {
        static void patternrev(int n){

            for(int i=n; i>0;i--){
                for(int j=0;j<i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("The Number Of ");
            int num = in.nextInt();

            patternrev(num);

        }
    }


