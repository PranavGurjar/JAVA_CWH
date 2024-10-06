

class CylinderMeas{
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

    public double getCyArea(){
        return Math.PI*radius*radius*height;
    }

    public double getCyVolume(){
        return 2*Math.PI*radius*height+2*Math.PI*radius*radius;
    }


}






public class CylinderMeasure {
    public static void main(String[] args) {
        CylinderMeas c = new CylinderMeas();
        c.setRadius(9);
        int a = c.getRadius();
        System.out.println(a);

        c.setHeight(12);
        int b = c.getHeight();
        System.out.println(b);

        System.out.println(c.getCyArea());

        System.out.println(c.getCyVolume());
    }
}