import java.util.Scanner;

public class Cal {

	public static void main(String[] args) {

		// ��ĳ�ʸ� �����ϸ� ��ĳ�ʰ� �ڵ������� import �ȴ�.
		Scanner scanner = new Scanner(System.in);
		System.out.println("ù��° �Է� �� : ");
		int first = scanner.nextInt();
		System.out.println(first);

		System.out.println("�ι�° �Է� �� : ");
		int second = scanner.nextInt();
		System.out.println(second);

		System.out.println("���� : " + (first + second));
		System.out.println("����: " + (first - second));
		System.out.println("����: " + (first * second));
		System.out.println("������: " + (first / second));

	}

}
