import java.util.Scanner;

public class Program_1 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        double a = sc.nextDouble();
        System.out.println("Enter second number");
        double b = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the operator");
        String operation = sc.nextLine();
        double result = 0;

        switch (operation){
            case "+": result =  a + b;
            break;

            case "-": result = a - b;
            break;

            case "*": result = a * b;
            break;

            case "/": result = a / b;
            break;
        }

        System.out.println(result);
    }
}
