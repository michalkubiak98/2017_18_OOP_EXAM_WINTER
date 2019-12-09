import javax.swing.*;

public class CurrentAccount extends BankAccount{

    final private String TYPE = "Current";
    private boolean checkBook;


    public CurrentAccount(Person accHolder, int accNum, double balance, boolean checkBook){
        super(accHolder,accNum,balance);
        setCheckBook(checkBook);

    }

    public CurrentAccount(){
        super(new Person(),0,0.00);
        setCheckBook(false);

    }

    public String getTYPE() {
        return TYPE;
    }

    public boolean isCheckBook() {
        return checkBook;
    }

    public void setCheckBook(boolean checkBook) {
        this.checkBook = checkBook;
    }
}