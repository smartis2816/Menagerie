package Animals;

import java.time.LocalDate;
import java.util.ArrayList;

public class Hamster extends PetAnimal{
    public Hamster(String name, String gender, LocalDate birthday, ArrayList<String> commands, String species) {
        super(name, gender, birthday, commands, species);
    }
}