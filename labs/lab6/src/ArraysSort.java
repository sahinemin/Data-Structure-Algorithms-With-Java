import java.util.Arrays;
import java.util.Random;

/** Program showing some array uses. */
public class ArraysSort {

    public static void main(String[ ] args) {
        long sum = 0;
        for (int q = 0; q < 10; q++) { //for repeating 10 times
            int data[] = new int[4096]; //changing between 16,64,256,1024,4096
            Random rand = new Random(); // a pseudo-random number generator
            rand.setSeed(System.currentTimeMillis()); // use current time as a seed

            // fill the data array with pseudo-random numbers from 0 to 99, inclusive
            for (int i = 0; i < data.length; i++)
                data[i] = rand.nextInt(100); // the next pseudo-random number
            //int[] orig = Arrays.copyOf(data, data.length); // make a copy of the data array

            long startTime = System.nanoTime();
            Arrays.sort(data); // sorting the data array (orig is unchanged)
            long endTime = System.nanoTime();
            long elapsed = endTime - startTime;
            sum+=elapsed;
            //System.out.println("orig = " + Arrays.toString(orig));
           // System.out.println("data = " + Arrays.toString(data));
          //  System.out.println("elapsed time = " + elapsed);
        }
        System.out.println(sum/10);
    }
}
