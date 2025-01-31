package Demo1;

public class DemoTestD {
	public static void main(String[] args) {
		int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int total = 0;

		for (int i = 0; i < num.length; i++) {

			total = total + num[i];
		}

		System.out.println(total);

	}

}
