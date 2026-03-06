import java.util.Scanner;

public class ProgramExercise16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number: ");
        int x = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number: ");
        int y = Integer.valueOf(scanner.nextLine());

        System.out.println("Sum: " + x + " + " + y + " = " + (x+y));
        System.out.println("Difference: " + x + " - " + y + " = " + (x-y));
        System.out.println("product: " + x + " * " + y + " = " + (x*y));

        double result = (double) x/y;

        System.out.println("quotient: " + x + " / " + y + " = " + (result));



    }
}
