package java_lecture.day5;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {

        String[] drinkName = {"콜라", "사이다", "커피", "물"};
        int[] drinkPrice = {1100, 1000, 1500, 800};

        System.out.println("===== 자판기 =====");
        System.out.println();
        System.out.println("[메뉴]");

        for (int i = 0; i < drinkName.length; i++) {
            System.out.printf("%d. %s - %d원\n", i+1, drinkName[i], drinkPrice[i]);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("투입 금액: ");
        int money = scanner.nextInt();

        System.out.print("선택한 음료: ");
        int drinkNum = scanner.nextInt();

        int change = 0;

        System.out.printf("%s를 구매했습니다.\n", drinkName[drinkNum-1]);
        System.out.printf("거스름돈: %d원\n", money-drinkPrice[drinkNum-1]);
    }
}
