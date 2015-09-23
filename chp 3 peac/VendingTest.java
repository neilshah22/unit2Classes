import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * Write a description of test class VendingTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VendingTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;
    /**
     * Default constructor for objects of class VendingTest
     */
    public VendingTest()
    {
        // initialise instance variables
        x = 0;
    }
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        
    }
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
        
    }
    @Test
    public void testfillUp()
    {
        Vending vending = new Vending();
        assertEquals (10, vending.getCan(), 1e-6);
        vending.fillUp(5);
        assertEquals (15, vending.getCan(), 1e-6);
    }
    @Test
    public void testinsertToken()
    {
        Vending vending = new Vending();
        assertEquals (0, vending.getTokens(), 1e-6);
        vending.insertToken(5);
        assertEquals (5,vending.getTokens(), 1e-6);
    }
}

