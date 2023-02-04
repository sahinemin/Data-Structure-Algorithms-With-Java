import java.util.ArrayList;

public class main {




    public static void main(String[] args) {
        SLL<Integer> sll= new SLL<>();
        sll.addLast(1);
        sll.addLast(2);
        sll.addLast(3);
        sll.addLast(4);
        sll.addLast(5);
        sll.reverse();
        System.out.println(sll);


    }
}
