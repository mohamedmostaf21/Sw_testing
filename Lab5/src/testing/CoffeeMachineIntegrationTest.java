package testing;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import implementation.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class CoffeeMachineIntegrationTest {
    private CoffeeMachine coffeeMachine;
    private Ingredient ingredientMock;
    private CoffeeMaker coffeeMakerMock;
    private InputStream originalSystemIn;
    private PrintStream originalSystemOut;

    @Before
    public void setUp() {
        ingredientMock = mock(Ingredient.class);
        coffeeMakerMock = mock(CoffeeMaker.class);
        coffeeMachine = new CoffeeMachine(ingredientMock, coffeeMakerMock);
        originalSystemIn = System.in;
        originalSystemOut = System.out;
    }

    @After
    public void tearDown() {
        coffeeMachine = null;
        ingredientMock = null;
        coffeeMakerMock = null;
        System.setIn(originalSystemIn);
        System.setOut(originalSystemOut);
    }
    @Test
    public void testFillIngredient() {
        // Fill the ingredient
    	 coffeeMachine.start();
    	// Redirect output stream to capture printed status
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    	
    	double powder = 0; 
    	when(ingredientMock.getCoffeePowder()).thenReturn(powder);
    	double milk = 0; 
    	when(ingredientMock.getMilk()).thenReturn(milk);
    	double water = 0; 
    	when(ingredientMock.getWater()).thenReturn(water);
    	
        // Verify ingredient is filled correctly
        assertEquals(500.0,  powder , 0.001);
        assertEquals(1.0, milk, 0.001);
        assertEquals(2.0,water , 0.001);
    }
    @Test
    public void testIngredientStatus() {
    	 coffeeMachine.start();
         coffeeMachine.displayMenu();
        // Redirect output stream to capture printed status
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
       
        // Stubbing ingredient status
        when(ingredientMock.getCoffeePowder()).thenReturn(0.0);
        when(ingredientMock.getMilk()).thenReturn(0.0);
        when(ingredientMock.getWater()).thenReturn(0.0);

        coffeeMachine.ingredientStatus();

        // Verify printed status matches expected format
        String expectedOutput = "------------- Status ------------\n" +
                                 "Available Coffee Powder (Gram): 0.0\n" +
                                 "Available Milk (Liter): 0.0\n" +
                                 "Available Water (Liter): 0.0\n" +
                                 "---------------------------------\n";
        assertEquals(expectedOutput, outputStream.toString());
    }

    
    // Add more test methods for interaction with CoffeeMaker, end-to-end scenarios, etc.
}
