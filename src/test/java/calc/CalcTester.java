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

    @Test
    public void testingFactorial()
    {
        double x = 3;
        double answer = 6;
        double res = testCalc.findFactorial(x);

        Assert.assertEquals(answer, res, 1);

    }

    @Test
    public void wrongInputFactorial()
    {
        double x = 3.3;
        double answer = -1;
        double res = testCalc.findFactorial(x);

        Assert.assertEquals(answer, res, 1);

    }

    @Test
    public void testingLog()
    {
        double x = 3;
        double answer = 1;
        double res = testCalc.findLog(x);

        Assert.assertEquals(answer, res, 1);
    }

    @Test
    public void testingExpo()
    {
        double x = 3;
        double b = 2;
        double answer = 9;
        double res = testCalc.findExpo(x, b);

        Assert.assertEquals(answer, res, 1);
    }

    @Test
    public void wrongInputExpo()
    {
        double x = 3;
        double b = 2.2;
        double answer = -1;
        double res = testCalc.findExpo(x, b);

        Assert.assertEquals(answer, res, 1);
    }


}

