import java.util.Scanner;

public class Cal {

	public static void main(String[] args) {

		// ��ĳ�ʸ� �����ϸ� ��ĳ�ʰ� �ڵ������� import �ȴ�.
		Scanner scanner = new Scanner(System.in);
		System.out.println("ù��° �Է� �� : ");
		int first = scanner.nextInt();
		System.out.println(first);

		int result = first;
		while (true) {

			System.out.println("��Ģ���� ��ȣ : ");
			String symbol = scanner.next();
			System.out.println(symbol);

			if (symbol.equals("quit")) {
				System.out.println("���� ��� �� : " + result);
				break;
			}

			System.out.println("�ι�° �Է� �� : ");
			int second = scanner.nextInt();
			System.out.println(second);

			if (symbol.equals("+")) {
				result = result + second;
				System.out.println("���� : " + result);
			} else if (symbol.equals("-")) {
				result = result - second;
				System.out.println("����: " + result);
			} else if (symbol.equals("*")) {
				result = result * second;
				System.out.println("����: " + result);
			} else if (symbol.equals("/")) {
				result = result / second;
				System.out.println("������: " + result);
			} else {
				System.out.println("��Ģ���� ��ȣ�� �ƴմϴ�.");
			}

		}

	}

}
