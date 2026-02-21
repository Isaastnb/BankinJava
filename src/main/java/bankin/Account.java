package bankin;

import bankin.DataBase;

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

    public void insert(Scanner sc){
        System.out.print("How much? ");
        double cash = sc.nextDouble();
        this.money += cash;
        System.out.printf("$ %.2f added! ", cash);


    }

    public void pay(Scanner sc){
        System.out.print("How much you'll pay? ");
        double cash = sc.nextDouble();
        this.money -= cash;
        System.out.println("Your purchase of $ "+cash+ " was confirmed!");
    }


}
