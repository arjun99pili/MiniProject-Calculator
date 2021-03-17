package calc;

import java.util.Scanner;
import java.lang.Math;

public class Calculator
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("You have entered IMT2017007's Basic Calculator");

        while(true)
        {
            System.out.println("Enter the numerical value associated with your choice of arithmetic operation");
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Logarithm");
            System.out.println("4. Exponent");
            System.out.println("5. Exit Calculator");

            System.out.println("Please Enter Your Choice: ");

            int userOption = in.nextInt();

            if(userOption < 1 || userOption > 5)
            {
                System.out.println("Sorry! Options only range from 1 to 5!");
            }
            else if(userOption == 5)
            {
                break;
            }
            else
            {
                double userVar, result, userExpo;

                System.out.println("Enter your operand: ");
                userVar = in.nextDouble();

                if(userOption == 1)
                {
                    result = findRoot(userVar);
                }
                else if(userOption == 2)
                {
                    result = findFactorial(userVar);
                }
                else if(userOption == 3)
                {
                    result = findLog(userVar);
                }
                else
                {
                    System.out.println("Enter your exponent: ");
                    userExpo = in.nextDouble();
                    result = findExpo(userVar, userExpo);
                }

                System.out.println("Result: " + result);
                System.out.println("");

            }



        }
    }

    public static double findRoot(double v)
    {
        return(Math.sqrt(v));
    }

    public static double findFactorial(double v)
    {
        double result = 1;

        if(Math.floor(v) != v)
        {
            return -1;
        }
        for(double i = 2; i <= v; i++)
        {
            result *= i;
        }

        return result;
    }

    public static double findLog(double v)
    {
        return Math.log(v);
    }

    public static double findExpo(double v, double b)
    {
        if(Math.floor(b) != b)
        {
            return -1;
        }
        return Math.pow(v, b);
    }

}
