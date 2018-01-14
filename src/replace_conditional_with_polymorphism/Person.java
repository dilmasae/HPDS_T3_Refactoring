package replace_conditional_with_polymorphism;

public class Person {

    private String name;
    private String country;

    public Person(String name, String country) {
        this.name = name;
        this.country = country;
    }
    
    public String getMessage() {
        switch(country) {
            case "Spain":
                return "Nice";
            case "Ecuador":
                return "So cute";
        }
        return null;
    }
    
}
