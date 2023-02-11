package dev.student.util;

import dev.student.entity.Student;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Класс для вывода информации
 * @version 1.0
 */
public class PrintingInfo {
    /* Пунктирная линия */
    public final static String DOTTED_LINE = "---------------------------------------------------";

    /**
     * Метод для вывода информации о студенте
     * @param student - объект студента
     */
    public static void printDataStudent(Student student) {
        StringBuilder builder = new StringBuilder();
        builder.append("ID: " + student.getId())
                .append(String.format("\nИмя: %s %s %s", student.getName().getLastName(), student.getName().getFirstName(),
                        (student.getName().getMiddleName() == null ? "" : student.getName().getMiddleName())))
                .append("\nВозраст: " + student.getAge() + " лет/год(-а)")
                .append("\nОценка: " + student.getRating())
                .append("\nСтрана: " + student.getCountry().getName());
        String data = builder.toString();
        System.out.println(String.format("%s%n%s", data, DOTTED_LINE));
    }

    /**
     * Метод для вывода информации о студентах из списка
     * @param students - список студентов
     */
    public static void printDataListStudents(List<Student> students) {
        System.out.println(DOTTED_LINE);
        students.forEach(PrintingInfo::printDataStudent);
    }

    /**
     * Метод для вывода даты и времени
     * @param formatter
     */
    public static void printDateTime(DateTimeFormatter formatter) {
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        String dateTime = localDateTimeNow.format(formatter);
        System.out.println(dateTime);
    } 
}
