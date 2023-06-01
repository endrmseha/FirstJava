package kioskProjact;

import static test.Main.scanner;

public class Burgers {
    static void printBurgersMenu() {
        System.out.println("\nSHAKESHACK BURGER 에 오신걸 환영합니다.");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\n");
        System.out.println("[ Burgers MENU ]");
        System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        System.out.println("3. Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거");
        System.out.println("4. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        System.out.println("5. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");

        int burgerChoice1 = scanner.nextInt();

        switch (burgerChoice1) {
            case 1:
                System.out.println("ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인       2.취소");
                int confirmation1 = scanner.nextInt();
                scanner.nextLine();
                if (confirmation1 == 1) {
                    Product shackBurger = new Product("ShackBurger", "토마토, 양상추, 쉑소스가 토핑된 치즈버거", 6.9);
                    Main.order.addProduct(shackBurger);
                    System.out.println("ShackBurger가 장바구니에 추가되었습니다.\n");
                    Kiosk.printMainMenu();
                } else if (confirmation1 == 2) {
                    System.out.println("ShackBurger 추가를 취소하였습니다.\n");
                    Kiosk.printMainMenu();
                }
                break;
            case 2:
                System.out.println("SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인       2.취소");
                int confirmation2 = scanner.nextInt();
                scanner.nextLine();
                if (confirmation2 == 1) {
                    Product smokeShack = new Product("SmokeShack", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거", 8.9);
                    Main.order.addProduct(smokeShack);
                    System.out.println("SmokeShack가 장바구니에 추가되었습니다.\n");
                    Kiosk.printMainMenu();
                } else if (confirmation2 == 2) {
                    System.out.println("SmokeShack 추가를 취소하였습니다.\n");
                    Kiosk.printMainMenu();
                }
                break;
            case 3:
                System.out.println("Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거");
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인       2.취소");
                int confirmation3 = scanner.nextInt();
                scanner.nextLine();
                if (confirmation3 == 1) {
                    Product shroomBurger = new Product("Shroom Burger", "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거", 9.4);
                    Main.order.addProduct(shroomBurger);
                    System.out.println("Shroom Burger가 장바구니에 추가되었습니다.\n");
                    Kiosk.printMainMenu();
                } else if (confirmation3 == 2) {
                    System.out.println("Shroom Burger 추가를 취소하였습니다.\n");
                    Kiosk.printMainMenu();
                }
                break;
            case 4:
                System.out.println("Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인       2.취소");
                int confirmation4 = scanner.nextInt();
                scanner.nextLine();
                if (confirmation4 == 1) {
                    Product cheeseburger = new Product("Cheeseburger", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거", 6.9);
                    Main.order.addProduct(cheeseburger);
                    System.out.println("Cheeseburger가 장바구니에 추가되었습니다.\n");
                    Kiosk.printMainMenu();
                } else if (confirmation4 == 2) {
                    System.out.println("Cheeseburger 추가를 취소하였습니다.\n");
                    Kiosk.printMainMenu();
                }
                break;
            case 5:
                System.out.println("Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인       2.취소");
                int confirmation5 = scanner.nextInt();
                scanner.nextLine();
                if (confirmation5 == 1) {
                    Product hamburger = new Product("Hamburger", "비프패티를 기반으로 야채가 들어간 기본버거", 5.4);
                    Main.order.addProduct(hamburger);
                    System.out.println("Hamburger가 장바구니에 추가되었습니다.\n");
                    Kiosk.printMainMenu();
                } else if (confirmation5 == 2) {
                    System.out.println("Hamburger 추가를 취소하였습니다.\n");
                    Kiosk.printMainMenu();
                }
                break;
            default:
                System.out.println("올바른 메뉴를 선택해주세요.");
                break;
        }
    }
}
