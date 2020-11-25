package JavaStreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sortmethod {
    public static void main(String[] args) {
         List<Student> students = Arrays.asList(
                                    new Student(1,"John","React.js"),
                                    new Student(2,"Michael","Java"),
                                    new Student(3,"joe","Springboot"),
                                    new Student(4,"Jack","Angular"),
                                    new Student(5,"Sam","Java")
                                     );

    //sorting:-
    List<Student> sortedList = students.stream()
                                .sorted(Comparator.comparing(Student::getStudentId)
                                .reversed()).collect(Collectors.toList());

    sortedList.forEach(System.out::println);
    }
}
