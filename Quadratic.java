import java.util.Scanner;

public class Quadratic{

    // Static method to compute and print roots
    static void computeRoots(int a, int b, int c) {

        if (a == 0) {
            System.out.println("Not a quadratic equation (a cannot be 0).");
            return;
        }

        int discriminant = (b * b) - (4 * a * c);

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2.0 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2.0 * a);
            System.out.println("Roots are real and distinct:");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } 
        else if (discriminant == 0) {
            double root = -b / (2.0 * a);
            System.out.println("Roots are real and equal:");
            System.out.println("Root = " + root);
        } 
        else {
            double realPart = -b / (2.0 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2.0 * a);
            System.out.println("Roots are complex:");
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter values of a, b, c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        computeRoots(a, b, c);
    }
}
