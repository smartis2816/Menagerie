package Animals;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class PetAnimal extends Animal {
    public PetAnimal(String name, String gender, LocalDate birthday, ArrayList<String> commands, String species) {
        super(name, gender, birthday, commands, species);
    }
}
