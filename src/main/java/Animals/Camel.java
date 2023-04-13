package Animals;

import java.time.LocalDate;
import java.util.ArrayList;

public class Camel extends PackAnimal{
    public Camel(String name, String gender, LocalDate birthday, ArrayList<String> commands, String species) {
        super(name, gender, birthday, commands, species);
    }
}
