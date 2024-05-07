package testing;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import implementation.*;
public class CoffeeMakerTest {
    private Ingredient ingredient;
    private CoffeeMaker coffeeMaker;
    private Coffee coffee;

    @Before
    public void setUp() {
        ingredient = new Ingredient();
        ingredient.fill(); // Assuming fill method works correctly and ingredients are filled
        coffeeMaker = new CoffeeMaker(ingredient);
        coffee = new Coffee("Espresso", 100, 0.1, 0.2); // Assuming Coffee class and constructor with parameters (String name, double coffeePowderNeeded, double milkNeeded, double waterNeeded)
    }

    @Test
    public void testMakeCoffeeSuccess() {
        coffeeMaker.makeCoffee(coffee);
        assertEquals("Coffee count should increase after making coffee", 1, coffeeMaker.getCountedCoffee());
        assertEquals("Coffee powder should decrease by 100gm after making coffee", 400.0, ingredient.getCoffeePowder(), 0.0);
        assertEquals("Milk should decrease by 0.1 liter after making coffee", 0.9, ingredient.getMilk(), 0.0);
        assertEquals("Water should decrease by 0.2 liter after making coffee", 1.8, ingredient.getWater(), 0.0);
    }

    @Test
    public void testMakeCoffeeFailure() {
        // Set the ingredients to be insufficient for making the coffee
        ingredient.setCoffeePowder(coffee.getCoffeePowderNeeded() - 10);
        ingredient.setMilk(coffee.getMilkNeeded() - 0.01);
        ingredient.setWater(coffee.getWaterNeeded() - 0.01);

        coffeeMaker.makeCoffee(coffee);
        assertEquals("Coffee count should not increase if ingredients are insufficient", 0, coffeeMaker.getCountedCoffee());
    }
}
