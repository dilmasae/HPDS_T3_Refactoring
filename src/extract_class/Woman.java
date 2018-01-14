package extract_class;

public class Woman extends Person {
    
    private Money money;
    
    public Woman(String name, int age, String sex, Money money) {
        super(name, age, sex);
        this.money = money;
    }

    public Money getMoney() {
        return money;
    }
    
}
