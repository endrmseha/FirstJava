package kioskProjact;

import static test.Main.scanner;

public class Drinks {
    static void printDrinksMenu() {
        System.out.println("\nSHAKESHACK BURGER 에 오신걸 환영합니다.");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\n");
        System.out.println("[ Drinks MENU ]");
        System.out.println("1. Coke     | W 1.5 | 콜라");
        System.out.println("2. Sprite   | W 1.5 | 스프라이트");
        System.out.println("3. Fanta    | W 1.5 | 환타");
        System.out.println("4. Lemonade | W 2.0 | 레몬에이드");

        int burgerChoice1 = scanner.nextInt();

        switch (burgerChoice1) {
            case 1:
                System.out.println("Coke     | W 1.5 | 콜라");
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인       2.취소");
                int confirmation1 = scanner.nextInt();
                scanner.nextLine();
                if (confirmation1 == 1) {
                    Product Coke = new Product("Coke", "콜라", 1.5);
                    Main.order.addProduct(Coke);
                    System.out.println("Coke 장바구니에 추가되었습니다.\n");
                    Kiosk.printMainMenu();
                } else if (confirmation1 == 2) {
                    System.out.println("Coke 추가를 취소하였습니다.\n");
                    Kiosk.printMainMenu();
                }
                break;
            case 2:
                System.out.println("Sprite   | W 1.5 | 스프라이트");
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인       2.취소");
                int confirmation2 = scanner.nextInt();
                scanner.nextLine();
                if (confirmation2 == 1) {
                    Product Sprite = new Product("Sprite", "스프라이트", 1.5);
                    Main.order.addProduct(Sprite);
                    System.out.println("Sprite 장바구니에 추가되었습니다.\n");
                    Kiosk.printMainMenu();
                } else if (confirmation2 == 2) {
                    System.out.println("Sprite 추가를 취소하였습니다.\n");
                    Kiosk.printMainMenu();
                }
                break;
            case 3:
                System.out.println("Fanta    | W 1.5 | 환타");
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인       2.취소");
                int confirmation3 = scanner.nextInt();
                scanner.nextLine();
                if (confirmation3 == 1) {
                    Product Fanta = new Product("Fanta", "환타", 1.5);
                    Main.order.addProduct(Fanta);
                    System.out.println("Fanta가 장바구니에 추가되었습니다.\n");
                    Kiosk.printMainMenu();
                } else if (confirmation3 == 2) {
                    System.out.println("Fanta 추가를 취소하였습니다.\n");
                    Kiosk.printMainMenu();
                }
                break;
            case 4:
                System.out.println("Lemonade | W 2.0 | 레모네이드");
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인       2.취소");
                int confirmation4 = scanner.nextInt();
                scanner.nextLine();
                if (confirmation4 == 1) {
                    Product Lemonade = new Product("Lemonade", "레몬에이드", 2.0);
                    Main.order.addProduct(Lemonade);
                    System.out.println("Lemonade 장바구니에 추가되었습니다.\n");
                    Kiosk.printMainMenu();
                } else if (confirmation4 == 2) {
                    System.out.println("Lemonade 추가를 취소하였습니다.\n");
                    Kiosk.printMainMenu();
                }
                break;
            default:
                System.out.println("올바른 메뉴를 선택해주세요.");
                break;
        }
    }
}
