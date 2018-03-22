import java.util.Scanner;

public class Cal {

	public static void main(String[] args) {

		// 스캐너를 생성하면 스캐너가 자동적으로 import 된다.
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 입력 값 : ");
		int first = scanner.nextInt();
		System.out.println(first);

		System.out.println("사칙연산 기호 : ");
		String symbol = scanner.next();
		System.out.println(symbol);

		System.out.println("두번째 입력 값 : ");
		int second = scanner.nextInt();
		System.out.println(second);

		if (symbol.equals("+")) {
			System.out.println("덧셈 : " + (first + second));
		} else if (symbol.equals("-")) {
			System.out.println("뺄셈: " + (first - second));
		} else if (symbol.equals("*")) {
			System.out.println("곱셈: " + (first * second));
		} else if (symbol.equals("/")) {
			System.out.println("나눗셈: " + (first / second));
		} else {
			System.out.println("사칙연산 기호가 아닙니다.");
		}
	}

}
