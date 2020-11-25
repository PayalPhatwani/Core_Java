package CoreJavaCodingProblems;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class CurrentDate {  
   
    public static void main(String[] args) {
    
   
    DateFormat df = new SimpleDateFormat("dd/MM/yy");
    Date dateobj = new Date();
    System.out.println("Current Date is :-");
    System.out.println(df.format(dateobj));
    
    }
  }  
 
