package com.company;

public class Employee {

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public char getSex() {
        return sex;
    }

    public int getNumberOfsection(int newNumberOfSection) {
        return numberOfsection;
    }

    public float getAge() {
        return age;
    }

    public int getWiek() {
        return wiek;
    }

    public int getKids() {
        return kids;
    }

    public boolean isCondidion() {
        return condidion;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String setSurname(String surname) {
        this.surname = surname;
        return surname;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setNumberOfsection(int numberOfsection) {
        this.numberOfsection = numberOfsection;
    }

    public int setAge(int age) {
        this.age = age;
        return age;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public void setKids(int kids) {
        this.kids = kids;
    }

    public void setCondidion(boolean condidion) {
        this.condidion = condidion;
    }

    private String name;
    private  String surname;
    private char sex;
    private int numberOfsection;
    private int age;
    private int wiek;
    private int kids;
    private boolean condidion;



}
