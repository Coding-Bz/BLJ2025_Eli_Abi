import java.util.Scanner;
import com.zork.parser.CommandType;

public class Main {
    public static void main(String[] args) {
        CommandVocabulary vocab = new CommandVocabulary();
        CommandParser parser = new CommandParser(vocab);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine();

            ParsedCommand result = parser.parse(input);

            if (result.getType() == CommandType.UNKNOWN) {
                System.out.println("I don't understand that command.");
            } else {
                System.out.println("Recognized command: " + result.getMatchedWord() +
                        " (type: " + result.getType() + ", distance: " + result.getDistance() + ")");
            }
        }
    }
}
