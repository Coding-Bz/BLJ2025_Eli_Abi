package com.zork;

import org.kie.api.definition.type.PropertyReactive;

@PropertyReactive
public class Player {
    private String input;
    private boolean check;
    private int level;
    private boolean endCheck;

    public Player(String input, boolean check, int level, boolean endCheck) {
        this.input = input;
        this.check = check;
        this.level = level;
        this.check = endCheck;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public boolean getCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public boolean isCheck() {
        return check;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isEndCheck() {
        return endCheck;
    }

    public void setEndCheck(boolean endCheck) {
        this.endCheck = endCheck;
    }
}
