public class Even_Odd {
    public static void main(String[] args) {
        int n =64;
        System.out.println(isOdd(n));
    }
    public static boolean isOdd(int n){
        return (n&1)==1;
    }
}
