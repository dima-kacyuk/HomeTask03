
public class Task02 {

	public static void main(String[] argresult) {

		double res = 0;
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0)
				res -= 1 / i;
			else
				res += 1 / i;

		}
		System.out.println("Ответ = " + (int) res);
	}

}
