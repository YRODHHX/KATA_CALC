import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите выражение или end чтобы завершить");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("end")) return;
            System.out.println("Ответ: " + Calc.calc(input));
        }
    }
}





