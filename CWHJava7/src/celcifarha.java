import java.util.Scanner;

public class celcifarha {
    static float celcifarhan(float c){
            return  (c * 9/5) + 32;
        }
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("The Celcius temp. Of = ");
            float num = in.nextFloat();

            float farha = celcifarhan(num);

            System.out.print("The farhaneit temp. Of = "+farha);

        }
    }


