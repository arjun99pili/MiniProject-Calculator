package calc;

import org.junit.*;

public class CalcTester
{
    private Calculator testCalc;

    @Before
    public void setUp()
    {
        testCalc = new Calculator();
    }

    @Test
    public void testingSqrt()
    {
        double x = 9;
        double answer = 3;
        double res = testCalc.findRoot(x);

        Assert.assertEquals(answer, res, 1);
    }
}

