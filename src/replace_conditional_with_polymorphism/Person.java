package replace_conditional_with_polymorphism;

public abstract class Person {

    private String name;
    private String country;

    public Person(String name, String country) {
        this.name = name;
        this.country = country;
    }
    
    public abstract String getMessage();
    
}
