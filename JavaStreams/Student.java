package JavaStreams;
public class Student {
    private final int StudentId;
    private final String StudentName;
    private final String StudentCourse;

   public  Student(int StudentId,String StudentName,String StudentCourse){
        this.StudentId=StudentId;
        this.StudentName=StudentName;
        this.StudentCourse=StudentCourse;
    }
    public int getStudentId(){
        return this.StudentId;
    }

    public String getStudentName(){
        return this.StudentName;
    }

    public String getStudentCourse(){
        return this.StudentCourse;
    }

    @Override
    public String toString(){
        return "Student{"+
        "studentId="+StudentId+", studentName="+StudentName
        +", studentCourse="+StudentCourse+"}";
    }
}
