import java.util.Scanner;

public class Main {
    private static final String VALID_REGEX = "([-А-я]+\\s){2}([-А-я])+";

    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine().trim();


        if (input.matches(VALID_REGEX)) {
            String[] split = input.split("\\s");

            System.out.println("Фамилия: " + split[0]);
            System.out.println("Имя: " + split[1]);
            System.out.println("Отчество: " + split[2]);

        } else System.out.println("не верно");


    }
}