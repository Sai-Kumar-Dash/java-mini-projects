package AtmProject;

import java.util.Scanner;

public class Atm {
    float balance;
    int AccPin = 4424;
    public void checkPin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Atm Pin: ");
        int enteredPin = sc.nextInt();
        if(enteredPin == AccPin){
            menu();
        }
        else{
            for(int i=0; i<3;i++){

                System.out.println("Invalid Pin Entered !");
            }
            System.out.println("Wrong pin limit Exceeded !");
        }
    }
    public void menu(){
        System.out.println("1.Check Bank Balance\n2.Withdraw Money\n3.Deposite money\n4.Exit");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input == 1){
            checkBalance();
        }
        else if (input == 2){
            withdrawMoney();
        }
        else if (input == 3){
            depositeMoney();
        }
        else if (input == 4){
            System.out.println("Thank you for using Atm");
        }
        else{
            System.out.println("Enter a valid choice !");
            menu();
        }

    }

    public void checkBalance(){
        System.out.println("Total Balance:"+balance);
        menu();
    }
    public void withdrawMoney(){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(input<balance){
            balance = balance - input;
            System.out.println("Updated Total Balance");
        }
        else{
            System.out.println("Low Balance !");
        }
        menu();

    }
    public void depositeMoney(){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        balance = balance + input;
        System.out.println("Money Deposited Successfully");
        System.out.println("Updated Total Balance: "+balance);
        menu();
    }
}