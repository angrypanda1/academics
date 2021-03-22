import java.util.Scanner;
public class christmasTree {
    public static void main(String[] args) { // main method
        Scanner sc = new Scanner(System.in); // establishes scanner
        System.out.println("Enter height: "); // asks for height of tree
        int rows = sc.nextInt();  // makes variable from the scanner for the height
        System.out.println("Enter sections: "); // asks for the amount of segments in the tree
        int seg = sc.nextInt(); // makes variable from the scanner for amount of segments
        int stars = 0; // establishes variable to use in for loops
        int spaces = 0; // same thing
        for (int x = 0; x < seg; x++) { // for loop to execute for the amount of segments asked
            for (int i = 1; i <= rows; i++) { // for loop to print the spaces and asterisks required for a properly aligned christmas tree
                spaces = i + x; // make an increasing amount of spaces for each loop
                for (int j = rows + seg - 1; j > spaces; j--) { // For each segment increase the starting amount of spaces by 1
                    System.out.print(" "); // Print a space
                }
                stars = i * 2 - 1 + (2 * x); // expression to determine starting number of stars for each segment
                for (int k = 1; k <= stars; k++) { // loop to print stars in each segment
                    System.out.print("*"); // print stars
                }
                System.out.println(""); // Line break
            }
        }
        int stem = 2; // number of times to print an asterisk for the stem
        for (int w = 1; w <= stem; w++) { // execute the loop twice
            for (int y = 1; y <= stars / 2; y++) { // loop to print spaces based on last segment
                System.out.print(" "); // print spaces
            }
            System.out.print("*\n"); // print an asterisk, then break
        }
        for (int t=1;t<=stars/2-3;t++) // loop to print the root(s?)
        {
            System.out.print(" "); // necessary amount of spaces to center the roots below the stem
        }
        System.out.print("*******"); // print the roots
    }
}