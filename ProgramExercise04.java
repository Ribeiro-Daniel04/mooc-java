import java.util.Scanner;

public class ProgramExercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Greetings! How are you doing?");
        String first = scanner.nextLine();
        System.out.println("Oh how interesting. Tell me more!");
        String second = scanner.nextLine();
        System.out.println("Thanks for sharing! Bye bye");
        String third = scanner.nextLine();

        System.out.println("You wrote:");
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }

}
