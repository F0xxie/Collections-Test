import java.util.*;

public class __collShell {
    public static Map map = new HashMap<String, _Command>();

    public static void main(String[] args) {

        map.put("list", new CList());
        map.put("set", new CSet());
        map.put("deque", new CDeque());
        map.put("map", new CMap());
        map.put("exit", new Exit());

        System.out.println("Select command:\n 1. List\n 2. Set\n 3. Deque\n 4. Map\n 5. Exit");
        System.out.print(">");

        Scanner in = new Scanner(System.in);
        int command = in.nextInt();

        switch (command) {
            case 1: {
                _Command c = (_Command) map.get("list");
                c.Execute();
                break;
            }
            case 2: {
                _Command c = (_Command) map.get("set");
                c.Execute();
                break;
            }
            case 3: {
                _Command c = (_Command) map.get("deque");
                c.Execute();
                break;
            }
            case 4: {
                _Command c = (_Command) map.get("map");
                c.Execute();
                break;
            }
            case 5: {
                _Command c = (_Command) map.get("exit");
                c.Execute();
                break;
            }
        }
    }
}
