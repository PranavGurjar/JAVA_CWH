
    class TommyVer{
        public void hit(){
            System.out.println("Hitting the enemy");
        }
        public void run(){
            System.out.println("running from the enemy");
        }
        public void fire(){
            System.out.println("firing on the enemy");
        }
    }


    public class TommyVernity {
        public static void main(String[] args) {
            TommyVer player1 = new TommyVer();

            player1.hit();
            player1.run();
            player1.fire();

        }
    }


