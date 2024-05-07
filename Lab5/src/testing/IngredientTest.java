package testing;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import implementation.Ingredient;
public class IngredientTest {
    private Ingredient ingredient;

    @Before
    public void setUp() {
        ingredient = new Ingredient();
    }

    @Test
    public void testFill() {
        ingredient.fill();
        assertEquals("Coffee powder should be 500.0 after fill", 500.0, ingredient.getCoffeePowder(), 0.0);
        assertEquals("Milk should be 1.0 after fill", 1.0, ingredient.getMilk(), 0.0);
        assertEquals("Water should be 2.0 after fill", 2.0, ingredient.getWater(), 0.0);
    }

    @Test
    public void testClean() {
        ingredient.fill(); // Assuming fill method works correctly
        ingredient.clean();
        assertEquals("Coffee powder should be 0.0 after clean", 0.0, ingredient.getCoffeePowder(), 0.0);
        assertEquals("Milk should be 0.0 after clean", 0.0, ingredient.getMilk(), 0.0);
        assertEquals("Water should be 0.0 after clean", 0.0, ingredient.getWater(), 0.0);
    }

    @Test
    public void testSetCoffeePowder() {
        ingredient.setCoffeePowder(250.0);
        assertEquals("Coffee powder should be set to 250.0", 250.0, ingredient.getCoffeePowder(), 0.0);
    }

    @Test
    public void testSetMilk() {
        ingredient.setMilk(0.5);
        assertEquals("Milk should be set to 0.5", 0.5, ingredient.getMilk(), 0.0);
    }

    @Test
    public void testSetWater() {
        ingredient.setWater(1.5);
        assertEquals("Water should be set to 1.5", 1.5, ingredient.getWater(), 0.0);
    }
}
