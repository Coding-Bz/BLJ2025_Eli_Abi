package com.zork.Checks;

import com.zork.Player;
import com.zork.Story;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.util.Scanner;

public class AskLoop {
    Scanner input = new Scanner(System.in);
    KieServices ks = KieServices.Factory.get();
    Story story =new Story();
    KieContainer kc = ks.getKieClasspathContainer();
    CommandVocabulary vocab = new CommandVocabulary();
    CommandParser parser = new CommandParser(vocab);
    KieSession session = kc.newKieSession("ksession-rules");
    KieSession sessionK2 = kc.newKieSession("ksession-rulesK2");
    KieSession sessionK3 = kc.newKieSession("ksession-rulesK3");
    KieSession sessionK4 = kc.newKieSession("ksession-rulesK4");
    KieSession sessionK5 = kc.newKieSession("ksession-rulesK5");
    public void Looping(Player p) {

        while (!p.getCheck()) {
            switch (p.getLevel()) {
                case 1: {
                    try {
                        p = new Player("", false, p.getLevel(),false);
                        System.out.print("> ");
                        String answer = input.nextLine();
                        ParsedCommand result = parser.parse(answer);
                        String actuallWord = result.getMatchedWord();
                        p.setInput(actuallWord);
                        session.insert(p);
                        session.fireAllRules();
                        story.Hilfe(p);
                    }catch (RuntimeException e) {
                        System.out.println("We could not understand your input, Please try again.");
                    }

                        break;
                }

                case 2: {
                  try {
                      p = new Player("", false, p.getLevel(),false);
                      System.out.print("> ");
                    p.setInput(input.nextLine().trim());
                    story.Hilfe(p);
                    sessionK2.insert(p);
                    sessionK2.fireAllRules();
                  }catch (RuntimeException e) {
                      System.out.println("We could not understand your input, Please try again.");
                  }
                    break;
                }


                case 3:{
                    try {
                        p = new Player("", false, p.getLevel(),false);
                        System.out.print("> ");
                    p.setInput(input.nextLine().trim());
                    story.Hilfe(p);
                    sessionK3.insert(p);
                    sessionK3.fireAllRules();
                    }catch (RuntimeException e) {
                        System.out.println("We could not understand your input, Please try again.");
                    }
                    break;
                }

                case 4:{
                    try {
                    p = new Player("", false, p.getLevel(),false);
                        System.out.print("> ");
                    p.setInput(input.nextLine().trim());
                    story.Hilfe(p);
                    sessionK4.insert(p);
                    sessionK4.fireAllRules();
                    }catch (RuntimeException e) {
                        System.out.println("We could not understand your input, Please try again.");
                    }
                    break;

                }

                case 5:{
                  try {
                      p = new Player("", false, p.getLevel(),false);
                      System.out.print("> ");
                    p.setInput(input.nextLine().trim());
                    story.Hilfe(p);
                    sessionK5.insert(p);
                    sessionK5.fireAllRules();
                }catch (RuntimeException e) {
                    System.out.println("We could not understand your input, Please try again.");
                }
                    break;

                }


                default:{
                    System.out.println("Wrong input");
                    System.out.println("Please try again");
                }
            }

        }

    }


}
