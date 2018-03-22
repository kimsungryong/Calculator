import java.util.Scanner;

public class Cal {

	// static �� �ִ� �޼ҵ忡�� �޼ҵ带 �ҷ��ö��� static �� �־���Ѵ�.
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

	public static void main(String[] args) {

		// ��ĳ�ʸ� �����ϸ� ��ĳ�ʰ� �ڵ������� import �ȴ�.
		Scanner scanner = new Scanner(System.in);

		// getFirstValue �޼ҵ带 �����δ�.
		int first = Input.getFirstValue(scanner);

		int result = first;
		while (true) {
			String symbol = Input.getSymbolValue(scanner);

			if (symbol.equals("quit")) {
				Output.print(result);
				break;
			}

			int second = Input.getSecondValue(scanner);

			result = calculate(result, symbol, second);

		}

	}

}
