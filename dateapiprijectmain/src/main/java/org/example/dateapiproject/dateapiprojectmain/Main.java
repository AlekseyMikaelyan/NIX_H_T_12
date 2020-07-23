package org.example.dateapiproject.dateapiprojectmain;

import org.example.dateapiproject.dateapiprojectutil.util.FirstTask;
import org.example.dateapiproject.dateapiprojectutil.util.LocalDateTimeList;
import org.example.dateapiproject.dateapiprojectutil.util.SecondTask;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача №1: ");

        System.out.println("Найбольшее растояние между двумя датами : " + SecondTask.durationBetweenTwoLocalDateTime(LocalDateTimeList.createAList()) + " секунд.");

        System.out.println();

        System.out.println("Задача №2: ");

        Map<LocalDate, Set<LocalTime>> map = FirstTask.makeADictionary(LocalDateTimeList.createAList());
        for(Map.Entry<LocalDate,Set<LocalTime>> entry : map.entrySet()) {
            System.out.println("Уникальная дата: " + entry.getKey() + ", время: " + entry.getValue());
        }

    }
}
