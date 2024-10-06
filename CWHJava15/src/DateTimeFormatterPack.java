import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterPack {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        String myDate = dt.format(dtf);
//        System.out.println(myDate);

//        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy --E H:m a ");
//        String mDate = dt.format(df);
//        System.out.println(mDate);



//        DateTimeFormatter df = DateTimeFormatter.ISO_WEEK_DATE;//
//        String myDate = dt.format(df);
//        System.out.println("Date in ISO_WEEK_DATE Format  : "+ myDate);



//        DateTimeFormatter dtf1 = DateTimeFormatter.ISO_LOCAL_TIME;
//        String myDate1 = dt.format(dtf1);
//        System.out.println(myDate1);


        DateTimeFormatter df = DateTimeFormatter.ISO_ORDINAL_DATE;//
        String myDate = dt.format(df);
        System.out.println("Date in ISO_WEEK_DATE Format  : "+ myDate);
    }
}
