interface MyCamera{
    void takeSnap();
    void recordVideo();
    private void torch(){
        System.out.println("Start torch ...");
    }
    private void greet(){
        System.out.println("Good Day");
    }
    //default method is implement here
    default void record4kVideo(){
        greet();
        torch();
        System.out.println("Recording 4k Video ...");
    }
}
interface MyWiFi{
    String[] getNetwork();
    void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phoneNo){
        System.out.println("My Phone Number = "+phoneNo);
    }

    void pickCall(){
        System.out.println("Pick Call Connecting...");
    }
}

class MySmartPhone extends MyCellPhone implements MyCamera, MyWiFi{
    public void takeSnap(){
        System.out.println("Taking Snap ...");
    }
    //method overriding is here
//    public void record4kVideo(){
//        System.out.println("taking snap and recording 4k video ...");
//    }
    public void recordVideo(){
        System.out.println("Recording Video ...");
    }

    public String[] getNetwork(){
        System.out.println("Getting Network List ...");
        String[] networkList={"jio", "airtel", "bsnl"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting To Network ..."+network);
    }


	/*
	public void takeSnap(){
		System.out.println("Taking Snap ...");
	}
	*/
}




public class InterfaceInherit {
    public static void main(String[] args) {
        MySmartPhone sm = new MySmartPhone();
        sm.takeSnap();
        sm.record4kVideo();
        sm.callNumber(1951);

        String[] arr = sm.getNetwork();
        for(String item: arr)
        {
            System.out.println(item);
        }
    }
}



//package com.company;
//
//interface MyCamera{
//    void takeSnap();
//    void recordVideo();
//    private void greet(){
//        System.out.println("Good Morning");
//    }
//    default void record4KVideo(){
//        greet();
//        System.out.println("Recording in 4k...");
//    }
//}
//
//interface MyWifi{
//    String[] getNetworks();
//    void connectToNetwork(String network);
//}
//
//class MyCellPhone{
//    void callNumber(int phoneNumber){
//        System.out.println("Calling "+ phoneNumber);
//    }
//    void pickCall(){
//        System.out.println("Connecting... ");
//    }
//
//}
//
//class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
//    public void takeSnap(){
//        System.out.println("Taking snap");
//    }
//    public void recordVideo(){
//        System.out.println("Taking snap");
//    }
//    //    public void record4KVideo(){
////        System.out.println("Taking snap and recoding in 4k");
////    }
//    public String[] getNetworks(){
//        System.out.println("Getting List of Networks");
//        String[] networkList = {"Harry", "Prashanth", "Anjali5G"};
//        return networkList;
//    }
//    public void connectToNetwork(String network){
//        System.out.println("Connecting to " + network);
//    }
//}
//public class InterfaceInherit {
//    public static void main(String[] args) {
//        MySmartPhone ms = new MySmartPhone();
//        ms.record4KVideo();
//        // ms.greet(); --> Throws an error!
//        String[] ar = ms.getNetworks();
//        for (String item: ar) {
//            System.out.println(item);
//        }
//    }
//}