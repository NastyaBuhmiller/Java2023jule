import java.util.Scanner;

public class Task4 {public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String value= s.nextLine();
    String data = "abcabcabbacbacbaaac";
    int A=value.length();
    if(A<2||A>2){
        System.out.println("Вводимая строка должна содержать ровно 2 символа");
    } else {
        System.out.println("Записываю значение 'abcabcabbacbacbaaac' в переменную data");
        System.out.println("Записываю значение " + value + " в переменную value");
        boolean check = data.contains(value);
        if (!check) {
            System.out.println("Указанная подстрока " + value + " не найдена");
        } else {
            int index = data.indexOf(value);
            System.out.println("Первая подстрока находится на индексе " + data.indexOf(value));
            int R = data.indexOf(value) + 1;
            System.out.println("Ищу вторую начиная с индекса " + R);
            int firstOccurrence = data.indexOf(value);
            System.out.println("Записываю индекс первой подстроки в переменную firstOccurrence");
            int secondOccurrence = data.indexOf(value, firstOccurrence + 1);
            System.out.println("Использую перегрузку метода с двумя аргументами. Вызов метода выглядит так:");
            System.out.println("int secondOccurrence = data.indexOf(value, firstOccurrence + 1);");
            System.out.println("Переменная secondOccurrence содержит " + data.indexOf(value, firstOccurrence + 1) + ", значит ");
            System.out.println("Вторая подстрока находится на индексе " + data.indexOf(value, firstOccurrence + 1));
            int N = data.indexOf(value, firstOccurrence + 1) + 1;
            System.out.println("Ищу третью начиная с индекса " + N);
            System.out.println("Вызов метода выглядит так:");
            int thirdOccurrence = data.indexOf(value, secondOccurrence + 1);
            System.out.println("int thirdOccurrence = data.indexOf(value, secondOccurrence + 1);");
            System.out.println("Третья подстрока находится на индексе " + data.indexOf(value, secondOccurrence + 1));
        }
    }

}
}
