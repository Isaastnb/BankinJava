package bankin;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner read = new Scanner(System.in);
        // Register account

        Account a = new Account();
        System.out.println("Register your name please:");
        String name = read.nextLine();
        a.setName(name);
        System.out.println("Now, your age:");
        int age = read.nextInt();
        read.nextLine();

        if (age < 18) {
            System.out.println("Sorry you cannot create an account without your parents!");

        } else {
            a.setAge(age);
        }



        // Bank menu
        int resposta;
        boolean loop = true;
        while(loop) {
            System.out.println("Welcome to your bank account, " + a.getName() + "! what do you want to do now?");
            System.out.println("----------------------------------------------------------");

            System.out.printf("1.check account\n2.deposit money\n3.exit");
            resposta = read.nextInt();
            read.nextLine();


        }
        read.close();

    }
}
