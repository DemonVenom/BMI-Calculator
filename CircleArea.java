import javax.swing.*;

public class CircleArea {

    /**
     *   Finds the area of a circle using user-inputted radius
     *
     *   @author Henry Hoffman
     *   @version 1/21/2021
     */

    public static void main (String [] args) {
        double radius;
        double area;
        String input =
                JOptionPane.showInputDialog("Enter the radius");
        radius = Double.parseDouble(input);
        // put the problem solution here


        area = Math.PI * Math.pow(radius, 2.0);


        // end of solution
        JOptionPane.showMessageDialog(null,
                String.format("Area: %.2f", area));
        return;
    }
}
