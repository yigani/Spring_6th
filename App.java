import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       while (true) {
           System.out.print("첫 번째 숫자를 입력하세요: ");
           // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
           int x = sc.nextInt();
           System.out.print("두 번째 숫자를 입력하세요: ");
           // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
           int y = sc.nextInt();
           System.out.print("사칙연산 기호를 입력하세요: ");
           // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
           char operator = sc.next().charAt(0);
           int result = 0;
           /* 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현합니다.*/
           if (operator == '/' && y == 0) {
               // 4. 나눗셈에서 분모가 0일 경우 예외 처리
               System.out.println("오류: 나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
           } else {
               switch (operator) {
                   case '+':
                       result = x + y;
                       break;
                   case '-':
                       result = x - y;
                       break;
                   case '*':
                       result = x * y;
                       break;
                   case '/':
                       result = x / y;
                       break;
               }
           }
           System.out.println("결과: " + result);
           System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
           String input = sc.next();
           if (input.equals("exit")) {
               System.out.println("계산 종료");
               break;
           }
       }
    }
}