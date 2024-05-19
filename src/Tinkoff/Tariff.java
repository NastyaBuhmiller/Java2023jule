package Tinkoff;

import java.util.Scanner;

public class Tariff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price_tariff = scanner.nextInt();
        int size_tariff = scanner.nextInt();
        int price_MG = scanner.nextInt();
        int size_int_traffic = scanner.nextInt();

        if (price_tariff > 0 && size_tariff > 0 && price_MG > 0 && size_int_traffic > 0) {
            if (size_tariff < size_int_traffic) {
                int remainder = size_int_traffic - size_tariff;
                int price_remainder = price_MG * remainder;
                System.out.println(price_tariff + price_remainder);
            } else if (size_tariff > size_int_traffic) {
                System.out.println(size_tariff);
            }
        } else {
            System.out.println("Введенное значение меньше нуля");
        }
    }

}

