import java.util.Scanner;

public class Input {

	// Input Ŭ������ ���� ������ �ٲ۴�.
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

}
