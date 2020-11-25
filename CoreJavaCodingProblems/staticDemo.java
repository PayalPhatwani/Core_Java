package CoreJavaCodingProblems;

public class staticDemo {
     int NonStaticVariable=3;

    public static void StaticMethod(){
        staticDemo sd = new staticDemo();
        System.out.println("NonStatic variable=  "+sd.NonStaticVariable);
        sd.NonStaticMethod();
        
    }

    public void NonStaticMethod(){
        System.out.println("NonStaticMethod");
       
    }

    public static void main(String[] args) {
        //staticDemo sd1 = new staticDemo();
      StaticMethod();
    }
}
