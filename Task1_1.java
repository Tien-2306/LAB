package Task_1;

public class Task1_1 {
		private static  int[] array;
		public Task1_1(int[] array) {
		this.array = array;
		}
		// To find the index of the target in the array. If the target 
		// is not found in the array, then the method returns -1.
		// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}, 45
		// Output: 3
		//public int iterativeLinearSearch(int target) {
			    public int iterativeLinearSearch(int target) {
			        for (int i = 0; i < array.length; i++) {
			            if (array[i] == target) {
			                return i; // Return the index of the target if found
			            }
			        }
			        return -1; // Target not found in the array
			    
			}
		// To find the index of the target in the array. If the target 
		// is not found in the array, then the method returns -1.
		// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}, 15
		// Output: -1
		public int recursiveLinearSearch(int target) {
			return recursiveLinearSearchHelper(target, 0);
	    }

	    private int recursiveLinearSearchHelper(int target2, int index2) {
	        if (index2 >= array.length) {
	            return -1; // Target not found in the array
	        }
	        if (array[index2] == target2) {
	            return index2; // Return the index2 of the target if found
	        }
	        return recursiveLinearSearchHelper(target2, index2 + 1); // Recursive call with next index2
		}
		
		public static void main(String[] args) {
			int[] array= {12, 10, 9, 45, 2, 10, 10, 45};
			Task1_1 a1 = new Task1_1(array);
			int target = 45;
			int index = a1.iterativeLinearSearch(target);
			System.out.println("Target_1: " + target);
			System.out.println("Index_1: " + index);
			
			int target2 = 45;
			int index2 = a1.recursiveLinearSearch(target2);
			System.out.println("Target-2: " + target2);
			System.out.println("Index_2: " + index2);
		}
}
