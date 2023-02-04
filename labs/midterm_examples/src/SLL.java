public class SLL <T> {
    private int size= 0;
    private static class Node<T>{
        private T data;
        private Node<T> next;

        private Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
        public T getElement(){
            return data;
        }
        public Node<T> getNext() { return next; }

        public void setNext(Node<T> n) { next = n; }
    }

    public Node<T> getHead() {
        return head;
    }
     Node reverse() {
        if(head == null) {
            return head;
        }

        // last node or only one node
        if(head.next == null) {
            return head;
        }

        Node newHeadNode = reverse();

        // change references for middle chain
        head.next.next = head;
        head.next = null;

        // send back new head node in every recursion
        return newHeadNode;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    private Node<T> head =null;
    public void addLast(T data){
        Node<T> tempNode= new Node<>(data,null);
        if (isEmpty()){
            head=tempNode;
        }
        else {
            Node<T> temp= head;
            while (temp.getNext()!=null){
                temp=temp.getNext();
            }
            temp.setNext(tempNode);
        }
        size++;

    }

    public void addFirst(T data){
        Node<T> tempNode;
        if (isEmpty()){
            tempNode= new Node<>(data,null);
        }
        else {
            tempNode= new Node<>(data,head);
        }
        head=tempNode;
        size++;

    }
    public void removeFirst(){
        head=head.getNext();
        size--;
    }
    public void removeLast(){
        Node<T> tempNode= head;
        while (tempNode.getNext().getNext()!=null){
            tempNode=tempNode.getNext();
        }
        tempNode.setNext(null);
        size--;
    }
    public Node<T> reverseRecursively(Node<T> head){
        if (head == null || head.next == null)
            return head;

        /* reverse the rest list and put
        the first element at the end */
        Node<T> rest = reverseRecursively(head);
        head.next.next = head;

        /* tricky step -- see the diagram */
        head.next = null;

        /* fix the head pointer */
        return rest;

    }



    public boolean isEmpty(){
        if (size ==0)
            return true;
        return false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder= new StringBuilder();
        Node temp = head;
        stringBuilder.append(temp.getElement());
        while (temp.getNext()!=null){
            temp=temp.getNext();
            stringBuilder.append(temp.getElement());
        }
        return stringBuilder.toString();
    }
}
