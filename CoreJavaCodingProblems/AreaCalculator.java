package CoreJavaCodingProblems;
import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean go = true;
        System.out.println("Welcome to Area Calculator");
        
        while(go){
            System.out.println("Press 1 to calculate area of circle");
                System.out.println("Press 2 to calculate area of square");
                System.out.println("Press 3 to calculate area of rectangle");
                System.out.println("Press 4 to calculate area of triangle");
                System.out.println("Press 5 to exist");
               System.out.println("Press an integer:-");
           
            try{
                int key = sc.nextInt();
            switch (key) {
                case 1:
                    System.out.println("Enter radius of circle");
                    int radius = sc.nextInt();
                    System.out.println("Area of circle is : "+3.14*radius*radius+"\n");
                    break;
                case 2:
                    System.out.println("Enter side length of square");
                    int side = sc.nextInt();
                    System.out.println("Area of square is : "+side*side);
                    break;    
                case 3:
                    System.out.println("Enter  length of rectangle");
                    int length = sc.nextInt();
                    System.out.println("Enter  breadth of rectangle");
                    int breadth = sc.nextInt();
                    System.out.println("Area of reactangle is : "+length*breadth);
                    break;
                case 4:
                    System.out.println("Enter  height of triangle");
                    int height = sc.nextInt();
                    System.out.println("Enter  base of triangle");
                    int base = sc.nextInt();
                    System.out.println("Area of triangle is : "+0.5*height*base);
                    break; 
                case 5:
                go=false;
                break;       
            }
        }catch(Exception e ){
            System.out.println("Eroor!!! you have Entered invalid number");
            go=false;
    }  
    } 
    sc.close();   
    }
}