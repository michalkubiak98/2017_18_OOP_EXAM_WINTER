import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class BankApplication extends SavingsAccounts{


	public static JTextArea displayAccount(String[] bankaccounts, double thresAmount){


		JTextArea text = new JTextArea();



		if(bankaccounts.getBalance() > thresAmount){

			for (int i = 0; i < bankaccounts.length; i++) {


				String textAll = bankaccounts[i] + "/n";



				}

			text.append(textAll + "/n/n");

		}




		return text;
	}


	public static void main(String args[]) {

		int i = 0;
		int choice, accNum;
		double taxRate, balance;
		String name, address;

		SavingsAccounts[] savingsaccounts = new SavingsAccounts[i];

		choice = JOptionPane.showConfirmDialog(null, "Do you wish to enter more saving accounts?");



		while (choice == JOptionPane.YES_OPTION && i < savingsaccounts.length) {

			name = JOptionPane.showInputDialog("Please enter the name of the account holder");
			address = JOptionPane.showInputDialog("Please enter the address of the account holder");

			Person p = new Person(name, address);

			accNum = Integer.parseInt(JOptionPane.showInputDialog("Please enter the name of the account number"));
			balance = Double.parseDouble(JOptionPane.showInputDialog("Please enter the address of the account balance"));
			taxRate = Double.parseDouble(JOptionPane.showInputDialog("Please enter the address of the account tax rate"));

			savingsaccounts[i] = new SavingsAccounts(p,accNum,balance,taxRate);

			i++;

			choice = JOptionPane.showConfirmDialog(null, "Do you wish to enter more saving accounts?");
		}


		String allSavingAccounts="";

		for(i=0;i<savingsaccounts.length;i++)
		{
			if(savingsaccounts[i]!=null)
				allSavingAccounts += savingsaccounts[i].toString() + "\n\n";

		}

		JOptionPane.showMessageDialog(null,allSavingAccounts);



	}




}
