package com.zork.Checks;

import org.apache.commons.text.similarity.LevenshteinDistance;
import java.util.Map;

public class CommandParser {

    private final CommandVocabulary vocabulary;
    private final LevenshteinDistance distance;

    public CommandParser(CommandVocabulary vocabulary) {
        this.vocabulary = vocabulary;
        this.distance = new LevenshteinDistance();
    }

    public ParsedCommand parse(String userInput) {
        userInput = userInput.trim().toLowerCase();

        int minDistance = Integer.MAX_VALUE;
        String bestMatch = null;
        CommandType bestType = CommandType.UNKNOWN;

        for (Map.Entry<String, CommandType> entry : vocabulary.getVocabulary().entrySet()) {
            int d = distance.apply(userInput, entry.getKey());
            if (d < minDistance && d <= 2) {
                minDistance = d;
                bestMatch = entry.getKey();
                bestType = entry.getValue();
            }
        }

        return new ParsedCommand(bestType, bestMatch, minDistance);
    }
}
