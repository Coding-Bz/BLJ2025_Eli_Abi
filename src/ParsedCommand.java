import com.zork.parser.CommandType;

public class ParsedCommand {
    private final CommandType type;
    private final String matchedWord;
    private final int distance;

    public ParsedCommand(CommandType type, String matchedWord, int distance) {
        this.type = type;
        this.matchedWord = matchedWord;
        this.distance = distance;
    }

    public CommandType getType() {
        return type;
    }

    public String getMatchedWord() {
        return matchedWord;
    }

    public int getDistance() {
        return distance;
    }
}
