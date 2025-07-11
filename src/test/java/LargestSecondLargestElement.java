import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LargestSecondLargestElement {

	public static void main(String[] args) {

		int arr[] = { 4, 5, 3, 10, 7 };

		int largest =  Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int num : arr) {

			if (num > largest)
			{
				secondLargest = largest;
			largest = num;

			}	
			
			if(num>secondLargest && num!=largest)
			{
				secondLargest=num;
				
			}
		}
		
		
		System.out.println(largest);
		System.out.println(secondLargest);

	}
}
