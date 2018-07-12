import java.util.ArrayList;
import java.util.Scanner;

public class CList extends _Command {

    public void Execute() {
        clistmenu();

        ArrayList<Integer> clist = new ArrayList<>();

        while (true) {
            System.out.print(">");
            Scanner in = new Scanner(System.in);
            int command = in.nextInt();

            switch (command) {
                case 1: {
                    System.out.println(clist);
                    break;
                }
                case 2: {
                    if (clist.isEmpty()) {
                        System.out.println("Empty");
                    } else System.out.println("Not empty");
                    break;
                }
                case 3: {
                    System.out.print("Введите элемент: ");
                    int n = in.nextInt();
                    if (clist.contains(n)) {
                        System.out.println("true");
                    } else System.out.println("false");
                    break;
                }
                case 4: {
                    System.out.print("Введите элемент: ");
                    int n = in.nextInt();
                    clist.add(n);
                    System.out.println("Добавлен в list");
                    break;
                }
                case 5: {
                    System.out.print("Введите элемент: ");
                    int a = in.nextInt();
                    System.out.print("Введите позицию: ");
                    int b = in.nextInt();
                    if (b > clist.size()) {
                        b = clist.size();
                    }
                    clist.add(b, a);
                    break;
                }
                case 6: {
                    System.out.print("Введите позицию: ");
                    int a = in.nextInt();
                    System.out.println(clist.get(a));
                    break;
                }
                case 7: {
                    System.out.print("Введите элемент: ");
                    int a = in.nextInt();
                    clist.remove(a);
                    break;
                }
                case 8: {
                    System.out.print("Введите индекс элемента: ");
                    int a = in.nextInt();
                    clist.remove(a);
                    break;
                }
                case 9: {
                    System.exit(0);
                    break;
                }
            }
        }
    }

    private void clistmenu() {
        System.out.println("Выберите действие над коллекцией:\n" +
                "1. Вывести список элементов коллекции\n" +
                "2. Пуст ли список\n" +
                "3. Содержит ли коллекция элемент\n" +
                "4. Добавление элемента в конец списка\n" +
                "5. Добавление элемента на определенную позицию\n" +
                "6. Получение элемента с определенной позиции\n" +
                "7. Удаление элемента\n" +
                "8. Удаление элемента, находящегося на определенной позиции\n" +
                "9. Возврат в меню выбора коллекции");
    }
}