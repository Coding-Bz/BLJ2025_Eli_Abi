package com.zork.Checks;

import java.util.HashMap;
import java.util.Map;


public class CommandVocabulary {
    private final Map<String, CommandType> vocabulary = new HashMap<>();

    public CommandVocabulary() {

        vocabulary.put("Rize", CommandType.ENJOY);
        vocabulary.put("underground Trabzon Express", CommandType.ENJOY);
        vocabulary.put("Subway", CommandType.ENJOY);
        vocabulary.put("Black tea", CommandType.ENJOY);
        vocabulary.put("Tea factory", CommandType.ENJOY);
        vocabulary.put("fog", CommandType.ENJOY);
        vocabulary.put("Gaziantep", CommandType.ENJOY);
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
        vocabulary.put("enjoy", CommandType.ENJOY);


        vocabulary.put("Wind is resistance. Sweating is obedience", CommandType.ENJOY);
        vocabulary.put("Rize", CommandType.ENJOY);
        vocabulary.put("underground Trabzon Express", CommandType.ENJOY);
        vocabulary.put("fog", CommandType.ENJOY);
        vocabulary.put("Gaziantep", CommandType.ENJOY);
        vocabulary.put("Whoever seeks wind must first understand heat.", CommandType.ENJOY);
        vocabulary.put("Hammam", CommandType.ENJOY);
        vocabulary.put("Baklava dough", CommandType.ENJOY);
        vocabulary.put("manifestation", CommandType.ENJOY);
        vocabulary.put("Galataturm", CommandType.ENJOY);
        vocabulary.put("resistance", CommandType.ENJOY);
        vocabulary.put("Street art zones", CommandType.ENJOY);
        vocabulary.put("Istanbul", CommandType.ENJOY);
        vocabulary.put("trash", CommandType.ENJOY);
        vocabulary.put("loudspeaker", CommandType.ENJOY);
        vocabulary.put("liberation", CommandType.TALK);
        vocabulary.put("Austausch", CommandType.TALK);
        vocabulary.put("The city is holding its breath.", CommandType.TALK);

        vocabulary.put("Ventilator", CommandType.ENTER);
        vocabulary.put("Verstecken", CommandType.ENTER);
        vocabulary.put("Durchsuchen", CommandType.ENTER);
        vocabulary.put("Anschalten", CommandType.ENTER);
        vocabulary.put("nur putzen", CommandType.ENTER);
        vocabulary.put("nur schwitzen", CommandType.ENTER);
        vocabulary.put("schwitzen", CommandType.ENTER);
        vocabulary.put("fliehe", CommandType.ENTER);
        vocabulary.put("brühen", CommandType.ENTER);
        vocabulary.put("Salz hinzufügen", CommandType.ENTER);
        vocabulary.put("Gaziantep", CommandType.ENTER);
        vocabulary.put("Tee machen", CommandType.ENTER);
        vocabulary.put("Tee", CommandType.ENTER);
        vocabulary.put("Höre den Kodex", CommandType.ENTER);
        vocabulary.put("Kodex", CommandType.ENTER);
        vocabulary.put("Reise nach Istanbul", CommandType.ENTER);
        vocabulary.put("Istanbul", CommandType.ENTER);
        vocabulary.put("Aktiviere den Generator", CommandType.ENTER);
        vocabulary.put("Aktiviere", CommandType.ENTER);
        vocabulary.put("Eine Rede halten", CommandType.ENTER);
        vocabulary.put("Eine Rede", CommandType.ENTER);
        vocabulary.put("Tanzen", CommandType.ENTER);


        vocabulary.put("activate", CommandType.TURN_ON);
        vocabulary.put("baklava", CommandType.EAT);
        vocabulary.put("Hilfe", CommandType.TALK);


    }

    public Map<String, CommandType> getVocabulary() {
        return vocabulary;
    }
}
