public class Q1 {
    public static void main(String[] args) {
        System.out.println(multiplication(4,6));
    }

    public static int multiplication (int m,int n){
        if(n>0){
            n--;
            return (m+multiplication(m,n));
        }

        else
            return 0;

    }
}
