package clean.single_responsibility_principle;

public class Money {

    private Bank bank;
    private double amount;

    public Money(Bank bank, int amount) {
        this.bank = bank;
        this.amount = amount;
    }

    public Bank getBank() {
        return bank;
    }

    public double getAmount() {
        return amount;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
}
