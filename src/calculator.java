import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int operand1, operand2, result;
        char operation, stop_it;

        System.out.print("Press y to start");
        stop_it = scanner.next().charAt(0);

        System.out.print("operand1 = ");
                result = scanner.nextInt();
                operand1=result;

        while (stop_it != 's') {
            System.out.print("operand1 = " + result);
            System.out.print("  operand2 = ");
            operand2 = scanner.nextInt();
            System.out.print("operation = ");
            operation = scanner.next().charAt(0);

            switch (operation) {
                case '+':
                    System.out.print(result = result + operand2);
                    System.out.print("  Press y to continue, press s to stop");
                    stop_it = scanner.next().charAt(0);
                    break;
                case '-':
                    System.out.print(result = result - operand2);
                    System.out.print("  Press y to continue, press s to stop");
                    stop_it = scanner.next().charAt(0);
                    break;
                case '*':
                    System.out.print(result = result * operand2);
                    System.out.print("  Press y to continue, press s to stop");
                    stop_it = scanner.next().charAt(0);
                    break;
                case '/':
                    System.out.print(result = result / operand2);
                    System.out.print("  Press y to continue, press s to stop");
                    stop_it = scanner.next().charAt(0);
                    break;
                default:
                    System.out.println("Allowed only operations +, -, *, /");

                    }
            }

        }
    }

        