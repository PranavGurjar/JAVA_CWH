class Circle1{
    public int r;

    public Circle1(int rad){
        this.r=rad;
    }

    public double area(){
        return Math.PI*this.r*this.r;
    }

    public double circum(){
        return 2*Math.PI*this.r;
    }

}

class Cylinder1 extends Circle1 {
    public int h;

    public Cylinder1(int rad, int hght){
        super(rad);
        this.h=hght;
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




public class Circl {
    public static void main(String[] args) {
        //Circle1 cr = new Circle1();
        Cylinder1 cy = new Cylinder1(2, 3);
        System.out.println("area of Circle1 = "+cy.area());
        System.out.println("circumference of Circle1 = "+cy.circum());
        System.out.println("surface area of Cylinder1 = " +cy.surArea());
        System.out.println("volume of Cylinder1 = "+cy.volume());
    }
}

