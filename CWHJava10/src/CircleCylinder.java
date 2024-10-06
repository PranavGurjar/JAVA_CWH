
    class Circle{
        public int r;

        public Circle(){
            System.out.println("circle constructor only ");
        }

        public Circle(int rad){
            System.out.println("circle constructor with radius ");
            this.r=rad;
        }

        public double area(){
            return Math.PI*this.r*this.r;
        }

        public double perimeter(){
            return 2*Math.PI*this.r;
        }

    }

    class Cylinder extends Circle{
        public int h;

        public Cylinder(int rad, int hght){
            super(rad);
            this.h=hght;
            System.out.println("Cylinder constructor");
        }

        public double surArea(){
            //A=2πrh+2πr^2
            return 2*Math.PI*this.r*this.h + 2*Math.PI*this.r*this.r;
        }

        public double volume(){
            //V=πr2h
            return Math.PI*this.r*this.r*this.h;
        }

    }




    public class CircleCylinder {
        public static void main(String[] args) {
            //Circle cr = new Circle();
            Cylinder cy = new Cylinder(4, 3);

        }
    }
