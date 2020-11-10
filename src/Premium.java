import java.util.Scanner;

public class Premium {
    public static void main(String[] args) {
        System.out.println("Чтобы узнать размер премии, на которую можно рассчитывать напишите сколько лет вы уже в компании:");
        Scanner scanner = new Scanner(System.in);
        int premium;
        String years = scanner.next();
        int yearsWork = Integer.parseInt(years);

        if (yearsWork < 5) {
            premium = 10;
            System.out.println(premium + " %");
        } else if (yearsWork >= 5 && yearsWork < 10) {
            premium = 15;
            System.out.println(premium + " %");
        } else if (yearsWork >= 10 && yearsWork < 15) {
            premium = 25;
            System.out.println(premium + " %");
        } else if (yearsWork >= 15 && yearsWork < 20) {
            premium = 35;
            System.out.println(premium + " %");
        } else if (yearsWork >= 20 && yearsWork < 25) {
            premium = 45;
            System.out.println(premium);
        } else if (yearsWork >= 25) {
            premium = 50;
            System.out.println(premium + " %");
        }
    }
}