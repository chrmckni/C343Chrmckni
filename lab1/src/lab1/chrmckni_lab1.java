package lab1;
import java.util.Scanner; 
import java.util.*;
public class chrmckni_lab1 {
	
	public static void main(String[] args) {
		// Change this testArray in order to test the function

		Scanner scanner = new Scanner( System.in );
		String input = scanner.nextLine();
		
		List<String> myList = new ArrayList<String>(Arrays.asList(input.split(" ")));
		
		int[] testArray = new int[myList.size()];
		
		for (int i = 0; i < testArray.length; i++) 
			testArray[i] = Integer.parseInt(myList.get(i));
		
		System.out.print(positiveAverage(testArray));
	}
	
	static int positiveAverage(int[] arr) {
		int count = 0;
		int average = 0;
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] == -999)
				break;
			
			if (arr[i] > 0) {
				average += arr[i];
				count += 1;
			}
		}
		return (average / count);
	}
}