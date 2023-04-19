import Animals.Animal;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Menagerie {
    private ArrayList<Animal> menagerie;

    public Menagerie() {
        menagerie = new ArrayList<>();
    }
    public void add(Animal animal){
        menagerie.add(animal);
    }

    public Animal findAnimalByName(String name) {
        for (Animal animal : menagerie) {
            if (animal.getName().equals(name)) {
                return animal;
            } else {
                System.out.println("В зверинце нет такого животного");
            }
        }
        return null;
    }

    public void del(Animal animal){
        if (menagerie.contains(animal)){
            menagerie.remove(animal);
        } else {
            System.out.println("В зверинце нет такого животного");
        }
    }

    public void showMenagerie(){
        for (Animal animal: menagerie) {
            System.out.println(animal.toString());
        }
    }

    public void showCommands(Animal animal){
        System.out.println(animal.getName() + " выполняет команды: " + animal.getCommands());
    }

}
