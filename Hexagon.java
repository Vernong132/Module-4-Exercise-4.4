import java.util.Scanner;

public class Hexagon {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        // Prompt user to enter side length of hexagon
        System.out.print(" Please input side length ");
        double length = input.nextDouble();

        // Calculate Area of Hexagon 
        double calcarea = (6*Math.pow(length, 2)) / (4* Math.tan(Math.PI / 6));

        // Results
        System.out.printf("The area of the hexagon is %.2f", calcarea);
        input.close();

        
    }
}
// Pseudocode
// BEGIN
    
    // DECLARE length AS double
    // DECLARE calcarea AS double
    // OUTPUT "Please input side length"
    // INPUT length
    // SET calcarea = (6 * length^2) / (4 * tan(PI / 6))
    // OUTPUT "The area of the hexagon is " + calcarea rounded to 2 decimal places
    
// END