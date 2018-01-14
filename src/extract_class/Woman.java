package extract_class;

public class Woman extends Person {
    
    private String bank;
    private int money;
    
    public Woman(String name, int age, String sex) {
        super(name, age, sex);
    }
    
    public String getNameOfTheBank() {
        return bank;
    }
    
    public void setNameOfTheBank(String bank) {
        this.bank = bank;
    }
    
    public int getMyMoney() {
        return money;
    }
    
    public void setMyMoney(int money) {
        this.money = money;
    }
    
}
