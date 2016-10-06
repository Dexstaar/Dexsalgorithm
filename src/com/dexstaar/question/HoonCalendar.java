package com.dexstaar.question;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class HoonCalendar {
    public int getDateCount(LocalDate fromDate, LocalDate toDate){
        //LocalDate localDate = new LocalDate();

        int period = (int)fromDate.until(toDate, ChronoUnit.DAYS);

        return period;
    }
}
