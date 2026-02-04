import java.time.*;
import java.util.Calendar;
import java.util.Date;

public class Lect25 {
    public static void main(String[] args) {
        Date current = new Date();
        Date birthday = new Date(2006, 01, 13);
        System.out.println(birthday);
        System.out.println(current);

        Calendar calendar = Calendar.getInstance();

        int era = calendar.get(Calendar.ERA);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK); int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE); int second = calendar.get(Calendar.SECOND);
        System.out.println(era);
        System.out.println(year);
        System.out.println(month);

        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDate date = LocalDate.of(2019, Month.FEBRUARY, 22);
        System.out.println(date);
        Instant timestamp = Instant.now();
        System.out.println(timestamp);

        ZoneId zone = ZoneId.of("Africa/Cairo");
        ZonedDateTime time = ZonedDateTime.now(zone);
        System.out.println(time);



    }
}
