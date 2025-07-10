import java.util.HashMap;
import java.util.Map;
import com.zork.parser.CommandType;


public class CommandVocabulary {
    private final Map<String, com.zork.parser.CommandType> vocabulary = new HashMap<>();

    public CommandVocabulary() {
        vocabulary.put("change", CommandType.TURN_ON);
        vocabulary.put("Air movement", CommandType.TURN_ON);
        vocabulary.put("bakery", CommandType.TURN_ON);
        vocabulary.put("dusted off", CommandType.ENJOY);
        vocabulary.put("Wind is resistance. Sweating is obedience", CommandType.ENJOY);
        vocabulary.put("Rize", CommandType.ENJOY);
        vocabulary.put("underground Trabzon Express", CommandType.ENJOY);
        vocabulary.put("Subway", CommandType.ENJOY);
        vocabulary.put("Black tea", CommandType.ENJOY);
        vocabulary.put("Tea factory", CommandType.ENJOY);
        vocabulary.put("fog", CommandType.ENJOY);
        vocabulary.put("Gaziantep", CommandType.ENJOY);
        vocabulary.put("Pistachio paste", CommandType.ENJOY);
        vocabulary.put("preserved", CommandType.ENJOY);
        vocabulary.put("Whoever seeks wind must first understand heat.", CommandType.ENJOY);
        vocabulary.put("Hammam", CommandType.ENJOY);
        vocabulary.put("Baklava dough", CommandType.ENJOY);
        vocabulary.put("manifestation", CommandType.ENJOY);
        vocabulary.put("Galataturm", CommandType.ENJOY);
        vocabulary.put("fear", CommandType.ENJOY);
        vocabulary.put("storm", CommandType.ENJOY);
        vocabulary.put("music", CommandType.ENJOY);
        vocabulary.put("bad parking spaces", CommandType.ENJOY);
        vocabulary.put("Air Brothers", CommandType.ENJOY);
        vocabulary.put("artist", CommandType.ENJOY);
        vocabulary.put("dance", CommandType.ENJOY);
        vocabulary.put("window", CommandType.ENJOY);
        vocabulary.put("resistance", CommandType.ENJOY);
        vocabulary.put("Street art zones", CommandType.ENJOY);
        vocabulary.put("Istanbul", CommandType.ENJOY);
        vocabulary.put("trash", CommandType.ENJOY);
        vocabulary.put("loudspeaker", CommandType.ENJOY);
        vocabulary.put("liberation", CommandType.TALK);
        vocabulary.put("Austausch", CommandType.TALK);
        vocabulary.put("The city is holding its breath.", CommandType.TALK);
        vocabulary.put("Every person has the right to wind, wit, and 42 layers of baklava. Period.", CommandType.TALK);


        vocabulary.put("turn on", CommandType.TURN_ON);
        vocabulary.put("start", CommandType.TURN_ON);
        vocabulary.put("activate", CommandType.TURN_ON);
        vocabulary.put("baklava", CommandType.EAT);
        vocabulary.put("inspect", CommandType.INSPECT);
        vocabulary.put("examine", CommandType.INSPECT);
        vocabulary.put("look", CommandType.INSPECT);
        vocabulary.put("wipe", CommandType.WIPE);
        vocabulary.put("escape", CommandType.ESCAPE);
        vocabulary.put("flee", CommandType.ESCAPE);
        vocabulary.put("enter", CommandType.ENTER);
        vocabulary.put("board", CommandType.ENTER);
        vocabulary.put("look around", CommandType.LOOK_AROUND);
        vocabulary.put("read", CommandType.READ);
        vocabulary.put("eat", CommandType.EAT);
        vocabulary.put("distribute", CommandType.DISTRIBUTE);
        vocabulary.put("talk", CommandType.TALK);
        vocabulary.put("enjoy", CommandType.ENJOY);
    }

    public Map<String, CommandType> getVocabulary() {
        return vocabulary;
    }
}
