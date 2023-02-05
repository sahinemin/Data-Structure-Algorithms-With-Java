public class Q2 {
	public static int method(int[] arr){
		 int n = arr.length; // line one has 1
		 int total = 0; //line two has 1
		 for (int j=0; j < n; j++) // line tree has n
			 for (int k=0; k <= j; k++) // line four has n^2
			 	total += arr[j];//line five has n^2


		 return total;//line six has 1
		 
		 //time complexity of algorithm is O(n^2)
		 }
	
	public static int rewrittenMethod(int[] arr){
		 int n = arr.length; // line one has 1
		 int total = 0; //line two has 1
		 for (int j=0; j < n; j++) // line tree has n
		 	total += (j+1)*arr[j];//line four has n
		 return total;//line five has 1
		 
		 //time complexity of algorithm is O(n)
		 }
	
	public static void main(String[] args) {
		int []arr = {1,2,3,4,5,6};
		System.out.println(method(arr));
		System.out.println(rewrittenMethod(arr));
		
	}

}
