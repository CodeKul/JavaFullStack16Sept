package java8;

import java.time.*;
import java.util.Date;

public class LocalDateDemo {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        System.out.println(System.currentTimeMillis());
        Date  d1= new Date(1639136058931L);
        System.out.println(d1);

        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.now().plusDays(1);
        LocalDate localDate2 = LocalDate.now().minusDays(1);
        int localDate4 = LocalDate.now().getDayOfMonth();
        String localDate5 = String.valueOf(LocalDate.now().getDayOfWeek());

        System.out.println(localDate5);

        ZoneId zoneId = ZoneId.of("America/Chicago");
        System.out.println(zoneId);

        LocalDate localDate3 = LocalDate.now(zoneId);

        LocalTime localTime = LocalTime.now(zoneId);
        System.out.println(localDate3);
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate localDate6 = LocalDate.of(2021,12,10);
        LocalDate localDate7 = LocalDate.of(2022,1,1);

        Period period = Period.between(localDate6,localDate7);
        System.out.println();
        System.out.println(period);

        LocalTime localTime1 = LocalTime.of(20,30,40);
        LocalTime localTime2 = LocalTime.of(9,50,12);

        Duration duration = Duration.between(localTime1,localTime2);
        System.out.println(duration);

    }
}
