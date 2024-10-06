import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class DateApiQ4 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();  //this is date and time object

        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s");  //this is format of date and time
        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("dd:MM:yyyy");

        String time  = dt.format(df);   // this is String is contain the date and time
        String date  = dt.format(df1);

        System.out.println(time);
        System.out.println(date);
    }
}
