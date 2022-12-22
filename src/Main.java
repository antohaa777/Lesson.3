import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write any two numbers and operation you want to do!");
        while (true) {
            String num1 = scanner.next();
            String num2 = scanner.next();
            String type = scanner.next();
            int numm1 = Integer.parseInt(num1);
            int numm2 = Integer.parseInt(num2);
            int result;
            switch (type) {
                case "sum":
                    result = numm1 + numm2;
                    break;
                case "sub":
                    result = numm1 - numm2;
                    break;
                case "div":
                    result = numm1 / numm2;
                    break;
                case "mul":
                    result = numm1 * numm2;
                    break;
                default:
                    System.out.println("Error!");
                    return;

            }
            System.out.println("Our result is : " + result);
            System.out.println("Do you want to continue Y/N?");
            String next = scanner.next();

            switch(next){
                case "n":
                    return;
                case "y":
                    break;

            }

        }
            };
        }