/* The merge step is an important step in the mergesort divide and conquer strategy .
It takes two arrays (in sorted order) and merges them to create another array which 
is sorted 
*/

public static int[] merge(int[] a , int[] b) { 
		int[] merged_array = new int[a.length + b.length];
		int merged_array_index = 0 ;
		int first_array_index = 0 ;
		int second_array_index = 0 ;
		
		while(merged_array_index != merged_array.length) {
			if(first_array_index == a.length && second_array_index != b.length)	{
				merged_array[merged_array_index] = b[second_array_index];
				second_array_index++;
				merged_array_index++;
				continue;
			} else if(first_array_index != a.length && second_array_index == b.length) {
				merged_array[merged_array_index] = a[first_array_index];
				first_array_index++;
				merged_array_index++;
				continue;
			} else {
				if(a[first_array_index] <= b[second_array_index]) {
					merged_array[merged_array_index] = a[first_array_index];
					first_array_index++;
				} else {
					merged_array[merged_array_index] = b[second_array_index];
					second_array_index++;
					
				}
				merged_array_index++;
			}
		}
		
		
		return merged_array; 
	}
