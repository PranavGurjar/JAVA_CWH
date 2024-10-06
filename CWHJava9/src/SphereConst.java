//using constructor

class Spheress{

    private int rad;

    public Spheress(int r){
        this.rad=r;
    }

    public double spArea(){
        return 4*Math.PI*rad*rad;
    }
    public double spVolume(){
        return (4.0/3.0)*Math.PI*(rad*rad*rad);
    }
}



public class SphereConst {
    public static void main(String[] args) {
        Spheress sp = new Spheress(22);

        System.out.println(sp.spArea());

        System.out.println(sp.spVolume());
    }
}