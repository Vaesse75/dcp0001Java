import java.util.Scanner;

public class dcp20210525 {
	public static void main (String[] args) {
		boolean result = false;
		Scanner entry = new Scanner(System.in);
		
		// figure out k
		System.out.println("Enter 'k' (number to be compared against)");
		int k = entry.nextInt();
		
		// figure out list
		System.out.println("Enter 'list' (list of numbers to be checked)");
		System.out.println("     How many numbers are in your list?");
		int count = entry.nextInt();
		int[] list = new int[count];
		System.out.println("     Enter the numbers:");
		for(int i=0; i<count; i++) {
			list[i] = entry.nextInt();
		}
		
		// do calculation, result = true or false
		for (int i=0; i<list.length; i++) {
			if (list[i] < k) {
				int left = k-list[i];
				// check to see if left is in list
				for (int j=0; j<list.length; j++) {
					if (j != i) {
						if (left == list[j]) {
							result = true;
						}
					}
				}
			}
		}
		
		// write out result
		System.out.println("Your result is "+result);
	}
}
