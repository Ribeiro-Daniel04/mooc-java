import java.util.Scanner;

public class ProgramExercise05 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("What is the main character called?");
        String first = reader.nextLine();
        System.out.println("What is their job?");
        String second = reader.nextLine();
        System.out.println("Here is the story:");

        System.out.println("Once Upon a time there was " + first + ",");
        System.out.println("Who as a " + second + ".");
        System.out.println("On the way to work," + first + " reflected on life.");
        System.out.println("perharps, " + first + " will note be a " + second + " forever.");

    }
}
