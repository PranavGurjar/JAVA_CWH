
//super keyword using in constructor

class upper{
    public upper(){
        System.out.println("I am upper constructer");
    }
    public upper(int x){
        System.out.println("I am upper constructer with value = "+x);
    }

}
class middle extends upper{
    public middle(){
        System.out.println("I am middle constructer");
    }
    public middle(int x, int y){
        super(x);
        System.out.println("I am middle constructer with value = "+y);
    }

}
class lower extends middle{
    public lower(){
        System.out.println("I am lower constructer");
    }
    public lower(int x, int y, int z){
        super(x,y);
        System.out.println("I am lower constructer with value = "+z);
    }
}




public class SuperConstructor {
    public static void main(String[] args) {
        lower lw = new lower();

        lower w = new lower(12, 14, 16);
    }
}
