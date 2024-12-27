import java.util.Scanner;

public class Main {
    private static final String REGULAR_NUM = "(\\d{3})(\\d{3})(\\d{2})(\\d{2})";
    private static final String NUM_FORMAT_LONG = "+7 ($2) $3 $4-$5";
    private static final String NUM_FORMAT_SORT = "+7 ($1) $2 $3-$4";

    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        input = input.replaceAll("\\D", "");

        if (input.length() == 11) {
            input = input.replaceAll("(\\d)" + REGULAR_NUM, NUM_FORMAT_LONG);
            System.out.println(input);
        } else if (input.length() == 10) {
            input = input.replaceAll(REGULAR_NUM,NUM_FORMAT_SORT);
            System.out.println(input);
        } else System.out.println("Не правельно введён номер");


    }
}