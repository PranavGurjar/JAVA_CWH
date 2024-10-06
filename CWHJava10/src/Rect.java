class Rectangle1 {
    public int l;
    public int w;

    public void setL(int l) {
        this.l = l;
    }

    public void setW(int w) {
        this.w = w;
    }


    public int getL() {
        return l;
    }

    public int getW() {
        return w;
    }


    public double getRArea() {
        return this.l * this.w;
    }

    public double getRPerimeter() {
        return 2 * this.l + 2 * this.w;
    }

}

class Cuboid1 extends Rectangle1 {
    public int h;

    public void setH(int h) {
        this.h = h;
    }


    public int getH() {
        return h;
    }


    public double getCArea() {
        return 2 * (w * l) + 2 * (h * l) + 2 * (h * w);
    }

    public double getCVolume() {
        return this.w * this.h * this.l;
    }
}

public class Rect {
    public static void main(String[] args) {
        // Creating a Cuboid1 object with given dimensions
        Rectangle1 r1 = new Rectangle1();
        Cuboid1 c1 = new Cuboid1();


        r1.setL(2);
        r1.setW(3);


        c1.setL(2);
        c1.setW(3);
        c1.setH(4);


        System.out.println("Area of rectangle = " + r1.getRArea());
        System.out.println("Perimeter of rectangle = " + r1.getRPerimeter());
        System.out.println("Surface Area of cuboid = " + c1.getCArea());
        System.out.println("Volume of cuboid = " + c1.getCVolume());
    }
}
