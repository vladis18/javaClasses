
public class Whileloop {

	public static void main(String[] args) {
		int counter = 0;

		for (int i = counter; i <= 5; i++) {
			for (int j = 1; j <= i * 10; j++) {
				System.out.print(j * counter);
			}

			System.out.println("Hello");
			counter = counter + 1;
			// System.out.print(i );
		}

	}

}
