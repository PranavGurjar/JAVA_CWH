
//Using Constructer With Overloading
class Rectangle{
    private int length;
    private int breadth;

    public Rectangle(int l, int b){
        this.length=l;
        this.breadth=b;
    }

    public Rectangle(){
        this.length=4;
        this.breadth=5;
    }

    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }


	      /*
	      public void setlength(int l){
	      	this.length=l;
	      }
	      public void setbreadth(int b){
	      	this.breadth=b;
	      }
	      */





}






public class RectangleMeOver {
    public static void main(String[] args) {
        Rectangle r=new Rectangle(6,7);

        System.out.println(r.getLength());

        System.out.println(r.getBreadth());

    }
}