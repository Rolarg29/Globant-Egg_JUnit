package JUnitTests;

import Entities.DiscountCalculator;
import Services.DiscountCalculatorService;
import org.junit.*;

public class DiscountCalculatorTest {

    static DiscountCalculatorService dcService;

    @BeforeClass
    public static void setUpClass(){
         dcService = new DiscountCalculatorService();
    }

    @AfterClass
    public static void tearDownClass(){

    }

    @Test
    public void calculateDiscount10(){
        Assert.assertEquals(90, dcService.calculateDiscount(new DiscountCalculator(10,100)), 0);
        Assert.assertEquals(100, dcService.calculateDiscount(new DiscountCalculator(0,100)), 0);
        Assert.assertEquals(0, dcService.calculateDiscount(new DiscountCalculator(100,100)), 0);
    }
}
