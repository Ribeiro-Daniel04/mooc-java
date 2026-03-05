import java.util.Scanner;

public class ProgramExercise08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a value: ");
        Double value = Double.valueOf(scanner.nextLine());
        System.out.println("You wrote " + value);
    }
}
