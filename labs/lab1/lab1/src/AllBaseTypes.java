import java.util.Scanner;

public class AllBaseTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
            while (!input.hasNextInt()) {
                input.nextLine( );
                System.out.print("Invalid integer; please enter an integer: ");
            }
            int i = input.nextInt();
            System.out.print("Please enter a float: ");
            while (!input.hasNextFloat()){
                input.nextLine( );
                System.out.print("Invalid float; please enter a float: ");
            }
            float f = input.nextFloat();
            System.out.print("Please enter a boolean: ");
            while (!input.hasNextBoolean()){
                input.nextLine( );
                System.out.print("Invalid boolean; please enter a boolean: ");
            }
            boolean b = input.nextBoolean();
            System.out.print("Please enter a short: ");
            while (!input.hasNextShort()){
                input.nextLine( );
                System.out.print("Invalid short; please enter a short: ");
            }
            short sh = input.nextShort();
            System.out.print("Please enter a double: ");
            while (!input.hasNextDouble()){
                input.nextLine( );
                System.out.print("Invalid double; please enter a double: ");
            }
            double d = input.nextDouble();
            System.out.print("Please enter a byte: ");
            while (!input.hasNextByte()){
                input.nextLine( );
                System.out.print("Invalid byte; please enter a byte: ");
            }
            byte by = input.nextByte();
            System.out.print("Please enter a long: ");
            while (!input.hasNextLong()){
                input.nextLine( );
                System.out.print("Invalid long; please enter a long: ");
            }
            long l = input.nextLong();
            System.out.print("Please enter a string: ");
            input.nextLine();
            while (!input.hasNextLine()){
                input.nextLine( );
                System.out.print("Invalid string; please enter a string: ");
            }
            String st = input.nextLine();
    }
}


