package Problem4;

public class LargestPalindromeProduct {
    public static boolean isPalin(int n){
        String str = String.valueOf(n);
        for (int i = 0, j = str.length()-1; i < j; i++, j--) {
            if(str.charAt(i) != str.charAt(j))
                return false;
        }
        return true;
    }
    public static String[] factors(int n){
        String str = "";
        for (int i = 1; i < n/2+1; i++) {
            if(n%i==0){
                str+= i + " ";
                str+= n/i + " ";
            }
        }
        return str.split(" ");
    }

    public static void main(String[] args) {
        for (int i = 999*999; i > 100*100; i--) {
            System.out.println(i);
            if(isPalin(i)) {
                String[] f = factors(i);
                for (int j = 0; j < f.length-2; j+=2) {
                    if(f[j].length() == 3 && f[j+1].length() == 3)
                        System.exit(0);
                }
            }
        }
    }
}