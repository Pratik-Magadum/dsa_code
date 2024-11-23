package src.patterns;

/**
 * 
 */
public class Patterns {
	public static void main(String[] args) {
//		pattern1(5);
//		pattern2(5);
//		pattern3(5);
//		pattern4(5);
//		pattern5(5);
//		pattern6(5);
//		pattern7(5);
//		pattern8(5);
		pattern9(5);
//		pattern10(5);
	}

	private static void pattern1(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void pattern2(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void pattern3(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	private static void pattern4(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	private static void pattern5(int n) {
		for (int i = 0; i < n; i++) {
//			space
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print(" ");
			}
//			stars
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
//			space
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	private static void pattern6(int n) {
		for (int i = n; i >= 0; i--) {
//			space
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print(" ");
			}
//			stars (we also can use formula like 2*n-(2*i+1))
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
//			space
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	private static void pattern7(int n) {
		for (int i = 1; i <= 2 * n - 1; i++) {
			int stars = i;
			stars = i > n ? 2 * n - i : i;
			for (int j = 1; j <= stars; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void pattern8(int n) {
		for (int i = 1; i <= n; i++) {
			int start = 1;
			if (i % 2 == 0)
				start = 1;
			else
				start = 0;
			for(int j=1;j<=i;j++) {
				System.out.print(start);
				start=1-start;
			}
			System.out.println();
		}
	}

	private static void pattern9(int n) {
		for(int i=1;i<=n;i++) {
			for(int j =1 ; j<=i;j++) {
				System.out.print(j);
			}
			for(int j =1 ; j<=2*(n-i);j++) {
				System.out.print(" ");
			}

			for(int j =i ; j>0;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	private static void pattern10(int n) {
//		for(int i=1;i<=n;i++) {
		 space(5-n);


//			System.out.println();
//		}
	}
	private static void space(int n) {
//		for(int i=0;i<=n;i++) {

//		}
	}
	
}
