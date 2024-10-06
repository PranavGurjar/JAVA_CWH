
class Spheres{

    private int rad;

    public void setRadius(int r){
        this.rad=r;
    }
    public double spArea(){
        return 4*Math.PI*rad*rad;
    }
    public double spVolume(){
        return (4.0/3.0)*Math.PI*(rad*rad*rad);
    }
}



public class Sphere {
    public static void main(String[] args) {
        Spheres sp = new Spheres();

        sp.setRadius(22);

        System.out.println(sp.spArea());

        System.out.println(sp.spVolume());
    }
}