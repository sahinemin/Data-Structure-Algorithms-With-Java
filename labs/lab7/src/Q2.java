public class Q2 {
    public static void main(String[] args) {
        System.out.println(reverse("pots&pans"));
    }
    static String reversedString="";
    public static String reverse(String s){
        if(s.length()>0){
            reversedString+=s.charAt(s.length()-1);
            s=s.substring(0,s.length()-1);
            return reverse(s);
        }
        else
            return reversedString;
    }
}
