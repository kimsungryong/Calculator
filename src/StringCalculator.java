import java.util.Scanner;

public class StringCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("계산할 값 입력 : ");

		String value = scanner.nextLine();
		System.out.println("입력 값 : " + value);

		String[] values = value.split(" ");

		int first = Integer.parseInt(values[0]);

		// int i = 1;
		int result = first;

		// 2씩 증가해야된다.
		for (int i = 1; i < values.length; i += 2) {
			String symbol = values[i];
			System.out.println("symbol : " + symbol);

			int second = Integer.parseInt(values[i + 1]);
			System.out.println("second : " + second);

			result = Cal.calculate(result, symbol, second);
		}
		// while 문
		/*
		 * while (i < values.length) { String symbol = values[i];
		 * System.out.println("symbol : " + symbol);
		 * 
		 * int second = Integer.parseInt(values[i + 1]); System.out.println("second : "
		 * + second);
		 * 
		 * result = Cal.calculate(result, symbol, second);
		 * 
		 * i = i + 2;
		 */
		Output.print(result);
	}
}
