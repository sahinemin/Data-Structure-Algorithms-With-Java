
public class Q3 {
	public static void main(String[] args) {
		int[] arr = {13,10,5,83,45,32};
		System.out.println(maximum(arr));
		
	}

	public static int maximum(int[] arr) {
		
		if(arr.length>1) //n-1
		{
			int []newArr=new int[arr.length-1]; //1
			if(arr[0]>=arr[1]) { //1
				arr[1]=arr[0]; //1
				
			}
			//n-1
			System.arraycopy(arr, 1, newArr, 0, newArr.length);
			
			//RECURSIVE
			return maximum(newArr); //1 
		}
		
		else {
			return arr[0]; //1
		}
		
		
		// Time complexity of algorithm is (n)
		

		
	}

}
