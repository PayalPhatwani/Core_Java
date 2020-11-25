package JavaStreams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Filtermethod {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                                    new Student(1,"John","React.js"),
                                    new Student(2,"Michael","Java"),
                                    new Student(3,"joe","Springboot"),
                                    new Student(4,"Jack","Angular"),
                                    new Student(5,"Sam","Java")
                                     );
        //Imparative Approach
        List<Student> javaStudents = new ArrayList<>();

        for(Student s : students){
            if(s.getStudentCourse().equals("Java")){
                javaStudents.add(s);
            }
        }
        System.out.println("without  using streams:-");
        javaStudents.forEach(System.out::println);

        //declarative approach
        List<Student> javaStudents2 = students.stream()
                                      .filter(student->student.getStudentCourse().equals("Java"))
                                      .collect(Collectors.toList());

        System.out.println("by using streams:-");
         javaStudents2.forEach(System.out::println);
    }
}
