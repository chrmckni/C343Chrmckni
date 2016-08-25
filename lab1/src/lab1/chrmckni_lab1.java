package lab1;

public class chrmckni_lab1 {
	
	public static void main(String[] args) {
		// Change this testArray in order to test the function
		int[] testArray = {0, 1, 2, 3, 4, -6, 5, -999, 100};
		
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