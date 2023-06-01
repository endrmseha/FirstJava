package kioskProjact;

import static test.Main.scanner;

public class Custard {

    static void printCustardMenu() {
        System.out.println("\nSHAKESHACK BURGER 에 오신걸 환영합니다.");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\n");
        System.out.println("[ Burgers MENU ]");
        System.out.println("1. Vanilla Custard    | W 2.5 | 매끈하고 부드러운 바닐라 맛 아이스크림");
        System.out.println("2. Chocolate Custard  | W 2.5 | 진한 초콜릿 맛 아이스크림");
        System.out.println("3. Strawberry Custard | W 2.5 | 상큼한 딸기 맛 아이스크림");

        int burgerChoice1 = scanner.nextInt();

        switch (burgerChoice1) {
            case 1:
                System.out.println("Vanilla Custard    | W 2.5 | 매끈하고 부드러운 바닐라 맛 아이스크림");
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인       2.취소");
                int confirmation1 = scanner.nextInt();
                scanner.nextLine();
                if (confirmation1 == 1) {
                    Product Vanilla_Custard = new Product("Vanilla Custard", "매끈하고 부드러운 바닐라 맛 아이스크림", 2.5);
                    Main.order.addProduct(Vanilla_Custard);
                    System.out.println("Vanilla Custard가 장바구니에 추가되었습니다.\n");
                    Kiosk.printMainMenu();
                } else if (confirmation1 == 2) {
                    System.out.println("Vanilla Custard 추가를 취소하였습니다.\n");
                    Kiosk.printMainMenu();
                }
                break;
            case 2:
                System.out.println("Chocolate Custard  | W 2.5 | 진한 초콜릿 맛 아이스크림");
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인       2.취소");
                int confirmation2 = scanner.nextInt();
                scanner.nextLine();
                if (confirmation2 == 1) {
                    Product Chocolate_Custard = new Product("Chocolate Custard", "진한 초콜릿 맛 아이스크림", 2.5);
                    Main.order.addProduct(Chocolate_Custard);
                    System.out.println("Chocolate Custard 장바구니에 추가되었습니다.\n");
                    Kiosk.printMainMenu();
                } else if (confirmation2 == 2) {
                    System.out.println("Chocolate Custard 추가를 취소하였습니다.\n");
                    Kiosk.printMainMenu();
                }
                break;
            case 3:
                System.out.println("Strawberry Custard | W 2.5 | 상큼한 딸기 맛 아이스크림");
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인       2.취소");
                int confirmation3 = scanner.nextInt();
                scanner.nextLine();
                if (confirmation3 == 1) {
                    Product Strawberry_Custard = new Product("Strawberry Custard", "상큼한 딸기 맛 아이스크림", 2.5);
                    Main.order.addProduct(Strawberry_Custard);
                    System.out.println("Strawberry Custard가 장바구니에 추가되었습니다.\n");
                    Kiosk.printMainMenu();
                } else if (confirmation3 == 2) {
                    System.out.println("Strawberry Custard 추가를 취소하였습니다.\n");
                    Kiosk.printMainMenu();
                }
                break;
            default:
                System.out.println("올바른 메뉴를 선택해주세요.");
                break;
        }
    }
}
