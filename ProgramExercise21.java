import java.util.Scanner;

public class ProgramExercise21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hold old are you?: ");
        int old = Integer.valueOf(scanner.nextLine());

        if (old >= 18) {
            System.out.println("You are an adult ");
        } else {
            System.out.println("You are not an adult");
        }
    }
}
