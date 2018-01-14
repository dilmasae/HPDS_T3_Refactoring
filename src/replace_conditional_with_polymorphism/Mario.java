package replace_conditional_with_polymorphism;

public class Mario extends Person {
    
    public Mario(String name, String country) {
        super(name, country);
    }

    @Override
    public String getMessage() {
        return "Nice";
    }
    
}
