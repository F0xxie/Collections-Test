import java.util.LinkedList;
import java.util.Scanner;

public class CDeque extends _Command {

    public void Execute() {
        cdequemenu();

        LinkedList<Integer> cdeque = new LinkedList<Integer>();

        while (true) {
            System.out.print(">");
            Scanner in = new Scanner(System.in);
            int command = in.nextInt();

            switch (command) {
                case 1: {
                    System.out.println(cdeque);
                    break;
                }
                case 2: {
                    if (cdeque.isEmpty()) {
                        System.out.println("Empty");
                    } else System.out.println("Not empty");
                    break;
                }
                case 3: {
                    System.out.print("Введите элемент: ");
                    int n = in.nextInt();
                    if (cdeque.contains(n)) {
                        System.out.println("true");
                    } else System.out.println("false");
                    break;
                }
                case 4: {
                    System.out.print("Введите элемент: ");
                    int n = in.nextInt();
                    cdeque.addFirst(n);
                    System.out.println("Добавлен в list");
                    break;
                }
                case 5: {
                    System.out.print("Введите элемент: ");
                    int n = in.nextInt();
                    cdeque.addLast(n);
                    System.out.println("Добавлен в list");
                    break;
                }
                case 6: {
                    System.out.println(cdeque.getFirst());
                    break;
                }
                case 7: {
                    System.out.println(cdeque.getLast());
                    break;
                }
                case 8: {
                    System.out.print(cdeque.pollFirst());
                    break;
                }
                case 9: {
                    System.out.print(cdeque.pollLast());
                    break;
                }
                case 10: {
                    cdeque.removeFirst();
                    break;
                }
                case 11: {
                    cdeque.removeLast();
                    break;
                }
                case 12: {
                    System.exit(0);
                    break;
                }
            }
        }
    }

    private void cdequemenu() {
        System.out.println("Выберите действие над коллекцией:\n" +
                "1. Вывести список элементов коллекции\n" +
                "2. Пуст ли список\n" +
                "3. Содержит ли коллекция элемент\n" +
                "4. Добавить элемент в начало коллекции \n" +
                "5. Добавить элемент в конец коллекции\n" +
                "6. Получить первый элемент коллекции, при этом не удаляя его из самой коллекции\n" +
                "7. Получить последний элемент коллекции, при этом не удаляя его из самой коллекции\n" +
                "8. Получить первый элемент коллекции, удалив его при этом из самой коллекции\n" +
                "9. Получить последний элемент коллекции, удалив его при этом из самой коллекции\n" +
                "10. Удалить элемент из начала коллекции\n" +
                "11. Удалить элемент из конца коллекции\n" +
                "12. Возврат в меню выбора коллекции");
    }
}