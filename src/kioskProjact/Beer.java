package kioskProjact;

import static test.Main.scanner;

public class Beer {
    static void printBeerMenu() {
        System.out.println("\nSHAKESHACK BURGER 에 오신걸 환영합니다.");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\n");
        System.out.println("[ Beer MENU ]");
        System.out.println("1. IPA      | W 5.0 | 인도계통 에일");
        System.out.println("2. Lager    | W 4.0 | 라거");
        System.out.println("3. Stout    | W 6.0 | 스타우트");
        System.out.println("4. Pale Ale | W 5.5 | 페일 에일");

        int burgerChoice1 = scanner.nextInt();

        switch (burgerChoice1) {
            case 1:
                System.out.println("IPA      | W 5.0 | 인도계통 에일");
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인       2.취소");
                int confirmation1 = scanner.nextInt();
                scanner.nextLine();
                if (confirmation1 == 1) {
                    Product IPA = new Product("IPA", "인도계통 에일", 5.0);
                    Main.order.addProduct(IPA);
                    System.out.println("IPA 장바구니에 추가되었습니다.\n");
                    Kiosk.printMainMenu();
                } else if (confirmation1 == 2) {
                    System.out.println("IPA 추가를 취소하였습니다.\n");
                    Kiosk.printMainMenu();
                }
                break;
            case 2:
                System.out.println("Lager    | W 4.0 | 라거");
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인       2.취소");
                int confirmation2 = scanner.nextInt();
                scanner.nextLine();
                if (confirmation2 == 1) {
                    Product Lager = new Product("Lager", "라거", 4.0);
                    Main.order.addProduct(Lager);
                    System.out.println("Lager 장바구니에 추가되었습니다.\n");
                    Kiosk.printMainMenu();
                } else if (confirmation2 == 2) {
                    System.out.println("Lager 추가를 취소하였습니다.\n");
                    Kiosk.printMainMenu();
                }
                break;
            case 3:
                System.out.println("Stout    | W 6.0 | 스타우트");
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인       2.취소");
                int confirmation3 = scanner.nextInt();
                scanner.nextLine();
                if (confirmation3 == 1) {
                    Product Stout = new Product("Stout", "스타우트", 6.0);
                    Main.order.addProduct(Stout);
                    System.out.println("Stout 장바구니에 추가되었습니다.\n");
                    Kiosk.printMainMenu();
                } else if (confirmation3 == 2) {
                    System.out.println("Stout 추가를 취소하였습니다.\n");
                    Kiosk.printMainMenu();
                }
                break;
            case 4:
                System.out.println("Pale Ale | W 5.5 | 페일 에일");
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인       2.취소");
                int confirmation4 = scanner.nextInt();
                scanner.nextLine();
                if (confirmation4 == 1) {
                    Product Pale_Ale = new Product("Pale Ale", "페일 에일", 5.5);
                    Main.order.addProduct(Pale_Ale);
                    System.out.println("Pale Ale 장바구니에 추가되었습니다.\n");
                    Kiosk.printMainMenu();
                } else if (confirmation4 == 2) {
                    System.out.println("Pale Ale 추가를 취소하였습니다.\n");
                    Kiosk.printMainMenu();
                }
                break;
            default:
                System.out.println("올바른 메뉴를 선택해주세요.");
                break;
        }
    }
}
