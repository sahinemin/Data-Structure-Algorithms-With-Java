import java.util.Arrays;
import java.util.Random;

public class InsertionSort {

    /** Insertion-sort of an array of characters into nondecreasing order */
    public static void insertionSort(int[] data) {
        int n = data.length;
        for (int k = 1; k < n; k++) {            // begin with second character
            int cur = data[k];                    // time to insert cur=data[k]
            int j = k;                             // find correct index j for cur
            while (j > 0 && data[j-1] > cur) {     // thus, data[j-1] must go after cur
                data[j] = data[j-1];                 // slide data[j-1] rightward
                j--;                                 // and consider previous j for cur
            }
            data[j] = cur;                         // this is the proper place for cur
        }
    }
    public static void insertionSortAsc(int[] data) {
        int n = data.length;
        for (int k = 1; k < n; k++) {            // begin with second character
            int cur = data[k];                    // time to insert cur=data[k]
            int j = k;                             // find correct index j for cur
            while (j > 0 && data[j-1] < cur) {     // thus, data[j-1] must go after cur
                data[j] = data[j-1];                 // slide data[j-1] rightward
                j--;                                 // and consider previous j for cur
            }
            data[j] = cur;                         // this is the proper place for cur
        }
    }


    public static void main(String[] args) {
        long sum=0;
        for (int q = 0; q < 10; q++) { //for repeating 10 times
            int data[ ] = new int[4096];//changing between 16,64,256,1024,4096
            Random rand = new Random( ); // a pseudo-random number generator
            //rand.setSeed(System.currentTimeMillis( )); // use current time as a seed
            rand.setSeed(1);

            // fill the data array with pseudo-random numbers from 0 to 99, inclusive
            for (int i = 0; i < data.length; i++)
                data[i] = rand.nextInt(100); // the next pseudo-random number
            //int[ ] orig = Arrays.copyOf(data, data.length); // make a copy of the data array
            //insertionSort(data); // sorting before measuring time
            //insertionSortAsc(data); // sorting ascending before measuring time
            long startTime = System.nanoTime();
            insertionSort(data); // sorting the data array (orig is unchanged)
            long endTime = System.nanoTime();
            long elapsed = endTime-startTime;
            sum+=elapsed;
            //System.out.println("orig = " + Arrays.toString(orig));
            //System.out.println("data = " + Arrays.toString(data));
            //System.out.println("elapsed time = " + elapsed);
        }
        System.out.println(sum/10); //finding average elapsed time

    }
}
