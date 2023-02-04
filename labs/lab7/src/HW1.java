import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(func(scanner.nextInt()));
        /*
        int n = scanner.nextInt();
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.printf("\n");
        }*/


    }

    public static int func(int input){
        if (input<1)
            return 5;
        else {
            return 2* func(input-1)+input;
        }
    }

}
