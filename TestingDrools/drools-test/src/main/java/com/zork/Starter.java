package com.zork;

import com.zork.Checks.AskLoop;

import java.util.*;

public class Starter {
    public static void main(String[] args) {
        Story story = new Story();
        Scanner input = new Scanner(System.in);
        Optionen optionen = new Optionen();
        AskLoop askLoop = new AskLoop();
        story.Kapitel1();
        Player p = new Player("", false, 1, false);


        askLoop.Looping(p);
p.setLevel(p.getLevel()+1);
        story.Kapitel2();
askLoop.Looping(p);
        p.setCheck(false);


        p.setLevel(p.getLevel()+1);
        story.Kapitel3();
        askLoop.Looping(p);
        p.setCheck(false);

        p.setLevel(p.getLevel()+1);
        story.Kapitel4();
        askLoop.Looping(p);
        p.setCheck(false);

        story.Kapitel5();
        p.setLevel(p.getLevel()+1);

        askLoop.Looping(p);
        p.setCheck(false);

        story.Kapitel6();
        System.out.println("\uD83D\uDCDC Finale – Epilog (immer gleich)\n" +
                "Der Galataturm rotiert. Die Stadt atmet.\n" +
                "Die Regierung schweigt.\n" +
                "Jace steht – vor seinem Ventilator.\n" +
                "\n" +
                "„Obwohl er an ist… steht er einfach nur da. Und genießt die Luft.“\n" +
                "\n" +
                "\uD83D\uDCC3 Verfassungsartikel 7a:\n" +
                "\n" +
                "„Jeder Mensch hat das Recht auf Wind, Witz und mindestens 42 Schichten Baklava.“");
    }
}