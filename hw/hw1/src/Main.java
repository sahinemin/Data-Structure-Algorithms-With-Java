public class Main {
    public static void main(String[] args) {

        MathClass mathClass = new MathClass();
        System.out.println(mathClass.isEven(6));
        System.out.println(mathClass.calculateNorm(2, new int[]{4, 3}));
        System.out.println(mathClass.isDistinct(new float[]{3,25,4,32,3,25,7,8,10,12}));
    }

}