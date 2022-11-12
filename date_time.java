import java.util.Date;

public class date_time {
    public static void main(String[] args) {
        Date d1 = new Date();

        // constructure with date class
        Date dt1 = new Date(1992, 11, 20);
        Date dt2 = new Date(1990, 2, 12);

        // We calculate current date and current time
        System.out.println(d1);

        // we use constructor method of date
        System.out.println(dt1.before(dt2));
        System.out.println(dt1.after(dt2));
        System.out.println(dt1.equals(dt2));

        System.out.println(dt2.getTime());
    }
}
