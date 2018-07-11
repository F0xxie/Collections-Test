import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CMap extends _Command {
    public void Execute() {
        cmapmenu();

        Map<Integer, Integer> cmap = new HashMap<Integer, Integer>();

        while (true) {
            System.out.print(">");
            Scanner in = new Scanner(System.in);
            int command = in.nextInt();

            switch (command) {
                case 1: {
                    System.out.println(cmap);
                    break;
                }
                case 2: {
                    if (cmap.isEmpty()) {
                        System.out.println("Empty");
                    } else System.out.println("Not empty");
                    break;
                }
                case 3: {
                    System.out.print("Введите ключ элемента: ");
                    int n = in.nextInt();
                    System.out.println(cmap.get(n));
                }
                case 4: {
                    System.out.print("Введите элемент: ");
                    int a = in.nextInt();
                    System.out.print("Введите ключ элемента: ");
                    int b = in.nextInt();
                    cmap.put(b, a);
                    break;
                }
                case 5: {
                    System.out.print("Введите ключ элемента: ");
                    int b = in.nextInt();
                    cmap.remove(b);
                    break;
                }
                case 6: {
                    System.exit(0);
                    break;
                }
            }
        }
    }

    private void cmapmenu() {
        System.out.println("Выберите действие над коллекцией\n" +
                "1. Вывести список элементов коллекции\n" +
                "2. Пуст ли список\n" +
                "3. Получение элемента коллекции, либо null в случае отсутствия\n" +
                "4. Добавление элемента в коллекцию\n" +
                "5. Удаление элемента из коллекции\n" +
                "6. Возврат в меню выбора коллекции");
    }
}