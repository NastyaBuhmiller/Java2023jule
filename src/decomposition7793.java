import java.util.Scanner;

public class decomposition7793 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String red = s.nextLine();
        String green = s.nextLine();
        String[] redArr = red.split(" ");
        String[] greenArr = green.split(" ");
        System.out.println("Только в красном");
        onlyOne(greenArr,redArr);
        redAndGreen(redArr, greenArr);
        System.out.println("Только в зеленом");
        onlyOne(redArr, greenArr);
        System.out.println();
    }


    public static void onlyOne(String[] redArr, String[] greenArr) {

        for (int gi = 0;gi < greenArr.length; gi++) {
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


}
