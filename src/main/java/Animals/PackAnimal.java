package Animals;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class PackAnimal extends Animal {
    public PackAnimal(String name, String gender, LocalDate birthday, ArrayList<String> commands, String species) {
        super(name, gender, birthday, commands, species);
    }
}
