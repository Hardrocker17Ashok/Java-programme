import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;

public class calender {
    public static void main(String[] args) {
        Calendar d1 = Calendar.getInstance();
        // We calculate current calender time zone
        System.out.println(d1);

        // we use constructor method of date
        System.out.println(d1.get(Calendar.DATE));
        System.out.println(d1.get(Calendar.YEAR));
        System.out.println(d1.get(Calendar.MINUTE));
        System.out.println(d1.get(Calendar.SECOND));
        System.out.println(d1.get(Calendar.HOUR));
        System.out.println(d1.get(Calendar.HOUR_OF_DAY));
        System.out.println(d1.get(Calendar.DAY_OF_MONTH));
        System.out.println(d1.get(Calendar.DAY_OF_WEEK));
        System.out.println(d1.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(d1.get(Calendar.DAY_OF_YEAR));

        // other calendar
        LocalDate d = LocalDate.now();
        System.out.println("current date is=" + d);
        LocalTime t = LocalTime.now();
        System.out.println("current time is=" + t);
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("current date and time is=" + dt);
    }
}
