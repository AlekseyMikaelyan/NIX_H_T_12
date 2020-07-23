package org.example.dateapiproject.dateapiprojectutil.util;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class SecondTask {
    public static long durationBetweenTwoLocalDateTime(List<LocalDateTime> list) {
        list.stream()
                .sorted()
                .forEach(System.out::println);

        Duration duration = Duration.between(list.get(0), list.get(list.size()-1));
        return duration.toSeconds();

    }
}
