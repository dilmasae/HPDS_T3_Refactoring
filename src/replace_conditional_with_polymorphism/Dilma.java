package replace_conditional_with_polymorphism;

public class Dilma extends Person {
    
    public Dilma(String name, String country) {
        super(name, country);
    }

    @Override
    public String getMessage() {
        return "So cute";
    }
    
}
