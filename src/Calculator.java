import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number");
        double num1 = sc.nextDouble();

        System.out.println("Enter Second Number");
        double num2 = sc.nextDouble();

        double sum = num1 + num2;
        System.out.println("The sum is: " + sum);
        double sub = num1- num2;
        System.out.println("The sub is: " + sub);


    }
}
