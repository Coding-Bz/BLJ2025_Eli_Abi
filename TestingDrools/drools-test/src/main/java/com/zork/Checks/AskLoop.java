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
    KieSession session = kc.newKieSession("ksession-rules");
    KieSession sessionK2 = kc.newKieSession("ksession-rulesK2");
    KieSession sessionK3 = kc.newKieSession("ksession-rulesK3");
    KieSession sessionK4 = kc.newKieSession("ksession-rulesK4");
    KieSession sessionK5 = kc.newKieSession("ksession-rulesK5");
    public void Looping(Player p) {

        while (!p.getCheck()) {
            switch (p.getLevel()) {
                case 1: {
                    p = new Player("", false, p.getLevel(),false);
                    System.out.print("> ");
                    p.setInput(input.next());
                    story.Hilfe(p);
                    session.insert(p);
                    session.fireAllRules();
                        break;
                }

                case 2: {
                    p = new Player("", false, p.getLevel(),false);
                    p.setInput(input.nextLine().trim());
                    System.out.println(p.getInput());
                    story.Hilfe(p);
                    sessionK2.insert(p);
                    sessionK2.fireAllRules();
                    break;
                }


                case 3:{
                    p = new Player("", false, p.getLevel(),false);
                    p.setInput(input.nextLine().trim());
                    System.out.println(p.getInput());
                    story.Hilfe(p);
                    sessionK3.insert(p);
                    sessionK3.fireAllRules();
                    break;
                }

                case 4:{
                    p = new Player("", false, p.getLevel(),false);
                    p.setInput(input.nextLine().trim());
                    System.out.println(p.getInput());
                    story.Hilfe(p);
                    sessionK4.insert(p);
                    sessionK4.fireAllRules();
                    break;

                }

                case 5:{
                    p = new Player("", false, p.getLevel(),false);
                    p.setInput(input.nextLine().trim());
                    System.out.println(p.getInput());
                    story.Hilfe(p);
                    sessionK5.insert(p);
                    sessionK5.fireAllRules();
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
