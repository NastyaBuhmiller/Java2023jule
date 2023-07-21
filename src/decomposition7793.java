import java.util.Scanner;
public class decomposition7793 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String red = s.nextLine();
        String green = s.nextLine();
        String[] redArr = red.split(" ");
        String[] greenArr = green.split(" ");
        onlyRed(redArr, greenArr);
        redAndGreen(redArr, greenArr);
        onlyGreen(redArr, greenArr);
        System.out.println();
    }


    public static void onlyRed(String[] redArr, String[] greenArr) {
        System.out.println("Только в красном");
        for (int ri = 0; ri < redArr.length; ri++) {
            boolean found = false;
            for (int gi = 0; gi < greenArr.length; gi++) {
                if (redArr[ri].equals(greenArr[gi])) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(redArr[ri]);
            }
        }
    }

    public static void redAndGreen(String[] redArr, String[] greenArr) {
        System.out.println("Есть в обоих");
        for (int ri = 0; ri < redArr.length; ri++) {
            for (int gi = 0; gi < greenArr.length; gi++) {
                if (redArr[ri].equals(greenArr[gi])) {
                    System.out.println(redArr[ri]);
                    break;
                }
            }
        }
    }

    public static void onlyGreen(String[] redArr, String[] greenArr) {
        System.out.println("Только в зеленом");
        for (
                int gi = 0;
                gi < greenArr.length; gi++) {
            boolean found = false;
            for (int ri = 0; ri < redArr.length; ri++) {
                if (redArr[ri].equals(greenArr[gi])) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(greenArr[gi]);
            }
        }
    }
}
