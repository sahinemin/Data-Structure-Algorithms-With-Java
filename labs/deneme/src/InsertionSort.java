/*
 * Copyright 2014, Michael T. Goodrich, Roberto Tamassia, Michael H. Goldwasser
 *
 * Developed for use with the book:
 *
 *    Data Structures and Algorithms in Java, Sixth Edition
 *    Michael T. Goodrich, Roberto Tamassia, and Michael H. Goldwasser
 *    John Wiley & Sons, 2014
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

public class InsertionSort {

    /** Insertion-sort of an array of characters into nondecreasing order */
    public static void insertionSort(int[] data) {
        int n = data.length;
        for (int k = 1; k < n; k++) {            // begin with second character
            int cur = data[k];                    // time to insert cur=data[k]
            int j = k;
            while (j > 0 && data[j-1] > cur) {     // thus, data[j-1] must go after cur
                data[j] = data[j-1];                 // slide data[j-1] rightward
                j--;// and consider previous j for cur
            }
            data[j] = cur;
        }
    }
    public static void insertionSortHL(int[] data) {
        int n = data.length;
        for (int k = 1; k < n; k++) {            // begin with second character
            int cur = data[k];                    // time to insert cur=data[k]
            int j = k;
            while (j > 0 && data[j-1] < cur) {     // thus, data[j-1] must go after cur
                data[j] = data[j-1];                 // slide data[j-1] rightward
                j--;// and consider previous j for cur
            }
            data[j] = cur;
        }
    }

    public static void main(String[] args) {
        int data[]= {41, 38, 48, 12, 28, 46, 33, 19, 10, 58};
        int orig[] = {41, 38, 48, 12, 28, 46, 33, 19, 10, 58};
        System.out.print("orig = "+java.util.Arrays.toString(orig));
        insertionSort(orig);
        System.out.println();
        System.out.println("data = "+java.util.Arrays.toString(orig));
        int indices[]= new int [10];
        System.out.print(
                "indices = ");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if(data[j]==orig[i])
                    indices[i]=j;
            }
        }

        System.out.println(java.util.Arrays.toString(indices));
        insertionSortHL(orig);
        System.out.println("descending = "+java.util.Arrays.toString(orig));


    }
}
