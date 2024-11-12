import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the 1st string :");
		String s1 = sc.next();
		System.out.print("Enter the 2nd string :");
		String s2 = sc.next();
		s1.toLowerCase();
		s2.toLowerCase();
		if (s1.length() == s2.length()) {
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			if (Arrays.equals(c1, c2)) {
				System.out.println("Anagrams");
			}

			else {
				System.out.println("Not Anagrams");
			}
		}
		else {
			System.out.println("The length of strings are different");
		}
		sc.close();

	}

}
