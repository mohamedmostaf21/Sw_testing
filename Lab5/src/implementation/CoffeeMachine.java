package implementation;

import java.util.Scanner;

public class CoffeeMachine {
    private Ingredient ingredient;
    private CoffeeMaker coffeeMaker;
    private Scanner scanner;

    public CoffeeMachine() {
        this.ingredient = new Ingredient();
        this.coffeeMaker = new CoffeeMaker(ingredient);
        this.scanner = new Scanner(System.in);
    }
    
    public CoffeeMachine(Ingredient ingredient, CoffeeMaker coffeeMaker) {
        this.ingredient = ingredient;
        this.coffeeMaker = coffeeMaker;
        this.scanner = new Scanner(System.in);
    }
    
    public void start() {
        System.out.println(" ----------------------------------------------------------------");
        System.out.println("|                   Coffee Machine By Manikant                   |");
        System.out.println(" ----------------------------------------------------------------");
        boolean isRunning = true;
       
        while (isRunning) {
            displayMenu();
            System.out.println("\nEnter your choice: ");
            char choice = scanner.next().charAt(0);
            switch (choice) {
                case '1':
                    ingredientStatus();
                    break;
                case '2':
                    ingredient.fill();
                    break;
                case '3':
                    ingredient.clean();
                    break;
                case '4':
                    makeCoffee();
                    break;
                case '5':
                    System.out.println("\nWe Have Made "+coffeeMaker.getCountedCoffee()+" Coffees.");
                    break;
                case '6':
                    System.out.println("\nExiting...\n");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    public void displayMenu() {
        System.out.println("\n -------------------------------- ");
        System.out.println("|1:     Status of Ingredient     |\n -------------------------------- \n|2:      Fill Ingredient         |\n -------------------------------- \n|3:       Clean Machine          |\n -------------------------------- \n|4:        Make Coffee           |\n -------------------------------- \n|5: How many Coffee We have made?|\n -------------------------------- \n|6:        Exit                  |");
        System.out.println(" -------------------------------- \n\n");
    }

    public void ingredientStatus() {
        System.out.println("------------- Status ------------");
        System.out.println("Available Coffee Powder (Gram): " + String.format("%.1f", ingredient.getCoffeePowder()));
        System.out.println("Available Milk (Liter): " + String.format("%.1f", ingredient.getMilk()));
        System.out.println("Available Water (Liter): " + String.format("%.1f", ingredient.getWater()));
        System.out.println("---------------------------------");
    }

    public void makeCoffee() {
        System.out.println("\n ------------------ ");
        System.out.println("|   Select Type:   |\n ------------------ \n| 1:  Black Coffee |\n| 2:  Milk Coffee  |\n| 0   to Discard   |");
        System.out.println(" ------------------ \n");
        char type = scanner.next().charAt(0);
        switch (type) {
            case '1':
                coffeeMaker.makeCoffee(CoffeeRecipe.BLACK_COFFEE);
                break;
            case '2':
                coffeeMaker.makeCoffee(CoffeeRecipe.MILK_COFFEE);
                break;
            case '0':
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}
