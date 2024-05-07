package implementation;

public class Ingredient {
    private double coffeePowder;
    private double milk;
    private double water;

    public Ingredient() {
        this.coffeePowder = 0;
        this.milk = 0;
        this.water = 0;
    }
    public void fill() {
        System.out.println("\nFilling ingredients...");
        this.coffeePowder = 500.0;
        this.milk = 1;
        this.water = 2;
        System.out.println("Filling completed.");
    }

    public void clean() {
        System.out.println("\nCleaning ingredients...");
        this.coffeePowder = 0;
        this.milk = 0;
        this.water = 0;
        System.out.println("Cleaning completed.");
    }

    public double getCoffeePowder() {
        return coffeePowder;
    }

    public double getMilk() {
        return milk;
    }

    public double getWater() {
        return water;
    }

    public void setCoffeePowder(double coffeePowder) {
        this.coffeePowder = coffeePowder;
    }

    public void setMilk(double milk) {
        this.milk = milk;
    }

    public void setWater(double water) {
        this.water = water;
    }
}