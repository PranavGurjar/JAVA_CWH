
    class Rectangle{
        public int l;
        public int w;

        public Rectangle(int len, int wid){
            this.l=len;
            this.w=wid;
        }

        public double rArea(){
            return this.l*this.w;
        }

        public double rPerimeter(){
            return 2*this.l+2*this.w;
        }

    }

    class Cuboid extends Rectangle{
        public int h;

        public Cuboid(int len, int wid, int hei){
            super(len, wid);
            this.h=hei;
        }

        public double surArea(){
            return 2*(w * l ) + 2*(h * l ) + 2*(h * w);
        }

        public double volume(){
            //V=whl
            return this.w*this.h*this.l;
        }

    }




    public class RectangleCuboid {
        public static void main(String[] args) {
            //Rectangle rec = new Rectangle();
            //Rectangle rcb = new Cuboid(2, 3, 4);

            Cuboid rcb = new Cuboid(2,3,4);
            System.out.println("area of rectangle = "+rcb.rArea());
            System.out.println("perimeter of rectangle = "+rcb.rPerimeter());
            System.out.println("surface area of cuboid = "+rcb.surArea());
            System.out.println("volume of cuboid = "+rcb.volume());
        }
    }
