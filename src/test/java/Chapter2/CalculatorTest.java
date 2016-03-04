package Chapter2;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2016/03/04.
 */
public class CalculatorTest {

    Calculator calculator = new Calculator();




    @Before
    public void setUp() throws Exception {


    }

    @Test  //Testing for Floating point
    public void FloatingPointPostiveTest() throws Exception {
        double a=1.5;
        double b=0.8;
        double answer;

         calculator.sumFloat(a,b);

        Assert.assertTrue(calculator.sumFloat(a,b)==2.3);
    }

    @Test //Test for Floating point Negative Test
    public void FloatingNegativeTest() throws Exception {

        Assert.assertTrue(calculator.sumFloat(12.0, 13.0)==25);
    }


    @Test //Postive Object Equality
    public void ObjectEqualitypositiveTest() throws Exception {
        Assert.assertSame(calculator.Name(), "");
    }

    @Test//Negative Object Equality
    public void ObjectEqualityNegativeTest() throws Exception {
        Assert.assertNotSame(calculator.Name(),""+2);
    }

    @Test//Postive Nullness
    public void NullnessPostiveTest() throws Exception {

        Assert.assertNull(calculator.NullValue(), null);
    }

    @Test //Negative Nullness
    public void NullnessNegativeTest() throws Exception {
        Assert.assertNotNull(calculator.Name(), "");
    }

    @Test//Positve Test
    public void NotNullPositiveTest() throws Exception {
        Assert.assertNotNull(calculator.Subtraction(12,8));
    }

    @Test //Negative Test
    public void NotNullNegativeTest() throws Exception
    {
        Assert.assertEquals(calculator.Sum(10,10),20);
    }

    @Test
    public void ListPosstiveTest() throws Exception {

        List rentals = new ArrayList();
                rentals.add("A");
                rentals.add("Sibusiso");

        Assert.assertEquals(rentals.contains("A"),true);

    }

    @Test
    public void ListNegativeTest() throws Exception {

        List rentals = new ArrayList();
        rentals.add(4000);
        rentals.add(541112);

        Assert.assertEquals(rentals.contains("A"),false);

    }
}
