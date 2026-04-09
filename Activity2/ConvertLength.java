import java.util.Scanner;

public class ConvertLength {
    static final double CENTIMETERS_PER_INCH = 2.54;
    static final int INCHES_PER_FOOT = 12;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        int feet;
        int inches;
        int totalInches;
        double centimeters;
        
        System.out.print("Enter the length in feet: ");
        feet = console.nextInt();
        
        System.out.print("Enter the length in inches: ");
        inches = console.nextInt();
        
        System.out.println("The input length is " + feet + " feet and " + inches + " inches.");
        
        totalInches = (INCHES_PER_FOOT * feet) + inches;
        
        System.out.println("Total length in inches: " + totalInches);
        
        centimeters = totalInches * CENTIMETERS_PER_INCH;
        
        System.out.println("Equivalent length in centimeters: " + centimeters);
    }
}
