import java.util.Scanner;

public class ProgramExercise27 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("How old are you? ");
        int old = Integer.valueOf(reader.nextLine());

        if (old < 0 || old > 120) {
            System.out.println("Impossible ");
        } else {
            System.out.println("OK!");
        }
    }
}
