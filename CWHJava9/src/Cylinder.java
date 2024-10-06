

class Cylinders{
    private int radius;
    private int height;

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


}






public class Cylinder {
    public static void main(String[] args) {
        Cylinders c = new Cylinders();
        c.setRadius(9);
        int a = c.getRadius();
        System.out.println(a);

        c.setHeight(12);
        int b = c.getHeight();
        System.out.println(b);

    }
}