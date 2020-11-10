import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {
        System.out.println("Введите число, для проверки на четность");
        Scanner scanner = new Scanner(System.in);
        int check = scanner.nextInt();
        if ((check & 1) != 1) {
            System.out.println("Ваше число четное");
        } else System.out.println("Число нечетное");

    }
}
