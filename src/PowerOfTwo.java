import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println("Напишите целое число, чтобы проверить является ли оно степенью двойки");
        Scanner scanner = new Scanner(System.in);
        int check = scanner.nextInt();
        int bitCount = Integer.bitCount(check);

            if (bitCount==1){
                System.out.println("Число является степенью двойки");
            } else {
                System.out.println("Число не является степенью двойки");
            }
    }
}
