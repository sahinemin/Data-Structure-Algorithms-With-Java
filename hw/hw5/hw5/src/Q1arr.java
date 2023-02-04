import java.util.*;
public class Q1arr {
    public static void main(String[] args) {
        List<List<Integer>> subset = new ArrayList<>();
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        printSubsets(subset, input, new ArrayList<>(), 0);
    }

    public static void printSubsets(List<List<Integer>> subset, ArrayList<Integer> input, ArrayList<Integer> output, int index)
    {
        if (index == input.size()) {
            subset.add(output);
            if(subset.size()==Math.pow(2, input.size()))
            {
                System.out.println("");
                for (List<Integer> integers : subset) {
                    for (Integer integer : integers) {
                        System.out.print(integer + " ");
                    }
                    System.out.println();
                }
            }

            return;
        }
        printSubsets(subset, input, new ArrayList<>(output), index + 1);
        output.add(input.get(index));
        printSubsets(subset, input, new ArrayList<>(output), index + 1);
    }
}