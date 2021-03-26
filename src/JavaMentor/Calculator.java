package JavaMentor;

import JavaMentor.ActionService;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (true) {

            System.out.println("Input: ");
            String line = scanner.nextLine();


            try {
                String[] symbols = line.split(" ");
                if (symbols.length != 3) throw new Exception("Не верный ввод: ");

                Number firstNumber = NumberService.parseAndValidate(symbols[0]);
                Number secondNumber = NumberService.parseAndValidate(symbols[2], firstNumber.getType());
                String result = ActionService.calculate(firstNumber, secondNumber, symbols[1]);
                System.out.println("Output: \n" + result);

            } catch (Exception e) {
                System.out.println(e.getMessage());

                break;
            }
        }

        scanner.close();
    }

}