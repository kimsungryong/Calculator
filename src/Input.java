import java.util.Scanner;

public class Input {

	// Input 클래스를 만들어서 구조를 바꾼다.
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

}
