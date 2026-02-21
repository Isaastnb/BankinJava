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
        int answer;
        boolean loop = true;
        while(loop) {
            System.out.println("Welcome to your bank account, " + a.getName() + "! what do you want to do now?");
            System.out.println("----------------------------------------------------------");

            System.out.printf("1.check account\n2.deposit money\n3.exit\n");
            answer = read.nextInt();
            // read.nextLine();

            switch (answer){
                case 1:
                    System.out.println("You have $ "+a.getMoney());
                    break;
                case 2:
                    a.insert(read);
                    break;

                default:
                    System.out.println("Bye!");
                    loop = false;


            }


        }
        read.close();


    }
}
