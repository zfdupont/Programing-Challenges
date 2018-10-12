package Problem5;

public class SmallestMultiple {
    public static long gcd(long a, long b){
        if(b == 0){
            return a;
        } else{
            return gcd(b, a % b);
        }
    }

    public static long lcm(long a, long b){
        return (a*b)/gcd(a,b);
    }
    public static long lcm(long[] a){
        long L = lcm(a[0], a[1]);
        for (int i = 2; i < a.length-1; i++) {
            L = lcm(L, a[i]);
        }
        return L;
    }

    public static void main(String[] args) {
        long[] multiples = new long[20];
        for (int i = 0; i < 20; i++) {
            multiples[i] = i+1;
        }
        System.out.println(lcm(multiples));
    }
}
