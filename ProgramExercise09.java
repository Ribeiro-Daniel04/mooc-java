import java.util.Scanner;

public class ProgramExercise09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a value: ");
        boolean value = Boolean.valueOf(scanner.nextLine());
        System.out.println("You wrote: " + value);

    }
}
