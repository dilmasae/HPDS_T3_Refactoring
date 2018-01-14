package introduce_null_object;

import java.util.Optional;

public class Person {

    private Optional<String> name;
    
    public Person() {
        name = Optional.empty();
    }
    
    public Person(Optional<String> name) {
        this.name = name;
    }

    public String getName() {
        if(name.isPresent()) return name.get();
        return "";
    }
    
}
