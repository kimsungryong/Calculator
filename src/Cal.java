import java.util.Scanner;

public class Cal {

	// static 이 있는 메소드에서 메소드를 불러올때는 static 이 있어야한다.
	static int getFirstValue(Scanner scanner) {
		System.out.println("첫번째 입력 값 : ");
		int first = scanner.nextInt();
		System.out.println(first);
		return first;
	}

	static String getSymbolValue(Scanner scanner) {
		System.out.println("사칙연산 기호 : ");
		String symbol = scanner.next();
		System.out.println(symbol);
		return symbol;
	}

	static int getSecondValue(Scanner scanner) {
		System.out.println("두번째 입력 값 : ");
		int second = scanner.nextInt();
		System.out.println(second);
		return second;
	}

	static int calculate(int first, String symbol, int second) {
		int result = 0;
		if (symbol.equals("+")) {
			result = first + second;
			System.out.println("덧셈 : " + result);
		} else if (symbol.equals("-")) {
			result = first - second;
			System.out.println("뺄셈: " + result);
		} else if (symbol.equals("*")) {
			result = first * second;
			System.out.println("곱셈: " + result);
		} else if (symbol.equals("/")) {
			result = first / second;
			System.out.println("나눗셈: " + result);
		} else {
			System.out.println("사칙연산 기호가 아닙니다.");
		}
		return result;
	}

	static void print(int result) {
		System.out.println("최종 결과 값 : " + result);
	}

	public static void main(String[] args) {

		// 스캐너를 생성하면 스캐너가 자동적으로 import 된다.
		Scanner scanner = new Scanner(System.in);

		// getFirstValue 메소드를 블러들인다.
		int first = getFirstValue(scanner);

		int result = first;
		while (true) {
			String symbol = getSymbolValue(scanner);

			if (symbol.equals("quit")) {
				print(result);
				break;
			}

			int second = getSecondValue(scanner);

			result = calculate(result, symbol, second);

		}

	}

}
