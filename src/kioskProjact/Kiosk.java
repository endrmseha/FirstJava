package kioskProjact;

import static test.Main.scanner;

public class Kiosk {
    static void printMainMenu() {
        System.out.println("SHAKESHACK BURGER에 오신걸 환영합니다.");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n");
        System.out.println("[SHAKESHACK MENU]");
        System.out.println("1. Burgers         | 앵거스 비프 통살을 다져만든 버거");
        System.out.println("2. Forzen Custard  | 매장에서 신선하게 만드는 아이스크림");
        System.out.println("3. Drinks          | 매장에서 직접 만드는 음료");
        System.out.println("4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주");
        System.out.println("[ORDER MENU]");
        System.out.println("5. Order       | 장바구니를 확인 후 주문합니다.");
        System.out.println("6. Cancel      | 진행중인 주문을 취소합니다.");

        System.out.print("\n메뉴를 선택해주세요: ");
        int menuChoice = scanner.nextInt();
        scanner.nextLine();

        switch (menuChoice) {
            case 1 -> Burgers.printBurgersMenu();
            case 2 -> Custard.printCustardMenu();
            case 3 -> Drinks.printDrinksMenu();
            case 4 -> Beer.printBeerMenu();
            case 5 -> Basket.printOrder();
            case 6 -> Cancel.cancel();
            default -> {
                System.out.println("올바른 메뉴를 선택해주세요.");
                printMainMenu();
            }
        }
    }
}
