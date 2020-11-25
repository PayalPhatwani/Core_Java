package JavaStreams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapmethod {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                                    new Student(-1,"John","React.js"),
                                    new Student(2,"Michael","Java"),
                                    new Student(3,"joe","Springboot"),
                                    new Student(4,"Jack","Angular"),
                                    new Student(5,"Sam","Java")
                                     );

    //map method
    List<String> students2 = students.stream()
                            .map(student->student.getStudentName().toUpperCase())
                            .collect(Collectors.toList());
    
    System.out.println("Student list in capital:-");
    students2.forEach(System.out::println);

    }
}
