import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws IOException {
        System.out.println("**************SCIENTIFIC CALCULATOR****************** ");
        while(true)
        {
            System.out.print("Enter your choice of operation :\n1)For Square Root Operation \n2) For Factorial  \n3) For Logarithm  \n4)For Power Function \nPress any other key to exit.  ");

            int ch;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            ch = Integer.parseInt(br.readLine());

            if (ch == 1)
            {
                System.out.println(" Enter the number to Calculate Square Root: ");
                double num = Double.parseDouble(br.readLine());
                double result= squareRoot(num);
                if(result>=0)
                    System.out.println(" Square root of " + num + " is: " + squareRoot(num)+ "\n");
                else
                    System.out.println(" real square root exists only for positive numbers  \n");
            }

            else if (ch == 2)
            {
                System.out.println(" Enter the number to get factorial: ");
                int num = Integer.parseInt(br.readLine());
                System.out.println(" Factorial of " +num+ " is: " + factorial(num)+ "\n");

            }


            else if (ch == 3)
            {
                System.out.println(" Enter the number to calculate natural log: ");

                double num = Double.parseDouble(br.readLine());


                if(num<0)
                    System.out.println(" Enter positive numbers only!!!! ");
                else
                    System.out.println(" Natural log value of " +num+ " is: " + Natural_log(num)+ "\n");

            }

            else if (ch == 4)
            {
                System.out.println("Enter the base and exponent to calculate the power raised to the base value: ");
                System.out.println("\nEnter the base value: ");
                double base, exp;
                base = Double.parseDouble(br.readLine());
                System.out.println("Enter the exponent value: ");
                exp = Double.parseDouble(br.readLine());
                System.out.println(base + " to the power "+exp+ " is: "+power(base, exp)+ "\n");
            }

            else {
                System.out.println("Press 1 for more calculations\nPress any other number to exit ");
                if(Integer.parseInt(br.readLine())!=1) {
                    System.out.println("Thank you for using this calculator\n");
                    break; 
                }
            }

        }// end of infinite while loop
    }

   



    public static double Natural_log(double number)
    {
        logger.info("[NATURAL LOG] - " + number);
        double result = 0;

        try {

            if (number <0 ) {
                result = Double.NaN;

                throw new ArithmeticException("Case of 0/0 Not a Number");
            }
            else {

                result = Math.log(number);
            }

        } catch (ArithmeticException error) {

            System.out.println("[EXCEPTION - LOG] - log of negative numbers is not defined " + error.getLocalizedMessage());
        }

        logger.info("[RESULT - NATURAL LOG] - " + result);

        return result;
    }

    public static double squareRoot(double num)
    {
        logger.info("[SQ ROOT] - " + num);
        if(num<0)
            return Double.NaN;

        double result = Math.sqrt(num);
        logger.info("[RESULT - SQ ROOT] - " + result);
        return result;

    }

    public static double factorial(double n1)
    {
        logger.info("[FACTORIAL] - " + n1);
        double result=1;
        if(n1<0){
            System.out.println("Factorial is not defined for negative numbers!!!");
            return Double.NaN;
        }
        for(int i=1; i<=n1; i++){
            result = result* i;

        }
        logger.info("[RESULT - FACTORIAL] - " + result);
        return result;
    }

    public static double power(double base, double exp)
    {
        logger.info("[POWER - " + base + " RAISED TO] " + exp);

        if(base==0 && exp==0)
            return Double.NaN;


        double result = Math.pow(base, exp);

        logger.info("[RESULT - POWER] - " + result);


        return result;
    }

}