package bankin;

import java.util.Scanner;

public class Account {
    private String name;
    private int age;
    private double money;

    public Account(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void insert(double cash){
        this.money += cash;
    }

    public void pay(double cash){
        this.money -= cash;
    }


}
