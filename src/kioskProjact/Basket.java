package kioskProjact;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Basket {
    static int queueNumber = 1;

    static void printOrder() {
        System.out.println("아래와 같이 주문 하시겠습니까?");
        System.out.println("\n[Orders]");
        List<Product> products = Main.order.getProducts();
        if (products.isEmpty()) {
            System.out.println("장바구니가 비어 있습니다.");
        } else {
            for (int i = 0; i < products.size(); i++) {
                Product product = products.get(i);
                System.out.println(product.getName() + " | " + "W " + product.getPrice() + " | " + product.getDescription());
            }
            System.out.println("\n[Total]\n" + "W " + Main.order.getTotalPrice());
        }
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n1. 주문       2. 메뉴판 ");
        String input = scanner.nextLine();
        if (input.equals("1")) {
            System.out.println("주문이 완료되었습니다!\n");
            Main.order.clearOrder();
            System.out.println("대기번호는 [ " + queueNumber + " ] " + "번 입니다.");
            System.out.println("(3초후 메뉴판으로 돌아갑니다..)");
            queueNumber++;

            try {
                TimeUnit.SECONDS.sleep(3); // 3초 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Kiosk.printMainMenu();
        } else if (input.equals("2")) {
            Kiosk.printMainMenu();
        } else {
            System.out.println("올바른 입력을 해주세요.");
//            processOrderInput();
        }
    }
}
