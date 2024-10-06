import java.time.*;
import java.time.format.DateTimeFormatter;

public class TimeApi {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        Clock cl = Clock.systemDefaultZone();
        System.out.println(cl.getZone());

        Clock cl1 = Clock.systemUTC();
        System.out.println(cl1.instant());


//        Duration d1 = Duration.between(LocalTime.MIN,LocalTime.NOON);  //LocalTime.MIN = '00:00' , LocalTime.NOON = '12:00'
//        System.out.println(d1.isNegative());
//        Duration d2 = Duration.between(LocalTime.MAX,LocalTime.MIN);  //LocalTime.MAX =  '23:59:59.999999999' ,  LocalTime.MIN = '00:00'
//        System.out.println(d2.isNegative());



//        Duration d1 = Duration.between(LocalTime.MIN,LocalTime.MIDNIGHT);  //LocalTime.MIN = '00:00' , LocalTime.NOON = '00:00'
//        System.out.println(d1.isZero());
//        Duration d2 = Duration.between(LocalTime.MAX,LocalTime.MIN);  //LocalTime.MAX =  '23:59:59.999999999' ,  LocalTime.MIN = '00:00'
//        System.out.println(d2.isZero());



        LocalDate d02 = LocalDate.parse("2021-05-27");
        System.out.println(d02.withYear(2001));


//        System.out.println("Time before : "  + t);
//        LocalTime t1= t.plusHours(5);
//        System.out.println("Time after adding 5 hours : " + t1);



        System.out.println("Time before : "  + t);
        LocalTime t1= t.minusMinutes(8);
        System.out.println("Time after subtracting 8 minutes : " + t1);

    }
}
