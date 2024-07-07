import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Calculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Power");
            System.out.println("7. Exit");
            System.out.print("Make your choice: ");
            choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                {
                    System.out.print("Enter how many numbers you'd like to add: ");
                    int count = scanner.nextInt();
                    double sum = 0;
                    for (int i = 0; i < count; i++) {
                        System.out.print("Enter " + (i + 1) + ". number: ");
                        double number = scanner.nextDouble();
                        sum += number;
                    }
                    System.out.println("Result: " + sum);
                    break;
                }
                case 2:
                {
                    System.out.print("Enter how many numbers you'd like to subtract: ");
                    int count = scanner.nextInt();
                    System.out.print("Enter the first number: ");
                    double result = scanner.nextDouble();
                    for (int i = 1; i < count; i++) {
                        System.out.print("Enter " + (i + 1) + ". number: ");
                        double number = scanner.nextDouble();
                        result -= number;
                    }
                    System.out.println("Result: " + result);
                    break;
                }
                case 3:
                {
                    System.out.print("Enter how many numbers you'd like to multiply: ");
                    int count3 = scanner.nextInt();
                    System.out.print("Enter the 1. number: ");
                    double result2 = scanner.nextDouble();
                    //ilk sayiyi zaten aldik, o yuzden 1'den baslamali
                    for (int i = 1; i < count3; i++) {
                        System.out.print("Enter the " + (i + 1) + ". number: ");
                        double number = scanner.nextDouble();
                        result2 *= number;
                    }
                    System.out.println("Result: " + result2);
                    break;
                }
                case 4: {
                    System.out.print("Enter the first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    double num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("A number cannot be divided by zero!");
                    }
                    break;
                }
                case 5: {
                    System.out.print("Enter the number: ");
                    double num = scanner.nextDouble();
                    if (num >= 0) {
                        System.out.println("Result: " + Math.sqrt(num));
                    } else {
                        System.out.println("Square root of a negative number cannot be taken!");
                    }
                    break;
                }
                case 6: {
                    System.out.print("Enter the base number: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the exponent: ");
                    double exponent = scanner.nextDouble();
                    System.out.println("Result: " + Math.pow(base, exponent));
                    break;
                }
                case 7: {
                    System.out.println("Exiting...");
                    break;
                }
                default: {
                    System.out.println("Invalid choice! Please try again.");
                }

            }
        }while(choice!=7);
        scanner.close();
    }
}