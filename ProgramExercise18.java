import java.util.Scanner;

public class ProgramExercise18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        >maior que
        >=maior ou igual a
        <menor que
        <=menor ou igual a
        ==igual a
        !=não é igual a
         */

        System.out.println("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());

        if (number == 1984) {
            System.out.println("Orwell");
        }
        if (number != 1984) {
            System.out.println("Incorrect number!");
        }

    }
}
