import java.util.Scanner;
import java.util.TreeSet;

public class CSet extends _Command {

    public void Execute() {
        csetmenu();

        TreeSet<Integer> cset = new TreeSet<>();

        while (true) {
            System.out.print(">");
            Scanner in = new Scanner(System.in);
            int command = in.nextInt();

            switch (command) {
                case 1: {
                    System.out.println(cset);
                    break;
                }
                case 2: {
                    if (cset.isEmpty()) {
                        System.out.println("Empty");
                    } else System.out.println("Not empty");
                    break;
                }
                case 3: {
                    System.out.print("Введите элемент: ");
                    int n = in.nextInt();
                    if (cset.contains(n)) {
                        System.out.println("true");
                    } else System.out.println("false");
                    break;
                }
                case 4: {
                    System.out.print("Введите элемент: ");
                    int n = in.nextInt();
                    cset.add(n);
                    System.out.println("Добавлен в list");
                    break;
                }
                case 5: {
                    System.out.print("Введите индекс элемента: ");
                    int a = in.nextInt();
                    cset.remove(a);
                    break;
                }
                case 6: {
                    System.exit(0);
                    break;
                }
            }
        }
    }

    private void csetmenu() {
        System.out.println("Выберите действие над коллекцией:\n" +
                "1. Вывести список элементов коллекции\n" +
                "2. Пуст ли список\n" +
                "3. Содержит ли коллекция элемент\n" +
                "4. Добавление элемента в конец списка\n" +
                "5. Удаление элемента\n" +
                "6. Возврат в меню выбора коллекции");
    }
}