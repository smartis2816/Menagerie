package Animals;

import java.time.LocalDate;
import java.util.ArrayList;

public class Horse extends PackAnimal{
    public Horse(String name, String gender, LocalDate birthday, ArrayList<String> commands, String species) {
        super(name, gender, birthday, commands, species);
    }
}
