package bankin;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    static void main() throws SQLException {
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

            DataBase db = new DataBase();

            db.insert(a);


            // Bank menu
            int answer;
            boolean loop = true;
            while(loop) {
                System.out.println("Welcome to your bank account, " + a.getName() + "! what do you want to do now?");
                System.out.println("----------------------------------------------------------");

                System.out.printf("1.check account\n2.deposit money\n3.pay\n4.exit\n");
                answer = read.nextInt();


                switch (answer){
                    case 1:
                        System.out.println("You have $ "+a.getMoney());
                        break;
                    case 2:
                        a.insert(read);
                        db.update(a);
                        break;

                    case 3:
                        a.pay(read);
                        db.update(a);
                        break;

                    default:
                        System.out.println("Bye!");
                        loop = false;


                }


            }
            read.close();
        }






    }
}
