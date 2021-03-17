
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

    public class Calctest{

        private static final double DELTA = 0.00000005;

        @Test
        public void square_test(){
            assertEquals("Positive Test Case: squareRoot, ", 6, Main.squareRoot(36), DELTA);

            assertEquals("Positive Test Case: squareRoot, ", Double.NaN, Main.squareRoot(-9), DELTA);

            assertEquals("Positive Test Case: squareRoot, ", 0, Main.squareRoot(0), DELTA);


            assertNotEquals("Negative Test Case: squareRoot, ", 3, Main.squareRoot(64), DELTA);

            assertNotEquals("Negative Test Case: squareRoot, ", 7, Main.squareRoot(0), DELTA);

            assertNotEquals("Negative Test Case: squareRoot, ", 98, Main.squareRoot(-9), DELTA);
        }



        @Test
        public void fact_test()
        {

            assertEquals("Positive Test Case: Factorial, ", 40320, Main.factorial(8), DELTA);

            assertEquals("Positive Test Case: Factorial, ", Double.NaN, Main.factorial(-10), DELTA);

            assertEquals("Positive Test Case: Factorial, ", 120, Main.factorial(5), DELTA);


            assertNotEquals("Negative Test Case: Factorial,", 25, Main.factorial(8), DELTA);

            assertNotEquals("Negative Test Case: Factorial,", 26, Main.factorial(3), DELTA);

            assertNotEquals("Negative Test Case: Factorial,", 232, Main.factorial(-25), DELTA);
        }



        @Test
        public void power_test() {

            assertEquals("Positive Test Case: Power, ", 8, Main.power(2, 3), DELTA);

            assertEquals("Positive Test Case: Power,", 0.015625, Main.power(8, -2), DELTA);

            assertEquals("Positive Test Case: Power, ", Double.NaN, Main.power(0, 0), DELTA);


            assertNotEquals("Negative Test Case: Power, ", 32, Main.power(2, 3), DELTA);

            assertNotEquals("Negative Test Case: Power, ", 326, Main.power(7, 6), DELTA);

            assertNotEquals("Negative Test Case: Power, ", 6, Main.power(0, 0), DELTA);
        }

        @Test
        public void log_test() {

            assertEquals("Positive Test Case: Log, ", 2.302585092994, Main.Natural_log(10), DELTA);

            assertEquals("Positive Test Case: Log, ", Double.NEGATIVE_INFINITY, Main.Natural_log(0), DELTA);

            assertEquals("Positive Test Case: Log, ", Double.NaN, Main.Natural_log(-7), DELTA);


            assertNotEquals("Negative Test Case: Log, ", 3.567, Main.Natural_log(4), DELTA);

            assertNotEquals("Negative Test Case: Log, ", 66, Main.Natural_log(-5), DELTA);

            assertNotEquals("Negative Test Case: Log, ", 75, Main.Natural_log(45), DELTA);


        }

    }

