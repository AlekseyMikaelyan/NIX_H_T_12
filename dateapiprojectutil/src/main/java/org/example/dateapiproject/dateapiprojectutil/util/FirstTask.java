package org.example.dateapiproject.dateapiprojectutil.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

public class FirstTask {

    public static Map<LocalDate, Set<LocalTime>> makeADictionary(List<LocalDateTime> list) {

        return list.stream()
                .collect
                        (Collectors.groupingBy(LocalDateTime::toLocalDate,
                                Collectors.mapping(LocalDateTime::toLocalTime, Collectors.toSet())));

    }
}
