import java.util.Scanner;

public class cod1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line;
        line = s.nextLine();
        String[] split=new String[]{"a","b","c"};
        String[] split1=new String[]{"a","b","c"};
        if (line.isEmpty()) {
            System.out.println("Исходная строка пуста");
        } else {
            System.out.println(split);
            System.out.println(split1);
        }
    }
}
