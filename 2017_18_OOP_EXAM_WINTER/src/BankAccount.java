import javax.swing.*;
import java.util.ArrayList;

public class BankAccount extends Person{

    private Person accHolder;
    private int accNum;
    protected double balance;

    public BankAccount(Person accHolder, int accNum, double balance){
        setAccHolder(accHolder);
        setAccNum(accNum);
        setBalance(balance);
    }

    public BankAccount(){
        setAccHolder(new Person());
        setAccNum(0);
        setBalance(0.00);

    }

    public Person getAccHolder() { return accHolder; }

    public void setAccHolder(Person accHolder) { this.accHolder =
            accHolder; }

    public int getAccNum() { return accNum; }

    public void setAccNum(int accNum) { this.accNum = accNum; }


    public double getBalance() { return balance; }

    public void setBalance(double balance) { this.balance = balance; }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accHolder=" + getAccHolder() +
                ", accNum=" + getAccNum() +
                ", balance=" + getBalance() +
                '}';
    }


    /**
     *
     * @param a
     * @return text
     */


    public static JTextArea display(ArrayList a){

        JTextArea text = new JTextArea();

        for(Object s : a)
        {
            text.append("Bank Accounts: /n" + s.toString() + "/n/n");
        }

        return text;
    }
}
