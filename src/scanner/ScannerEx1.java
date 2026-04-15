package scanner;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = (int) (Math.random() * 100);

        while (true) {
            System.out.println("숫자를 맞춰 보세요 : ");
            int input = scanner.nextInt();

            if (num > input) {
                System.out.println("UP");
            } else if (num < input) {
                System.out.println("DOWN");
            } else {
                System.out.println("정답 입니다. 랜덤 숫자는 : " + num);
                break;
            }

        }
    }
}
