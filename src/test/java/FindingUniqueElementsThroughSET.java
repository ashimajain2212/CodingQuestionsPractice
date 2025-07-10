import java.util.HashSet;
import java.util.Set;

public class FindingUniqueElementsThroughSET {

	public static void main(String[] args) {


		int arr[]= {1,2,3,1,2,5};
		Set<Integer> set= new HashSet();
		Set<Integer> duplicate= new HashSet();
		
		for (int i:arr)
		{
			
			
			if(!set.add(i))
			{
				duplicate.add(i);
			}
			
		}System.out.println(set);
		System.out.println(duplicate);

		set.removeAll(duplicate);
		System.out.println(set);
			
		}
	}


