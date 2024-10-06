package Com.Harry;

public class Circle extends Size{
    Circle(int dim1){
        super(dim1, -1);
    }

    public double area(){
        return Math.PI * this.dim1 * this.dim1;
    }
}

