import java.util.Scanner;

public class Starter {
    public static void main(String args[]) {
        // Variables and scanner
        Scanner kb = new Scanner(System.in);

        int count;
        // Ask the user, "How high do you want to count?" and get their input
        System.out.println("How high do you want to count?");
        count = kb.nextInt();

        while(Validator.validater(count) == false){
            System.out.println("That number is not valid. \nHow high do you want to count?");
            count = kb.nextInt();
        }

        Validator.output(count);

    }

}

    // Validate the input using a method
    // If the input is not valid, ask the user,
    // "That number is not valid. \nHow high do you want to count?
    // Use a method to output the solution
    // Create a method that validates the input and returns true if valid
    // Create a method that outputs the following for each number from 1
    // to whatever the user entered.
    // If the number is evenly divisible by 5, output, "BAISD "
    // If the number is evenly divisible by 3, output, "is awesome!"
    // If the number is evenly divisible by 3 and 5, output, "BAISD is awesome!"

// Ways to stand out:

// Use a second class and static methods for validation and output or

// Use an array to hold the numbers before printing them or

// Use an array in an object to hold the numbers and use instance methods to
// handle validation and output.
