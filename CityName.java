import javax.swing.*;

public class CityName {

    /**
     *   Finds the number of characters in a city name,
     *   the name of a city in all uppercase letters,
     *   and the first character in the name of the city
     *   from a user-inputted city name
     *
     *   @author Henry Hoffman
     *   @version 1/21/2021
     */

    public static void main (String [] args) {

        // Prompt the user to input city name and assign it to input
        String input =
                JOptionPane.showInputDialog("Enter the city name");

        // Declare variable for counter of city name letters
        int counter = 0;

        // assign the character at index 0 to firstChar
        char firstChar = input.charAt(0);

        // Assign city name with all uppercase letter to inputUppercase
        String inputUppercase = input.toUpperCase();

        // Report output to the user
        JOptionPane.showMessageDialog(null,
                String.format("1) %d\n2) %s\n3) %c",
                        input.length(), inputUppercase, firstChar));
        return;


    }
}
