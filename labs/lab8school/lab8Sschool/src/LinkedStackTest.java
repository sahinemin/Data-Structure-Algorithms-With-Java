public class LinkedStackTest {
    public static void transfer(LinkedStack<Integer> stack1, LinkedStack<Integer> stack2){
        while (!stack1.isEmpty()){
            Integer temp = stack1.pop();
            stack2.push(temp);
        }
    }
    public static void main(String[] args) {
        LinkedStack<Integer> stackOld = new LinkedStack<>();
        LinkedStack<Integer> stackNew = new LinkedStack<>();
        stackOld.push(1);
        stackOld.push(2);
        stackOld.push(3);
        stackOld.push(4);
        System.out.println(stackOld);
        transfer(stackOld,stackNew);
        System.out.println(stackNew);
    }

}