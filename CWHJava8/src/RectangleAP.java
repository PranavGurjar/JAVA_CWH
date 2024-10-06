
    class Rectangle{
        int l;
        int b;

        public int area(){
            return l*b;
        }
        public int perimeter(){
            return 2*l+2*b;
        }
    }

    public class RectangleAP {
        public static void main(String[] args) {
            Rectangle rect = new Rectangle();

            rect.l=2;
            rect.b=4;

            System.out.println("Area of Rectagle = "+rect.area());
            System.out.println("Perimeter of Rectagle = "+rect.perimeter());

        }
    }



