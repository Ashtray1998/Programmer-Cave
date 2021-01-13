package com.example.hello.model;

import java.io.Serializable;

public class Tutorial implements Serializable {

    private String name;
    private int logo;

    private String input;
    private String output;
    private String des;

    public Tutorial(String name, int logo, String input, String output, String des) {
        this.name = name;
        this.logo = logo;
        this.input = input;
        this.output = output;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
