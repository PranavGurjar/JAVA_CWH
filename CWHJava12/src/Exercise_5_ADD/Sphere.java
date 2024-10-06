package Com.Harry;

public class Sphere extends Size{
    Sphere(int dim1){
        super(dim1, -1);
    }

    public double area(){
        return 4 * Math.PI * this.dim1 * this.dim1;
    }
}

