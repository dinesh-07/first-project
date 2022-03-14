public class TestJava {

	/*
	 * @author Aman Yadav
	 */
	private static int addAll(int a[]) {
		return 0;

	}

	/*
	 * @author Aman, e.g: [1,3,4] --> 12
	 */
	private static int multiplyAll(int a[]) {
		return 1;

	}

	/*
	 * @author Bhuvan, e.g: [10, 25] key = 5 --> 2,5
	 */
	private static void divideKeyFromEachArrayElement(int a[], int key) {

	}

	/*
	 * @author Lokendra e.g: "abc" --> Palindrome | "ab" --> Not
	 */
	private static boolean isPalindrome(String str) {
		return false;
	}

	/*
	 * @author Lavanya 123 -> 6, 34 -> 7
	 */
	private static int sumOfDigitOfNumber(int number) {
		return 0;
	}

	public static void main(String args[]) {
		System.out.println(isPalindrome("abc"));
		System.out.println(isPalindrome("ab"));

		System.out.println(sumOfDigitOfNumber(2147483647));

		int a[] = { 10, 25 };
		divideKeyFromEachArrayElement(a, 5);

		System.out.println(multiplyAll(a));

		System.out.println(addAll(a));
	}

}
