import java.util.ArrayList;
import java.util.List;

public class LeaderProblemArray {

	public static void main(String[] args) {
		
		int a[] = {16,17,4,3,5,2};
		
		List<Integer> arr= new ArrayList();
		
		for(int i=a.length;i>0;i--)
		{
			
			for(int j=a.length-1;j>0;j--)
				
			{
				
				if (a[j]>a[i])
				{
					
					arr.add(a[i]);
				}
				System.out.println(arr);
					
			}
		}
	}

}
