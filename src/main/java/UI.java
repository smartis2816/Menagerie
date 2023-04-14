import java.util.Scanner;

public class UI {
    Menagerie menagerie;
    Scanner scanner;

    public UI(Menagerie menagerie) {
        this.menagerie = menagerie;
        scanner = new Scanner(System.in);
    }

    public void menu(){
        System.out.println("""
                Доступные команды:
                1. Показать всех животных в зверинце
                2. Добавить животное
                3. Удалить животное
                4. Показать команды, которые выполняет животное
                5. Выучить с животным новую команду
                6. Завершить работу программы
                """);
        switch (scanner.next()) {
            case "1" -> menagerie.showMenagerie();
            case "2" -> newAnimal();
            case "3" -> removeAnimal();
            case "4" -> watchCommands();
            case "5" -> learnNewCommand();
            case "6" -> System.exit(0);
        }
    }


    private void watchCommands() {

    }

    private void learnNewCommand() {
    }

    private void removeAnimal() {
    }

    private void newAnimal() {
    }

}
