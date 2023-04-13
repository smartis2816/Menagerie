package Animals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.StringJoiner;

public abstract class Animal {
    private String name;
    private String gender;
    private LocalDate birthday;
    private ArrayList<String> commands;
    private String species;

    public Animal(String name, String gender, LocalDate birthday, ArrayList<String> commands, String species) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.commands = commands;
        this.species = species;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Animal.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("gender='" + gender + "'")
                .add("birthday=" + birthday)
                .add("commands=" + commands)
                .add("species='" + species + "'")
                .toString();
    }


}
