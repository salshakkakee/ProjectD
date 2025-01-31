package Demo1;

public class DemoTestD {
	public static void main(String[] args) {
		int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int num1[] = { 9, 9, 9, 9, 9, 9 };
		int total = 0;
		int result = 0;

		for (int i = 0; i < num.length; i++) {

			total = total + num[i];
		}
		for (int j = 0; j < num1.length; j++) {

			result = result + num1[j];
		}

		System.out.println(total);
		System.out.println(result);

	}

}
