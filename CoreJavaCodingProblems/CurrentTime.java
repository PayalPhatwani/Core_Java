package CoreJavaCodingProblems;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CurrentTime {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
		Date d = cal.getTime();
		
		System.out.println("Current Time in 24 hour format :-");
		SimpleDateFormat format1 = new SimpleDateFormat("HH:mm:ss");
		String date1 = format1.format(d); 
		System.out.println(date1);
		
	
		System.out.println("Current Time in 12 hour format :-");
		SimpleDateFormat format2 = new SimpleDateFormat("hh:mm:ss");
		String date2 = format2.format(d); 
		System.out.println(date2); 
    }
}