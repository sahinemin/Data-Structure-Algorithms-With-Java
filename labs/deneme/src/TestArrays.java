import java.lang.IllegalArgumentException;

public class TestArrays {
    public static void main(String[] args) {
        //drawRuler(3,5);
        //System.out.println(binarySearch(new int[] {1,2,35,12,14,17,23,34,45,56,78,98,99,100},23,0,14));
        System.out.println(linearSum(new int[] {1,2,35,12,14,17,23,34,45,56,78,98,99,100},14));
        System.out.println(binarySum(new int[] {1,2,35,12,14,17,23,34,45,56,78,98,99,100},0,13));
    }
    public static void drawRuler(int nInches, int majorLength) {
         drawLine(majorLength, 0); // draw inch 0 line and label
         for (int j = 1; j <= nInches; j++) {
             drawInterval(majorLength -1 ); // draw interior ticks for inch
             drawLine(majorLength, j); // draw inch j line and label
             }
         }
 private static void drawInterval(int centralLength) {
         if (centralLength >= 1) { // otherwise, do nothing
             drawInterval(centralLength - 1); // recursively draw top interval
             drawLine(centralLength); // draw center tick line (without label)
             drawInterval(centralLength - 1); // recursively draw bottom interval
             }
         }
 private static void drawLine(int tickLength, int tickLabel) {
         for (int j = 0; j < tickLength; j++)
             System.out.print("-");
         if (tickLabel >= 0)
             System.out.print(" " + tickLabel);
         System.out.print("\n");
         }

             private static void drawLine(int tickLength) {
         drawLine(tickLength,-1);
         }

    public static int binarySearch(int[ ] data, int target, int low, int high) {
        if (low > high)
             throw new IllegalArgumentException();// interval empty; no match
         else {
             int mid = (low + high) / 2;
             if (target == data[mid])
                 return data[mid]; // found a match
             else if (target < data[mid])
                 return binarySearch(data, target, low, mid - 1); // recur left of the middle
             else
             return binarySearch(data, target, mid + 1, high); // recur right of the middle
             }
         }
    public static int linearSum(int[ ] data, int n) {
         if (n == 0)
             return 0;
         else {
             return linearSum(data, n-1) + data[n-1];
         }
         }

    public static int binarySum(int[ ] data, int low, int high) {
         if (low > high) // zero elements in subarray
             return 0;
         else if (low == high) // one element in subarray
             return data[low];
         else {
             int mid = (low + high) / 2;
             return binarySum(data, low, mid) + binarySum(data, mid+1, high);
             }
         }
         

}
