
    class Circle{
        double pi;
        int r;

        public double area(){
            return pi*r*r;
        }
        public double perimeter(){
            return 2*pi*r;
        }
    }

    public class CircleAP {
        public static void main(String[] args) {
            Circle cr = new Circle();

            cr.pi=3.1415;
            cr.r=4;

            System.out.println("Area of Circle = "+cr.area());
            System.out.println("Perimeter of Circle = "+cr.perimeter());

        }
    }


