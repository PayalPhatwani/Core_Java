package CoreJavaCodingProblems;

            public class MethodOverloadingEX {
                
            
                public void add(int a , int b , int c){
                
                    int sum = a+b+c;
                    System.out.println("Adding two int data type numbers: ");
                    System.out.println("Result= "+sum);
                    System.out.println("________________________");
                }
          
            
                public void add(int a , double b){
                    double sum = a+b;
                    System.out.println("Adding two numbers , one integer and one double data type respectively:");
                    System.out.println("Result= "+sum);
                    System.out.println("________________________");
                }

                public void add(double a , int b){
                    double sum = a+b;
                    System.out.println("Adding two numbers , one double and one integer data type respectively:");
                    System.out.println("Result= "+sum);
                    System.out.println("________________________");
                }
                public static void main(String[] args) {
                    MethodOverloadingEX m = new MethodOverloadingEX();
                    m.add(10, 20, 30);
                    m.add(10, 10.5);
                    m.add(20.5,30);
                }
            }