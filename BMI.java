import java.util.*;

public class BMI {

    // pounds to kilograms
    final static double CONVWGT = 2.2;
    // inches to meters
    final static double CONVHGT = 0.0254;

    /**
     *   Finds a person's BMI from user-inputted weight and height
     *
     *   @author Henry Hoffman
     *   @version 1/21/2021
     */

    public static void main (String [] args) {
        double bmi;
        Scanner input = new Scanner(System.in);
        // put the problem solution here

        // prompt weight
        System.out.println("Enter weight (in pounds): ");
        // Input the weight...
        double weight = input.nextDouble();

        // prompt height
        System.out.println("Enter height (in inches): ");
        // Input the height...
        double height = input.nextDouble();


        // Compute height in meters
        double heightMeter = (Math.pow((height * CONVHGT), 2.0));

        // Compute weight in kilograms
        double weightKilogram = (weight / CONVWGT);

        // Echo-print...
        System.out.printf("You entered %.2f meters and %.2f kilograms.\n",
                heightMeter, weightKilogram);

        // Compute the BMI...
        bmi = (weightKilogram / heightMeter);


        // end of solution
        System.out.printf("BMI: %.2f\n", bmi);
        return;

    }

}
