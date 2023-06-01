package kioskProjact;

import java.util.Scanner;

public class Cancel {

    public static Scanner scanner = new Scanner(System.in);

    static void cancel() {
        System.out.println("진행하던 주문을 취소하시겠습니까?");
        System.out.println("1. 확인       2. 취소");

        int confirmation1 = scanner.nextInt();
        scanner.nextLine();
        if (confirmation1 == 1) {
            Main.order.clearOrder();
            System.out.println("진행하던 주문이 취소되었습니다\n");
            Kiosk.printMainMenu();
        } else if (confirmation1 == 2) {
            Kiosk.printMainMenu();
        }

    }
}
