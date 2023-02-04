public class ReverseStackTest {
    public static void main(String[] args) {
        Stack<Integer> s = new ArrayStack<>();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        LinkedQueue<Integer> q = new LinkedQueue<>();
        while (!s.isEmpty()){
            q.enqueue(s.pop());
        }
        System.out.println(q.toString());

        Stack<Integer> reverse = new ArrayStack<>();
        while (!q.isEmpty())
            reverse.push(q.dequeue());

        System.out.println(reverse.toString());
    }
}
