package com.example.hello.model;

import java.io.Serializable;

public class Grid implements Serializable {

    private String name;
    private int logo;

    private int num1;
    private String text1;
    private String input1;
    private String output1;
    private String des1;

    private int num2;
    private String text2;
    private String input2;
    private String output2;
    private String des2;

    private int num3;
    private String text3;
    private String input3;
    private String output3;
    private String des3;

    public Grid(String name, int logo, int num1, String text1, String input1, String output1, String des1, int num2, String text2, String input2, String output2, String des2, int num3, String text3, String input3, String output3, String des3) {
        this.name = name;
        this.logo = logo;
        this.num1 = num1;
        this.text1 = text1;
        this.input1 = input1;
        this.output1 = output1;
        this.des1 = des1;
        this.num2 = num2;
        this.text2 = text2;
        this.input2 = input2;
        this.output2 = output2;
        this.des2 = des2;
        this.num3 = num3;
        this.text3 = text3;
        this.input3 = input3;
        this.output3 = output3;
        this.des3 = des3;
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

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getInput1() {
        return input1;
    }

    public void setInput1(String input1) {
        this.input1 = input1;
    }

    public String getOutput1() {
        return output1;
    }

    public void setOutput1(String output1) {
        this.output1 = output1;
    }

    public String getDes1() {
        return des1;
    }

    public void setDes1(String des1) {
        this.des1 = des1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public String getInput2() {
        return input2;
    }

    public void setInput2(String input2) {
        this.input2 = input2;
    }

    public String getOutput2() {
        return output2;
    }

    public void setOutput2(String output2) {
        this.output2 = output2;
    }

    public String getDes2() {
        return des2;
    }

    public void setDes2(String des2) {
        this.des2 = des2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public String getText3() {
        return text3;
    }

    public void setText3(String text3) {
        this.text3 = text3;
    }

    public String getInput3() {
        return input3;
    }

    public void setInput3(String input3) {
        this.input3 = input3;
    }

    public String getOutput3() {
        return output3;
    }

    public void setOutput3(String output3) {
        this.output3 = output3;
    }

    public String getDes3() {
        return des3;
    }

    public void setDes3(String des3) {
        this.des3 = des3;
    }
}
