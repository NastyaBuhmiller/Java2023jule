import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Animal {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src\\Animal");
        String line = "";
        int herbivores1 = 0;
        int herbivoresOrCarnivorousAndMini = 0;
        int omnivorous = 0;
        if (file.exists()) {
            Scanner s = new Scanner(file);
            if (s.hasNext()) {
                String[] values;
                while (s.hasNext()) {
                    line = s.nextLine();
                    values = line.split(";");
                    for (int i = 0; values[3].equals("Травоядное") && i < values.length; i++) {
                        herbivores1++;
                        break;
                    }
                    for (int i = 0; (values[3].equals("Травоядное") || values[3].equals("Плотоядное")) && values[2].equals("Маленькое") && i < values.length; i++) {
                        herbivoresOrCarnivorousAndMini++;
                        break;
                    }
                    for (int i = 0; values[3].equals("Всеядное") && !values[2].equals("Высокое") && i < values.length; i++) {
                        omnivorous++;
                        break;
                    }
                    System.out.println("Травоядных животных: " + herbivores1);
                    System.out.println("Травоядных или плотоядных и маленьких omnivorous: " + herbivoresOrCarnivorousAndMini);
                    System.out.println("Всеядных и невысоких животных: " + omnivorous);
                }
            } else {
                System.out.println("Файл не существует");
            }
        }
    }
}




