import Animals.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Random;

import static Animals.Commands.*;
import static Animals.Species.*;

public class Main {
    public static void main(String[] args) {
        Menagerie menagerie = new Menagerie();
        addPackAnimals(menagerie);
        addPetAnimals(menagerie);
        menagerie.showMenagerie();
        //menagerie.showCommands("Толвохач");
    }

    public static void addPackAnimals(Menagerie menagerie) {
        menagerie.add(new Camel("Йонетта", "f", LocalDate.of(2020, Month.NOVEMBER, 8), new ArrayList<Commands>() {{
            add(GO);
            add(STOP);
            add(FASTER);
        }}, CAMEL));
        menagerie.add(new Horse("Узаис", "m", LocalDate.of(2017, Month.JUNE, 11), new ArrayList<Commands>() {{
            add(GO);
            add(FASTER);
            add(SLOWER);
        }}, HORSE));
        menagerie.add(new Donkey("Толвохач", "m", LocalDate.of(2007, Month.JANUARY, 12), new ArrayList<Commands>() {{
            add(GO);
            add(STOP);
            add(BACK);
        }}, DONKEY));
    }

    public static void addPetAnimals(Menagerie menagerie) {
        menagerie.add(new Dog("Лилла", "f", LocalDate.of(2023, Month.JANUARY, 9), new ArrayList<Commands>() {{
            add(VOICE);
            add(SIT);
            add(BE_CLOSE);
        }}, DOG));
        menagerie.add(new Cat("Гедуниан", "m", LocalDate.of(2021, Month.APRIL, 15), new ArrayList<Commands>() {{
            add(VOICE);
            add(JUMP);
            add(GET);
        }}, CAT));
        menagerie.add(new Hamster("Миаширо", "f", LocalDate.of(2019, Month.DECEMBER, 12), new ArrayList<Commands>() {{
            add(SOMERSAULT);
            add(LEFT);
            add(RIGHT);
        }}, HAMSTER));
    }

}
