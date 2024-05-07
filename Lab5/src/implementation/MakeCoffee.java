package implementation;

import java.util.Scanner;


public class MakeCoffee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWants to Start Machine Y or N ?");
        char choice = scanner.next().charAt(0);
        if (choice == 'Y' || choice == 'y') {
            CoffeeMachine coffeeMachine = new CoffeeMachine();
            coffeeMachine.start();
            System.out.println("Shutting Down...\n");
        } else {
            System.out.println("Shutting Down...\n");
        }
        scanner.close();
    }
}
