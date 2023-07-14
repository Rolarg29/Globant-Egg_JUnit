package JUnitTests;


import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class TestRectangulo {

    public TestRectangulo(){

    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass(){

    }

    @Before
    public void setUp(){

    }

    @After
    public void tearDown(){

    }

    @Test
    public void test(){
        int a = 1;
        int b = 2;
        int c = b;
        assertSame(b,2);
        assertEquals(b,c);
    }
}
