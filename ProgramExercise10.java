import java.util.Scanner;

public class ProgramExercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a String: ");
        String text = scanner.nextLine();
        System.out.println("Give an integer: " );
        int integer = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double: ");
        double floatingPoint = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean: ");
        boolean trueOrFalse = Boolean.valueOf(scanner.nextLine());

        System.out.println("You gave the: " + text);
        System.out.println("You gave the: " + integer);
        System.out.println("You gave the: " + floatingPoint);
        System.out.println("You gave the: " + trueOrFalse);





    }
}
