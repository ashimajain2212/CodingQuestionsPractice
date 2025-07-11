
public class TotalSumOfElements {

	public static void main(String[] args) {

		int arr[] = { 4, 5, 3, 10, 7 };

		int totalSum = 0;
		
		int totalNumberofElements=arr.length;

		for (int i : arr)

		{
			totalSum= totalSum+i;
		}
System.out.println(totalSum);
double avg = (double)totalSum/totalNumberofElements;

System.out.println("Average is" +avg);
	}
	
	
}
