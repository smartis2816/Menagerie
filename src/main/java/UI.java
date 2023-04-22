import Animals.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static Animals.Commands.*;
import static Animals.Species.*;

public class UI {
    Menagerie menagerie;
    Scanner scanner;

    public UI(Menagerie menagerie) {
        this.menagerie = menagerie;
        scanner = new Scanner(System.in);
    }

    public void run() {
        if (this.scanner != null) {
            int key;
            do {
                printMenu();
                System.out.print("Введите номер команды: ");
                key = this.scanner.nextInt();
                switch (key) {
                    case 1:
                        menagerie.showMenagerie();
                        break;
                    case 2:
                        newAnimal();
                        break;
                    case 3:
                        removeAnimal();
                        break;
                    case 4:
                        watchCommands();
                        break;
                    case 5:
                        learnNewCommand();
                        break;
                    case 6:
                        System.out.println("Завершение работы программы...");
                        break;
                    default:
                        System.out.println("\nВы ввели неверный номер команды.\n");
                }
            } while (key != 6);
        }
    }

    public void printMenu() {
        System.out.println("""
                Доступные команды:
                1. Показать всех животных в зверинце
                2. Добавить животное
                3. Удалить животное
                4. Показать команды, которые выполняет животное
                5. Выучить с животным новую команду
                6. Завершить работу программы
                """);
    }

    private Animal getAnimal() {
        System.out.print("Введите имя животного: ");
        return menagerie.findAnimalByName(scanner.next());
    }

    private void watchCommands() {
        Animal animal = getAnimal();
        if (animal != null) {
            menagerie.showCommands(animal);
        }
    }

    public void learnNewCommand() {
        Animal animal = getAnimal();
        if (animal == null) return;

        System.out.println("Список доступных команд для изучения животным:");
        ArrayList<Commands> newArr = new ArrayList<>(Arrays.asList(Commands.values()));
        int count = 1;
        for (int i = 0; i < newArr.size(); i++) {
            System.out.println((i + 1) + ". " + newArr.get(i));
        }

        while (true) {
            try {
                System.out.println("Введите номер команды: ");
                int choice = Integer.parseInt(scanner.next());
                Commands newCom = newArr.get(choice - 1);
                boolean alreadyKnows = false;
                for (Commands command : animal.getCommands()) {
                    if (newCom == command) {
                        System.out.println("Животное уже знает такую команду.");
                        alreadyKnows = true;
                    }
                }
                if (!alreadyKnows) {
                    animal.teachAnimal(newCom);
                    System.out.println("Успешно!");
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Введены неверные данные. Повторите ввод.");
            }
        }
    }

    private void removeAnimal() {
        Animal animal = getAnimal();
        if (animal == null) return;
        menagerie.del(animal);
        System.out.println("Успешно!");
    }

    private void newAnimal() {
        System.out.println("Введите имя:");
        String name = scanner.next();
        System.out.println("Введите пол животного в виде 'f' или 'm':");
        String gender = scanner.next();
        System.out.println("Введите год рождения:");
        String year = scanner.next();
        System.out.println("Введите месяц рождения в числовом формате:");
        String month = scanner.next();
        System.out.println("Введите день рождения:");
        String day = scanner.next();
        LocalDate date = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));

        System.out.println("""
                Выберите вид животного:
                1. Верблюд
                2. Лошадь
                3. Осёл
                4. Собака
                5. Кошка
                6. Хомяк
                """);
        String type = scanner.next();
        switch (type) {
            case "1" -> menagerie.add(new Camel(name, gender, date, new ArrayList<Commands>() {{
                add(GO);
                add(STOP);
                add(FASTER);
            }}, CAMEL));
            case "2" -> menagerie.add(new Horse(name, gender, date, new ArrayList<Commands>() {{
                add(GO);
                add(FASTER);
                add(SLOWER);
            }}, HORSE));
            case "3" -> menagerie.add(new Donkey(name, gender, date, new ArrayList<Commands>() {{
                add(GO);
                add(STOP);
                add(BACK);
            }}, DONKEY));
            case "4" -> menagerie.add(new Dog(name, gender, date, new ArrayList<Commands>() {{
                add(VOICE);
                add(SIT);
                add(BE_CLOSE);
            }}, DOG));
            case "5" -> menagerie.add(new Cat(name, gender, date, new ArrayList<Commands>() {{
                add(VOICE);
                add(JUMP);
                add(GET);
            }}, CAT));
            case "6" -> menagerie.add(new Hamster(name, gender, date, new ArrayList<Commands>() {{
                add(SOMERSAULT);
                add(LEFT);
                add(RIGHT);
            }}, HAMSTER));
            default -> System.out.println("Такого вида нет\n");
        }
    }
}
