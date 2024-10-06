//import java.time.*;

import java.util.Date;

public class DateTime {
    public static void main(String[] args) {
        //System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        /*System.out.println(System.currentTimeMillis()/1000/3600/24/365);
                                         1000 is second, 3600 is minute, 24 is day, 365 is year
         */





//        System.out.println(System.currentTimeMillis()/1000/3600/24 + " days from since 1 jan 1970");
//        System.out.println(System.currentTimeMillis()/1000/3600/24/7 + " weeks from since 1 jan 1970");
//        System.out.println(System.currentTimeMillis()/1000/3600/24/30 +" months from since 1 jan 1970");
//        System.out.println(System.currentTimeMillis()/1000/3600/24/365 + " years from since 1 jan 1970");




//        Problem Question
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(System.currentTimeMillis());


        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getDay());
        System.out.println(d.getYear());



//        Date d1= new Date(1621709639111l);
//        System.out.println("The date calculated form miliseconds is : " + d1);


//        System.out.println("The current date is : "+ d.getDate());
//        System.out.println("The current year is : "+ d.getYear()); //19
    }
}
