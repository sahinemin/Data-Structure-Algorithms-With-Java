public class Q1 {
    public static void printSubsets(String input, int i, String current)
    {
        if (i == input.length()) {
            System.out.println(current);
            return;
        }
        printSubsets(input, i + 1, current + input.charAt(i));
        printSubsets(input, i + 1, current);
    }
    public static void main(String[] args)
    {
        String str = "efg";
        printSubsets(str, 0, "");
    }
}
