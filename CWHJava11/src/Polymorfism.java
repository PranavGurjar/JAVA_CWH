interface Camera{
    void photo();
    void video();
}

interface Gps{
    void location();
}

interface Wifi{
    void wifiNetwork();
    String[] getNetwork();
}

interface MediaPlayer{
    void playMovie();
}

class CellPhone{
    public void connectCall(){
        System.out.println("Connecting... ");
    }
    public void pickCall(){
        System.out.println("Pickup Call...");
    }
}

class SmartPhone extends CellPhone implements Camera, Gps, Wifi, MediaPlayer{
    @Override
    public void photo() {
        System.out.println("click photo..");
    }

    @Override
    public void video() {
        System.out.println("record the video..");
    }

    @Override
    public void wifiNetwork() {
        System.out.println("connecting to on wifi network");
    }

    @Override
    public String[] getNetwork() {
        System.out.println("All Network");
        String[] arr = {"jio", "airtel", "bsnl"};
        return arr;
    }

    @Override
    public void location() {
        System.out.println("Your Location...");
    }

    @Override
    public void playMovie() {
        System.out.println("Playing Movie On MediaPlayer");
    }
}





public class Polymorfism {
    public static void main(String[] args) {
        System.out.println("************-----Polymorfism-------**************");
//        SmartPhone ms = new SmartPhone();
//        ms.photo();
//        ms.video();
//        ms.location();
//        ms.wifiNetwork();
//        ms.pickCall();
//        ms.connectCall();
//        ms.playMovie();
//        String[] ar = ms.getNetwork();
//        for(String item : ar){
//            System.out.println(item);
//        }


        // Polymorfism
        System.out.println("--------Camera---------");
        Camera cam = new SmartPhone();
        cam.photo();
        cam.video();

//        cam.location();      // it is not allow
        System.out.println("--------Gps---------");
        Gps g = new SmartPhone();
        g.location();

        System.out.println("--------Wifi---------");
        Wifi wf = new SmartPhone();
        String[] ar = wf.getNetwork();
        for(String item : ar){
           System.out.println(item);
        }
        wf.wifiNetwork();

        System.out.println("--------CellPhone---------");
        CellPhone cp = new SmartPhone();
        cp.connectCall();
        cp.pickCall();

        System.out.println("--------MediaPlayer---------");
        MediaPlayer mp= new SmartPhone();
        mp.playMovie();



    }
}
