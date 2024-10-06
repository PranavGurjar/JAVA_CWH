abstract class Parent
{
    public Parent(){
        System.out.println("parent class constructor");
    }
    public void hello(){
        System.out.println("Hello World");
    }
    public void intro(){
        System.out.println("I am Pranav");
    }
    abstract public void greet();
    abstract public void greet1();

}

class Child extends Parent
{
    public void greet(){
        System.out.println("Good Mornig");
    }
    public void greet1(){
        System.out.println("Good Mornig");
    }
}

abstract class Child1 extends Parent
{
    public void greet1(){
        System.out.println("Good Mornig");
    }
}


public class Abstraction {
    public static void main(String[] args) {
        //Parent p1 = new Parent();

        //Child1 ch2 = new Child1();

        Parent p11 = new Child();

        Child ch1 = new Child();

    }
}