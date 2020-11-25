package CoreJavaCodingProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CurrencyConverter {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to Currency Converter");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean go = true;
        while (go) {
            System.out.println("Press 1 for converting Rupee into Dollar");
            System.out.println("Press 2 for converting Dollar into Rupee");
            System.out.println("Press 3 to exist \n Press an integer!!");
            try {
                int key = Integer.parseInt(br.readLine());
                switch (key) {
                    case 1:
                        System.out.println("Enter amount in ruppee");
                        double rupee = Double.parseDouble(br.readLine());
                        System.out.println(rupee + " Rupee is equal to =  " + (rupee * 0.013) + " Dollar\n");
                        break;
                    case 2:
                        System.out.println("Enter amount in Dollar");
                        double dollar = Double.parseDouble(br.readLine());
                        System.out.println(dollar + " Dollar is equal to =  " + (dollar * 74.83) + " Rupee\n");
                        break;
                    case 3:
                        go = false;
                        break;
                }
            } catch (Exception e) {
                System.out.println("Eroor!!! you have Entered invalid number");
                go = false;
            }
        }
        br.close();
    }
}