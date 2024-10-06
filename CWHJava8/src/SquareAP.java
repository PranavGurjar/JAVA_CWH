class Square{
    int side;

    public int area(){
        return side*side;
    }

    public int perimeter(){
        return 4*side;
    }
}



public class SquareAP {
    //import java.util.Scanner;
        public static void main(String[] args) {
            Square sq = new Square();
            //Scanner sc = new Scanner();
            //sq.side=sc.nextInt();
            sq.side=3;
            System.out.println("Area of Square = "+sq.area());
            System.out.println("Perimeter of Square = "+sq.perimeter());

        }
    }

