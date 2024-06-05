package calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        Command command = new Command();
        Calculator calculator = new Calculator();

        do {
            String input = scanner.nextLine();
            if(input.isEmpty()) continue;

            if (command.isCommand(input)) {
                command.getCommand(input);
                continue;
            }

            calculator.calculate(input);


        }while (!command.isExit());

        System.out.println("Bye!");
    }
}
