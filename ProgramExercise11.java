import java.util.Scanner;

public class ProgramExercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());

        int result = (number) * 24*60*60;
        System.out.println("You gave " + result);


    }
}
