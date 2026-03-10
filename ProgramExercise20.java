import java.util.Scanner;

public class ProgramExercise20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number give than zero: ");
        int number = Integer.valueOf(scanner.nextLine());

        if (number >= 0) {
            System.out.println("Th number is Positive :)");
        } else {
            System.out.println("Your number is not positive :(");
        }
    }
}
