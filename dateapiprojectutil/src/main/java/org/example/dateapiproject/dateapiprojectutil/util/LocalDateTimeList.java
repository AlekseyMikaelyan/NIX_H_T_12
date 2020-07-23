package org.example.dateapiproject.dateapiprojectutil.util;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class LocalDateTimeList {
    public static List<LocalDateTime> createAList() {
        List<LocalDateTime> list = new ArrayList<>();
        list.add(LocalDateTime.of(2017, Month.APRIL, 17, 12, 9, 8));
        list.add(LocalDateTime.of(2011, Month.MAY, 10, 19, 7, 18));
        list.add(LocalDateTime.of(2019, Month.AUGUST, 8, 10, 50, 7));
        list.add(LocalDateTime.of(2019, Month.AUGUST, 8, 12, 54, 7));
        list.add(LocalDateTime.of(2010, Month.JUNE, 9, 8, 23, 56));
        list.add(LocalDateTime.of(2008, Month.JANUARY, 14, 3, 2, 1));
        list.add(LocalDateTime.of(2014, Month.MAY, 4, 13, 9, 54));
        list.add(LocalDateTime.of(2014, Month.MAY, 4, 10, 19, 54));
        list.add(LocalDateTime.of(2003, Month.FEBRUARY, 28, 8, 9, 4));
        list.add(LocalDateTime.of(2017, Month.MARCH, 11, 15, 3, 12));
        list.add(LocalDateTime.of(2017, Month.MARCH, 11, 8, 13, 10));
        list.add(LocalDateTime.of(2017, Month.MARCH, 11, 12, 26, 4));
        list.add(LocalDateTime.of(2017, Month.OCTOBER, 23, 12, 15, 46));

        return list;
    }
}
