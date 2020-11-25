package JavaStreams;
import java.util.Arrays;
import java.util.List;

public class matchMethods {
    public static void main(String[] args) {
         List<Student> students = Arrays.asList(
                                    new Student(-1,"John","React.js"),
                                    new Student(2,"Michael","Java"),
                                    new Student(3,"joe","Springboot"),
                                    new Student(4,"Jack","Angular"),
                                    new Student(5,"Sam","Java")
                                     );

    //checking if all studentid are greater than 0 or not 
    boolean result1 = students.stream().allMatch(student->student.getStudentId()>0);
    System.out.println("all studentid are greater than 0 or not = "+result1);


     //checking if any studentid is greater than 0 or not 
      boolean result2 = students.stream().anyMatch(student->student.getStudentId()>0);
    System.out.println("\nany studentid is greater than 0 or not = "+result2);

    //none match 
      boolean result3 = students.stream().noneMatch(student->student.getStudentId()>50);
      System.out.println("\nis any studentid is greater than 50 = "+!result3);
    }
}
