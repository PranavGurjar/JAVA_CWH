//Using Constructer for radius and height
class Cylinderconst{
    private int radius;
    private int height;

    public Cylinderconst(int r, int h){
        this.radius=r;
        this.height=h;
    }




    public void setRadius(int r){
        this.radius=r;
    }
    public int getRadius(){
        return radius;
    }
    public void setHeight(int h){
        this.height=h;
    }
    public int getHeight(){
        return height;
    }

    public double getCyArea(){
        return 3.1415*radius*radius*height;
    }

    public double getCyVolume(){
        return 2*3.1415*radius*height+2*3.1415*radius*radius;
    }


}






public class CylinderConstructor {
    public static void main(String[] args) {

        Cylinderconst c = new Cylinderconst(9, 12);

        int a = c.getRadius();
        System.out.println(a);


        int b = c.getHeight();
        System.out.println(b);

        System.out.println(c.getCyArea());

        System.out.println(c.getCyVolume());
    }
}