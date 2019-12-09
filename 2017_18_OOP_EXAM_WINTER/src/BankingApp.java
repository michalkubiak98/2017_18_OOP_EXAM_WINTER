import javax.swing.*;
import java.util.ArrayList;

public class BankingApp extends BankAccount{

    public static void main(String[] args) {


        ArrayList<BankAccount> bankAccounts = new ArrayList<>();


        int choice = Integer.parseInt(JOptionPane.showInputDialog("To quit press 1, To create a savings account press 2," +
                " To create a current account press 3."));


        while (!(choice == 1)) {

            if (choice == 2) {

                String name = JOptionPane.showInputDialog("Please enter the name of the account holder");
                String address = JOptionPane.showInputDialog("Please enter the address of the account holder");

                Person p = new Person(name, address);

                int accNum = Integer.parseInt(JOptionPane.showInputDialog("Please enter the name of the account number"));
                double balance = Double.parseDouble(JOptionPane.showInputDialog("Please enter the address of the account balance"));
                double taxRate = Double.parseDouble(JOptionPane.showInputDialog("Please enter the address of the account tax rate"));

                SavingsAccounts s = new SavingsAccounts(p, accNum, balance, taxRate);

                bankAccounts.add(s);

                choice = Integer.parseInt(JOptionPane.showInputDialog("To quit press 1, To create a savings account press 2," +
                        " To create a current account press 3."));


            }
            else if (choice == 3){

                String name = JOptionPane.showInputDialog("Please enter the name of the account holder");
                String address = JOptionPane.showInputDialog("Please enter the address of the account holder");

                Person p = new Person(name, address);

                int accNum = Integer.parseInt(JOptionPane.showInputDialog("Please enter the name of the account number"));
                double balance = Double.parseDouble(JOptionPane.showInputDialog("Please enter the address of the account balance"));
                boolean checkBook = Boolean.parseBoolean(JOptionPane.showInputDialog("Is the account check booked? Enter True or False"));

                CurrentAccount c = new CurrentAccount(p, accNum, balance, checkBook);

                bankAccounts.add(c);

                choice = Integer.parseInt(JOptionPane.showInputDialog("To quit press 1, To create a savings account press 2," +
                        " To create a current account press 3."));


            }


        }


        display(bankAccounts);


    }





}
