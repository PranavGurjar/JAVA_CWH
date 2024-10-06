class CellPhone{
    public void ring(){
        System.out.println("ringing... ");
    }
    public void vibrate(){
        System.out.println("vibrating... ");
    }
    public void callFriend(){
        System.out.println("Call Raksha... ");
    }
}



public class cellphones {
    public static void main(String[] args) {
        CellPhone asus = new CellPhone();

            asus.callFriend();
            asus.ring();
            asus.vibrate();

        }

}
