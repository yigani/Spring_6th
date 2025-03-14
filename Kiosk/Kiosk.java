package Kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<Menu> menus;
    private Scanner scanner;

    public Kiosk() {
        menus = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addMenu(Menu menu) {
        menus.add(menu);
    }

    public void start() {
        while (true) {
            System.out.println("[ MAIN MENU ]");
            for (int i = 0; i < menus.size(); i++) {
                System.out.println((i + 1) + ". " + menus.get(i).getCategoryName());
            }
            System.out.println("0. 종료      | 종료");

            int choice = getUserInput();
            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (choice > 0 && choice <= menus.size()) {
                displaySubMenu(menus.get(choice - 1));
            } else {
                System.out.println("올바른 번호를 입력해주세요.");
            }
        }
    }

    private void displaySubMenu(Menu menu) {
        while (true) {
            menu.displayMenu();
            int choice = getUserInput();
            if (choice == 0) {
                return;
            } else if (choice > 0 && choice <= menu.getMenuItems().size()) {
                MenuItem selectedItem = menu.getMenuItems().get(choice - 1);
                System.out.println("선택한 메뉴: " + selectedItem.getName() + " | W " + selectedItem.getPrice() + " | " + selectedItem.getDescription());
            } else {
                System.out.println("올바른 번호를 입력해주세요.");
            }
        }
    }

    private int getUserInput() {
        System.out.print("입력: ");
        while (!scanner.hasNextInt()) {
            System.out.println("숫자를 입력해주세요.");
            scanner.next();
        }
        return scanner.nextInt();
    }
}