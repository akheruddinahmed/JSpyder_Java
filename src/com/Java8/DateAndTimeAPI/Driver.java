package com.Java8.DateAndTimeAPI;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Driver {
    public static void main(String[] args) {
//        System.out.println(LocalDateTime.now());//To Print System Date and Time
//        System.out.println(LocalDate.now()); //To Print System Date
//        System.out.println(LocalTime.now()); //To Print System Time
//
//
//
//        System.out.println(LocalDate.of(2026,03,21)); //Creating Custom Date
//        System.out.println(LocalTime.of(4,18)); //Creating Custom Time
//        System.out.println(LocalDateTime.of(2000, Month.OCTOBER,8,12,12,12));//Creating Custom Date and Time



        //Find Different Time and Date based on Zone

        ZoneId india =ZoneId.of("Asia/Kolkata");
        ZonedDateTime now=ZonedDateTime.now(india);
        System.out.println("Time in India"+now);

        ZoneId paris =ZoneId.of("Europe/Paris");
        ZonedDateTime now1=ZonedDateTime.now(paris);
        System.out.println("Time in Paris"+now1);



        //converting same time  from one timezone to another zone
        /*
        	•	now(zone) → get time of that zone
	        •	withZoneSameInstant() → convert same time to another zone
         */
        ZonedDateTime europe=now.withZoneSameInstant(ZoneId.of("Europe/Paris"));
        System.out.println("europe "+europe);
        System.out.println("india "+now);

        //Convert the format of Date

        DateTimeFormatter ofPattern =DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String format=now.format(ofPattern);
        System.out.println("My format "+format);


        // Difference bet AM AND PM (INTERVIEW QSTN)

        LocalDateTime dateTime =LocalDateTime.of(LocalDate.of(2026,03,23),LocalTime.of(10,0));

        LocalDateTime dateTime1 =LocalDateTime.of(LocalDate.of(2026,03,23),LocalTime.of(23,0));

        long hours=ChronoUnit.HOURS.between(dateTime,dateTime1);
        System.out.println(hours);


        //Add,Minus Days,Months

        LocalDate date =LocalDate.now();
        System.out.println(date);
        System.out.println(date.plusDays(5));
        System.out.println(date.minusDays(2));
        System.out.println(date.plusMonths(2));
        System.out.println(date.plusDays(-5));
        System.out.println(date.plusMonths(-2));




        //convert date to String
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String datee = "2026-03-24";

        LocalDate parse = LocalDate.parse(datee, formatter);
        System.out.println(parse);




        //can functional interface inherit any other interface?







    }
}
