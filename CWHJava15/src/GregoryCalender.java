import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class GregoryCalender {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        GregorianCalendar g = new GregorianCalendar();
        System.out.println(g.isLeapYear(2020));
        System.out.println(g.isLeapYear(2022));



        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));



        System.out.println("Date before rolling : " + c.getTime());
        c.roll(Calendar.MONTH, true);
        c.roll(Calendar.DATE, false);
        c.roll(Calendar.YEAR, true);
        System.out.println("Date after rolling : " + c.getTime());





        System.out.println("Calendar : " + c.getTime());
        System.out.println("The hashcode for this calendar is : "+ c.hashCode());




//        System.out.println("All Timezone On World : ");
//        for (int i = 0; i < TimeZone.getAvailableIDs().length; i++) {
//            System.out.println(TimeZone.getAvailableIDs()[i]);
//        }

    }
}
