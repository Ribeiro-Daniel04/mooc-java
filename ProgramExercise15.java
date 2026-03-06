import java.util.Scanner;

public class ProgramExercise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Variable x = ");
        int x = Integer.valueOf(scanner.nextLine());
        System.out.println("Variable y = ");
        int y = Integer.valueOf(scanner.nextLine());
        System.out.println("Variable z = ");
        int z = Integer.valueOf(scanner.nextLine());
        double result = (double) (x + y + z) / 3;

        System.out.println("The result of the media is: " + result);








    }
}
