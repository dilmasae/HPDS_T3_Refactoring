package extract_interface;

public class Person implements Actions {

    private String name;

    public Person(String name) {
        this.name = name;
    }
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void write() {
        System.out.println("Hello World!");
    }
    
}
