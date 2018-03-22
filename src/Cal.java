import java.util.Scanner;

public class Cal {

	// static �� �ִ� �޼ҵ忡�� �޼ҵ带 �ҷ��ö��� static �� �־���Ѵ�.
	static int getFirstValue(Scanner scanner) {
		System.out.println("ù��° �Է� �� : ");
		int first = scanner.nextInt();
		System.out.println(first);
		return first;
	}

	static String getSymbolValue(Scanner scanner) {
		System.out.println("��Ģ���� ��ȣ : ");
		String symbol = scanner.next();
		System.out.println(symbol);
		return symbol;
	}

	static int getSecondValue(Scanner scanner) {
		System.out.println("�ι�° �Է� �� : ");
		int second = scanner.nextInt();
		System.out.println(second);
		return second;
	}

	static int calculate(int first, String symbol, int second) {
		int result = 0;
		if (symbol.equals("+")) {
			result = first + second;
			System.out.println("���� : " + result);
		} else if (symbol.equals("-")) {
			result = first - second;
			System.out.println("����: " + result);
		} else if (symbol.equals("*")) {
			result = first * second;
			System.out.println("����: " + result);
		} else if (symbol.equals("/")) {
			result = first / second;
			System.out.println("������: " + result);
		} else {
			System.out.println("��Ģ���� ��ȣ�� �ƴմϴ�.");
		}
		return result;
	}

	static void print(int result) {
		System.out.println("���� ��� �� : " + result);
	}

	public static void main(String[] args) {

		// ��ĳ�ʸ� �����ϸ� ��ĳ�ʰ� �ڵ������� import �ȴ�.
		Scanner scanner = new Scanner(System.in);

		// getFirstValue �޼ҵ带 �����δ�.
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
