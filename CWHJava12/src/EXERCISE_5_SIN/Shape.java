package Com.PRMSize;

class Size{
    public int dim1, dim2;

    public Size(int dim1, int dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public int getDim1(){
        return this.dim1;
    }

    public int getDim2(){
        return this.dim2;
    }

    public void setDim1(int dim1){
        this.dim1=dim1;
    }

    public void setDim2(int dim2){
        this.dim2=dim2;
    }
}



class Square extends Size{
    Square(int dim1){
        super(dim1, -1);
    }

    public int area(){
        return this.dim1 * this.dim1;
    }
}

class Rectangle extends Size{
    Rectangle(int dim1, int dim2){
        super(dim1, dim2);
    }

    public int area(){
        return this.dim1 * this.dim2;
    }
}

class Sphere extends Size{
    Sphere(int dim1){
        super(dim1, -1);
    }

    public double area(){
        return 4 * Math.PI * this.dim1 * this.dim1;
    }
}

class Cyclinder extends Size{
    Cyclinder(int dim1, int dim2){
        super(dim1, dim2);
    }

    public double area(){
        return 2 * Math.PI * this.dim1 *(this.dim2 + this.dim1);
    }
}

class Circle extends Size{
    Circle(int dim1){
        super(dim1, -1);
    }

    public double area(){
        return Math.PI * this.dim1 * this.dim1;
    }
}




public class Shape {
    public static void main(String[] args) {

        System.out.println("******Size*******");
        Size sz = new Size(2, 3);
        System.out.println("Size Dim1 = "+sz.getDim1());
        System.out.println("Size Dim2 = "+sz.getDim2());

        System.out.println("******Circle******");
        Circle cr = new Circle(2);
        System.out.println("Circle Area = "+cr.area());

        System.out.println("*******Cyclinder******");
        Cyclinder cy = new Cyclinder(2, 3);
        System.out.println("Cylinder Area = "+cy.area());

        System.out.println("********Rectangle********");
        Rectangle rc = new Rectangle(2, 3);
        System.out.println("Rectangle Area = "+rc.area());

        System.out.println("********Sphere********");
        Sphere sp = new Sphere(2);
        System.out.println("Sphere Area = "+sp.area());

        System.out.println("********Square********");
        Square sq = new Square(2);
        System.out.println("Square Area = "+sq.area());
    }
}


/*
OUTPUT :-


PS C:\Users\PRANAV\Desktop\Java\Ex5\EXER5> javac -d . *.java
PS C:\Users\PRANAV\Desktop\Java\Ex5\EXER5> java Com/PRMSize/Shape 
******Size*******
Size Dim1 = 2
Size Dim2 = 3
******Circle******
Circle Area = 12.566370614359172
*******Cyclinder******
Cylinder Area = 62.83185307179586
********Rectangle********
Rectangle Area = 6
********Sphere********
Sphere Area = 50.26548245743669
********Square********
Square Area = 4
PS C:\Users\PRANAV\Desktop\Java\Ex5\EXER5> 


 */