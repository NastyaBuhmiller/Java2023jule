package com.company.ПР13;
import java.util.Scanner;
public class Task6 {public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String text = "<h1>Мой первый векторный рисунок</h1>\n" +
            "\n" +
            "<svg width=\"800\" height=\"600\">\n" +
            "    <circle cx=\"50\" cy=\"50\" r=\"40\" stroke=\"green\"\n" +
            "        stroke-width=\"4\" fill=\"yellow\"/>\n" +
            "</svg>";
    String open=s.nextLine();
    String close=s.nextLine();
    int Op = text.indexOf(open);
    int Op1=Op+4;
    int Cl = text.indexOf(close);
    int length=open.length()+text.indexOf(open);
    int length1=close.length();
    String result = text.substring(Op1, Cl);
    System.out.println("Фрагмент "+open+" начинается на индексе "+Op+" и заканчивается на индексе "+length);
    System.out.println("Фрагмент close после open начинается на индексе "+Cl);
    System.out.println("Вырезаю фрагмент с индекса "+Op+" до индекса "+Cl);
    System.out.println("Получился фрагмент:");
    System.out.println(result);




}
}
