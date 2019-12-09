import javax.swing.*;

public class SavingsAccounts extends BankAccount implements Taxable{
	
	final private String TYPE = "Savings";
	private double taxRate;


	public SavingsAccounts(Person accHolder, int accNum, double balance, double taxRate){
		super(accHolder,accNum,balance);
		setTaxRate(taxRate);
	}

	public SavingsAccounts(){
		super(new Person(),0,0.00);
		setTaxRate(taxRate);
	}


	public String getTYPE() {
		return TYPE;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	@Override
	public double taxCalc() {
		return 0;
	}

	@Override
	public String toString() {
		return "SavingsAccounts{" +
				"TYPE='" + TYPE + '\'' +
				", taxRate=" + taxRate +
				", balance=" + balance +
				'}';
	}
}