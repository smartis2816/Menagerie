package Animals;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class PackAnimal extends Animal {
    public PackAnimal(String name, String gender, LocalDate birthday, ArrayList<Commands> commands, Species species) {
        super(name, gender, birthday, commands, species);
    }
}
