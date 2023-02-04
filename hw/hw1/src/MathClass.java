public class MathClass {
    boolean isEven (int i){
         while (i>1){
             i-=2;
         }
        return i != 1;
    }
    double calculateNorm(int p, int[] v){
        double total=0;
        for (int j : v) {
            total += Math.pow(j, p);
        }
        double pow= (double) 1/p;
        return Math.pow(total,pow);
    }
    boolean isDistinct(float [] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]==array[j])
                    return false;
            }
        }
        return true;
    }
}
