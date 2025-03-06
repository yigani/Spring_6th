import java.util.ArrayList;
import java.util.List;

public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    private List<Integer> resultsData;
    public Calculator() {
        resultsData = new ArrayList<>();
    }

    public int calculate(int x, int y, char operator) {
        int result = 0;

        if (operator == '/' && y == 0) {
            System.out.println("오류: 나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
        }

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
            default:
                System.out.println("오류: 잘못된 연산자입니다.)");
        }

        addResult(result);
        return result;
    }

    public List<Integer> getResults() {
        return resultsData;
    }
    private void addResult(int result) {
        resultsData.add(result);
    }
}