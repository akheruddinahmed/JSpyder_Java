package com.Java8.DateAndTimeAPI;

import java.time.*;

public class Practice {
    public static void main(String[] args) {
        //Period (Date based)

//        LocalDate dob =LocalDate.of(2000, Month.OCTOBER,8);
//        LocalDate today=LocalDate.now();
//        Period period =Period.between(dob,today);
//        System.out.println(period);
//        System.out.println("Years:  "+period.getYears());
//        System.out.println("Months:  "+period.getMonths());
//        System.out.println("Day:  "+period.getDays());

        //Duration (Time-Based)
        LocalTime start =LocalTime.of(8,0);
        LocalTime end =LocalTime.of(10,0);

        Duration duration =Duration.between(start,end);
        System.out.println("Hours: "+duration.toHours());
        System.out.println("Minutes: "+duration.toMinutes());
        System.out.println("Seconds: "+duration.toSeconds());



    }
}
