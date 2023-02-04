public class NoPunctuation {
    public static void main(String[] args) {
        String sentence="Let's try, Mike!";
        StringBuilder sb = new StringBuilder();
        String punctuation = ",.;:?!-(){}[]`\"\'";
        for (int i = 0; i < sentence.length(); i++) {
            //System.out.println(sentence.substring(i,i+1));
            if (!punctuation.contains(sentence.substring(i,i+1))) {
                sb.append(sentence.substring(i,i+1));
            }
        }
        String str = sb.toString();
        System.out.println(str);


    }
}
