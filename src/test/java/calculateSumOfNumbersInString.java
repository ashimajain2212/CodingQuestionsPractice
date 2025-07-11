import java.util.Arrays;

public class calculateSumOfNumbersInString {

	public static void main(String[] args) {
		String input = "this is 100 and it should be 2000";

		String[] splittedString = input.split("\\s");

		int num = 0;
		int totalSUM = 0;
		for (int i = 0; i < splittedString.length; i++) {
			try {
				num = Integer.parseInt(splittedString[i]);
				System.out.println(num);
				totalSUM = totalSUM + num;
			}

			catch (NumberFormatException e) {
				System.out.println(e.getMessage());
			}
			System.out.println(totalSUM);
		}

	}
}
