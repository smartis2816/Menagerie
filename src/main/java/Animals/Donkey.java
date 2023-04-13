package Animals;

import java.time.LocalDate;
import java.util.ArrayList;

public class Donkey extends PackAnimal{
    public Donkey(String name, String gender, LocalDate birthday, ArrayList<Commands> commands, Species species) {
        super(name, gender, birthday, commands, species);
    }
}
