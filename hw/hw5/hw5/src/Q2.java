public class Q2 {
    static void Tower_of_Hanoi(int n, char from_peg, char to_peg, char temp_peg)
    {
        if (n == 0) {
            return;
        }
        //Move n-1 disks from from_peg to temp_peg using to_peg as helper (i.e. temporary storage) by
        //making a recursive call
        Tower_of_Hanoi(n - 1, from_peg, temp_peg, to_peg);

        //Move the last disk (nth disk) from from_peg to to_peg (implement this move as a print statement
        //that moves the last disk to to_peg)

        System.out.println("Move disk " + n + " from peg " + from_peg + " to peg " + to_peg);

        //Move n-1 disks from temp_peg to to_peg using from_peg as helper (i.e. temporary storage) by
        //making a recursive call
        Tower_of_Hanoi(n - 1, temp_peg, to_peg, from_peg);
    }

    public static void main(String args[])
    {
        Tower_of_Hanoi(4, 'A', 'C', 'B');
    }
}
