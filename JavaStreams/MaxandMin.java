package JavaStreams;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxandMin {
    public static void main(String[] args) {
         List<Student> students = Arrays.asList(
                                    new Student(-1,"John","React.js"),
                                    new Student(2,"Michael","Java"),
                                    new Student(3,"joe","Springboot"),
                                    new Student(4,"Jack","Angular"),
                                    new Student(5,"Sam","Java")
                                     );
      //max 
      System.out.println("Student having Max id :-");
    students.stream().max(Comparator.comparing(Student::getStudentId))
                      .ifPresent(System.out::println);

      //min
        System.out.println("Student having Min id :-");
    students.stream().min(Comparator.comparing(Student::getStudentId))
                          .ifPresent(System.out::println);;       
    }
}
