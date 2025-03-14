package Kiosk;

public class Main {
    public static void main(String[] args) {
        Kiosk kiosk = new Kiosk();

        // 버거 메뉴 생성
        Menu burgerMenu = new Menu("Burgers");
        burgerMenu.addMenuItem(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // 음료 메뉴 생성
        Menu drinkMenu = new Menu("Drinks");
        drinkMenu.addMenuItem(new MenuItem("Coke", 2.5, "코카 콜라"));
        drinkMenu.addMenuItem(new MenuItem("Sprite", 2.5, "스프라이트"));

        // 디저트 메뉴 생성
        Menu dessertMenu = new Menu("Desserts");
        dessertMenu.addMenuItem(new MenuItem("Ice Cream", 4.5, "바닐라 아이스트림"));
        dessertMenu.addMenuItem(new MenuItem("Brownie", 3.5, "브라우니"));

        // 키오스크에 메뉴 추가
        kiosk.addMenu(burgerMenu);
        kiosk.addMenu(drinkMenu);
        kiosk.addMenu(dessertMenu);

        // 키오스크 실행
        kiosk.start();
    }
}