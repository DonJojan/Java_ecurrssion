package Recurrssion;

//Java implementation of recursive Binary Search
class BinarySearch1 {

	// Returns index of x if it is present
	// in arr[l..r], else return -1
	int binarySearch1(int arr[], int l,
						int r, int x)
	{
		//Restrict the boundary of right index
		// and the left index to prevent
		// overflow of indices.
		if (r >= l && l<arr.length-1) {
		
			int mid = l + (r - l) / 2;

			// If the element is present
			// at the middle itself
			if (arr[mid] == x)
				return mid;

			// If element is smaller than mid, then it can only
			// be present in left subarray
			if (arr[mid] > x)
				return binarySearch1(arr, l, mid - 1, x);

			// Else the element can only be present in right
			// subarray
			return binarySearch1(arr, mid + 1, r, x);
		}

		// We reach here when element is not present in array
		return -1;
	}

	// Driver method to test above
	public static void main(String args[])
	{
		BinarySearch1 ob = new BinarySearch1();
		int arr[] = { 2, 3, 4, 10, 40 };
		int n = arr.length;
		int x = 40;
		int result = ob.binarySearch1(arr, 0, n - 1, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}
}
/* This code is contributed by Rajat Mishra */
