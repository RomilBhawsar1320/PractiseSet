package dateutil;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);//My system is indian so India Time
        System.out.println(date.toInstant());//global time
        //Date is not recommended to use these days
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
        // use LocalDate for Date and LocalTime for current time
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);
        //Zoned Time
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/London"));
        System.out.println(zonedDateTime);
        //DateTimeFormatter
//        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("YYYY-MM-DD HH:MM:SS");
//        String formattedDateTime = currentDate.format(pattern);
//        System.out.println(formattedDateTime);




    }


}
