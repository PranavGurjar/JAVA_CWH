interface MyQ4Interface{
    void display();
}


public class Q4InterfaceAnonymousClass {
    public static void main(String[] args) {
        MyQ4Interface mq = new MyQ4Interface() {
            @Override
            public void display() {
                System.out.println("I am Display of the Interface");
            }
        };

        //call object
        mq.display();
    }
}
