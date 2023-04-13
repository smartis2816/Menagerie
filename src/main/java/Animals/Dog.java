package Animals;

import java.time.LocalDate;
import java.util.ArrayList;

public class Dog extends PetAnimal{
    public Dog(String name, String gender, LocalDate birthday, ArrayList<Commands> commands, Species species) {
        super(name, gender, birthday, commands, species);
    }
}
