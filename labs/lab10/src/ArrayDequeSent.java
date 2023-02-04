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

/**
 * Implementation of the queue ADT using a fixed-length array. All
 * operations are performed in constant time. An exception is thrown
 * if an enqueue operation is attempted when the size of the queue is
 * equal to the length of the array.
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 */

public class ArrayDequeSent<E> implements Deque<E> {
    // instance variables
    /**
     * Default array capacity.
     */
    public static final int CAPACITY = 1000;      // default array capacity

    /**
     * Generic array used for storage of queue elements.
     */
    private E[] data;                             // generic array used for storage

    /**
     * Index of the top element of the queue in the array.
     */
    private int f = 0;                            // index of the front element

    /**
     * Current number of elements in the queue.
     */
    private int sz = 0;                           // current number of elements

    // constructors

    /**
     * Constructs an empty queue using the default array capacity.
     */
    public ArrayDequeSent() {
        this(CAPACITY);
    }         // constructs queue with default capacity

    /**
     * Constructs and empty queue with the given array capacity.
     *
     * @param capacity length of the underlying array
     */
    @SuppressWarnings({"unchecked"})
    public ArrayDequeSent(int capacity) {             // constructs queue with given capacity
        data = (E[]) new Object[capacity];          // safe cast; compiler may give warning
    }

    // methods

    /**
     * Returns the number of elements in the queue.
     *
     * @return number of elements in the queue
     */
    @Override
    public int size() {
        return sz;
    }

        /** Tests whether the queue is empty. */
        @Override
        public boolean isEmpty () {
            return (sz == 0);
        }

        /*
         * Inserts an element at the rear of the queue.
         * This method runs in O(1) time.
         * @param e   new element to be inserted
         * @throws IllegalStateException if the array storing the elements is full
         */
        @Override
        public void addFirst (E e) throws IllegalStateException {
            if (sz == data.length) throw new IllegalStateException("Queue is full");
            f= (f-1 + data.length) % data.length;
            data[f] = e;
            sz++;
        }

        public void addLast (E e) throws IllegalStateException {
            if (sz == data.length) throw new IllegalStateException("Queue is full");
            int avail = (f + sz) % data.length;   // use modular arithmetic
            data[avail] = e;
            sz++;
        }
        /*
         * Returns, but does not remove, the first element of the queue.
         * @return the first element of the queue (or null if empty)
         */
        @Override
        public E first () {
            if (isEmpty()) return null;
            return data[f];

        }

        public E last () {
            if (isEmpty()) return null;
            return data[((f + sz) % data.length)-1];
        }
        /**
         * Removes and returns the first element of the queue.
         * @return element removed (or null if empty)
         */
        @Override
        public E removeFirst () {
            if (isEmpty()) return null;
            E answer = data[f];
            data[f] = null;                             // dereference to help garbage collection
            f = (f + 1) % data.length;
            sz--;
            return answer;
        }

        public E removeLast () {
            if (isEmpty()) return null;
            E answer = data[sz];
            data[sz] = null;                             // dereference to help garbage collection
            sz--;
            return answer;
        }

        /**
         * Returns a string representation of the queue as a list of elements.
         * This method runs in O(n) time, where n is the size of the queue.
         * @return textual representation of the queue.
         */
        public String toString () {
            StringBuilder sb = new StringBuilder("(");
            int k = f;
            for (int j = 0; j < sz; j++) {
                if (j > 0)
                    sb.append(", ");
                sb.append(data[k]);
                k = (k + 1) % data.length;
            }
            sb.append(")");
            return sb.toString();
        }


    public static void main(String[] args) {
        ArrayDequeSent<Integer> deque = new ArrayDequeSent<>();
        deque.addFirst(2);
        deque.addFirst(1);
        deque.addFirst(4);
        deque.addLast(3);
        deque.addLast(5);
        System.out.println(deque.toString());
        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque.toString());
        System.out.println(deque.first());
        System.out.println(deque.last());
        System.out.println(deque.size());
        System.out.println(deque.isEmpty());
    }
}



