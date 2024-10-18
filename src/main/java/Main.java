import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.println("Enter a command (add, subtract, multiply, divide, fibonacci, binary) followed by numbers, or type 'exit' to quit:");
            String input = scanner.nextLine();
            String[] parts = input.split(" ");

            if (parts[0].equalsIgnoreCase("exit")) {
                break;
            }

            String command = parts[0];

            try {
                switch (command.toLowerCase()) {
                    case "add":
                        int addResult = calculator.add(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                        System.out.println("Output: " + addResult);
                        break;

                    case "subtract":
                        int subtractResult = calculator.subtract(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                        System.out.println("Output: " + subtractResult);
                        break;

                    case "multiply":
                        int multiplyResult = calculator.multiply(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                        System.out.println("Output: " + multiplyResult);
                        break;

                    case "divide":
                        int divideResult = calculator.divide(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                        System.out.println("Output: " + divideResult);
                        break;

                    case "fibonacci":
                        int fibResult = calculator.fibonacciNumberFinder(Integer.parseInt(parts[1]));
                        System.out.println("Output: " + fibResult);
                        break;

                    case "binary":
                        String binaryResult = calculator.intToBinaryNumber(Integer.parseInt(parts[1]));
                        System.out.println("Output: " + binaryResult);
                        break;

                    default:
                        System.out.println("Unknown command. Please try again.");
                        break;
                }
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid input. Please follow the format: <command> <number1> <number2> (for add, subtract, multiply, divide) or <command> <number> (for fibonacci, binary).");
            }
        }

        scanner.close();
        System.out.println("Calculator program terminated.");
    }
}
