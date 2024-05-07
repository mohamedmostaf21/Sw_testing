package implementation;


public class CoffeeMaker {
    private Ingredient ingredient;
    private int Coffee_Count = 0;
    public CoffeeMaker(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public void makeCoffee(Coffee coffee) {
        if (ingredient.getCoffeePowder() >= coffee.getCoffeePowderNeeded() &&
                ingredient.getMilk() >= coffee.getMilkNeeded() &&
                ingredient.getWater() >= coffee.getWaterNeeded()) {
            System.out.println("\nMaking " + coffee.getName() + "...");
            System.out.println("Taking " + coffee.getCoffeePowderNeeded() + "gm of Coffee Powder.");
            ingredient.setCoffeePowder(ingredient.getCoffeePowder() - coffee.getCoffeePowderNeeded());
            System.out.println("Taking " + coffee.getMilkNeeded() + " liter of Milk.");
            ingredient.setMilk(ingredient.getMilk() - coffee.getMilkNeeded());
            System.out.println("Taking " + coffee.getWaterNeeded() + " liter of Water.");
            ingredient.setWater(ingredient.getWater() - coffee.getWaterNeeded());
            System.out.println("Your " + coffee.getName() + " is ready.");
            this.Coffee_Count++;
            
        } else {
            System.out.println("\nSome ingredients are not available. Please fill before making coffee.");
        }
    }

    public int getCountedCoffee() {
        return this.Coffee_Count;
    }
}
