import java.util.HashMap;
import java.util.Map;

public class UniqueElementsArray {

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 1, 2, 5};

		
	//outer for loop to traverse //and inner for loop to compare and check the count

		for (int i = 0; i < arr.length; i++) {
			int count = 0;

			for(int j=0;j<arr.length;j++)
			{
				
				if(arr[i]==arr[j])
				{
					count=count+1;
				}
			}
			if(count==1)
			{
				System.out.println(arr[i]);
			}
		}
		
		
	}

}
