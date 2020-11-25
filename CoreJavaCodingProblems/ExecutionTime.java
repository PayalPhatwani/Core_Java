package CoreJavaCodingProblems;

public class ExecutionTime {

    public static void main(String[] args) throws Exception {
        // finding the time before the code is executed
        long start = System.currentTimeMillis();

       //Place your code below
        // Method 1
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // Method 2
        for (int i = 0; i < 5; i++) {
            System.out.println(i*10);
        }

        
        // finding the time after the code is executed
        long end = System.currentTimeMillis();

        // finding the time difference and converting it into seconds
        float sec = (end - start) / 1000F;
        System.out.println("the method takes " + sec + " seconds");
    }

}