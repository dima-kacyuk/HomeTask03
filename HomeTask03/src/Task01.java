
public class Task01 {

	public static void main(String[] args) {
		int n = 2;
		if (n == 2) {
			for (int a = 1; a < 100; a++) {
				double powA = Math.pow(a, n);
				for (int b = a; b < 100; b++) {
					double powB = Math.pow(b, n);
					for (int c = b; c < 100; c++) {
						double powC = Math.pow(c, n);
						if (powA + powB == powC) {
							System.out.println(
									"a = " + a + ", b = " + b + ", c = " + c + " | Ñóììà a + b = " + ((int)powA + (int)powB) + ", c = " + (int)powC);
						}
					}
				}
			}
		}
	}
	
}
