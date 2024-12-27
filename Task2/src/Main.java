public class Main {
    public static void main(String[] args) {
        String example = "In Java 8, Regular Expressions or Regex (in short) in Java is an API for defining String patterns that can be used for searching, manipulating, and editing a string in Java.";
        System.out.println(textFormat(example));

    }

    public static String textFormat(String text) {
        text = text.replaceAll("[-+,.():0-9]", "");
        return text.replaceAll("\\s+","\n");

    }

}