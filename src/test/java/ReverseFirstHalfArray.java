import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseFirstHalfArray {

	public static void main(String[] args) {

		int arr[] = { 4, 5, 3, 10, 7 };
		List<Integer> rotateArray = new ArrayList();

		int mid = arr.length / 2;
		int left = arr[0];
		int right = arr[mid - 1];
		System.out.println(left);
		System.out.println(right);
		int temp;
		
		for(int i=0;i<mid;i++)
		{

		while (left < right) {

			temp = left;
			left = right;
			right = temp;
			System.out.println(left);
			System.out.println(right);
			left++;
			right--;

			rotateArray.add(arr[i]);
			
		}
		}
		System.out.println(Arrays.toString(arr));

	}

}
