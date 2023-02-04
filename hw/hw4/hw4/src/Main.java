public class Main {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        findMinimumAndMaximumOf(arr);
        findPxOn2(arr,3);
        findPxOnlogn(arr,3);
        horner(arr,3);

    }

    public static void findMinimumAndMaximumOf(int[] arr){
        int max=arr[0];
        int min = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]>max)
                max=arr[i];
            else if(arr[i]<min)
                min=arr[i];
        }
        System.out.println("max of the array: ="+max);
        System.out.println("min of the array: ="+min);

    }
    public static void findPxOn2(int[] arr, int x){
        int total=0;
        for (int i = 0; i < arr.length; i++) {
            int tempX=1;
            for (int j = 0; j < i; j++) {
                tempX*=x;
            }
            total+=arr[i]*tempX;
        }
        System.out.println(total);
    }

    public static void horner(int[] arr, int x){
        int total=0;  //1 operation
        int tempX=1; //1 operation
        for (int j : arr) { //n operation
            total += j * tempX; //n operation
            tempX *= x; //n operation
        }
        System.out.println(total); //1 operation

        // Time complexity is O(n)
    }

    public static void findPxOnlogn(int[] arr, int x){
        int total=0;
        for (int i = 0; i < arr.length; i++) {
            int tempX=x;
            for (int j = 1; j <= i; j*=2) {
                tempX*=x;
            }
            tempX/=x;
            total+=arr[i]*tempX;
        }
        System.out.println(total);
    }

}
