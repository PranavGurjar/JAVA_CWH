package Com.Harry;

public class Shape{
    public static void main(String[] args) {
        Size sp = new Size(2, 3);
        System.out.println("Dim1 = "+sp.getDim1());
        System.out.println("Dim2 = "+sp.getDim2());

        Circle cr = new Circle(2);
        System.out.println("Circle Area: " + cr.area());

        Square sq = new Square(4);
        System.out.println("Square Area: " + sq.area());

        Rectangle rect = new Rectangle(2, 5);
        System.out.println("Rectangle Area: " + rect.area());

        Sphere sphere = new Sphere(3);
        System.out.println("Sphere Area: " + sphere.area());

        Cyclinder cylinder = new Cyclinder(3, 5);
        System.out.println("Cylinder Area: " + cylinder.area());
    }
}
    

/*
 
OUTPUT:-

 
PS C:\Users\PRANAV\Desktop\Java\Ex5> javac -d . *.java
PS C:\Users\PRANAV\Desktop\Java\Ex5> java Com/Harry/Shape
Dim1 = 2
Dim2 = 3
Circle Area: 12.566370614359172
Square Area: 16
Rectangle Area: 10
Sphere Area: 113.09733552923255
Cylinder Area: 150.79644737231007
PS C:\Users\PRANAV\Desktop\Java\Ex5> 
  

 */

