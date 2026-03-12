import java.util.Scanner;

public class ProgramExercise26 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Input two strings");
        String first = reader.nextLine();
        String second = reader.nextLine();

        if (first.equals(second)) {
            System.out.println("Nice, same");
        } else {
            System.out.println("Bad... different");
        }
    }
}
