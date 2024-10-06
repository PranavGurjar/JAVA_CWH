//Problem 6 Tv Remote two interface

interface TvRemote{
    void Channel();
    void volume();
    void switchOn();
}
interface SmartTvRemote extends TvRemote{
    void voiceAssist();
    void androidApp();
}

//Problem 7 class TV implements use tv remote interface
class TV implements SmartTvRemote{
    public void remote(){
        System.out.println("Normal Remote...");
    }
    @Override
    public void Channel() {
        System.out.println("change channel...");
    }

    @Override
    public void volume() {
        System.out.println("Volume Up and Down...");
    }

    @Override
    public void switchOn() {
        System.out.println("On TV...");
    }

    @Override
    public void voiceAssist() {
        System.out.println("i am a voice assistant...");
    }

    @Override
    public void androidApp() {
        System.out.println("android apps working ...");
    }
}



public class TvRemoteClass {
    public static void main(String[] args) {
        System.out.println("-----class TV---------");
        TV tvs = new TV();
        tvs.remote();
        tvs.Channel();
        tvs.volume();
        tvs.switchOn();
        tvs.voiceAssist();
        tvs.androidApp();

        System.out.println("--------interface TvRemote-------");
        TvRemote tr = new TV();
        tr.Channel();
        tr.volume();
        tr.switchOn();

        System.out.println("---------interface SmartTvRemote---------");
        SmartTvRemote str = new TV();
        str.voiceAssist();
        str.androidApp();
    }
}
