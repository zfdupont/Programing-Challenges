package Problem10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class SummationOfPrimes {
//    public static ArrayList<Integer> sundaram(int n){
//        ArrayList<Integer> primes = new ArrayList<>();
//        boolean[] sieve = new boolean[n+1];
//        Arrays.fill(sieve, true);
//        for (int i = 1; i <= n; i++) {
//            for (int j = i; i+j+2*i*j <= n; j++) {
//                sieve[i+j+2*i*j] = false;
//            }
//        }
//        if(n > 2){
//            primes.add(2);
//        }
//        for (int i = 1; i <= n; i++) {
//            if(sieve[i]){
//                primes.add(2*i+1);
//            }
//        }
//        return primes;
//    }
    public static HashSet<Long> primes = new HashSet<>();
    public static boolean isPrime(long n){
        if(n < 2){
            return false;
        }
        else if(primes.contains(n)){
            return true;
        } else {
            for (Long i : primes) {
                if(n % i == 0){
                    return false;
                }
            }
            primes.add(n);
            return isPrime(n);
        }
    }

    public static void main(String[] args) {
        long sum = 2;
        for (int i = 3; i < 2e6; i+=2) {
            sum += isPrime(i)? i : 0;
            System.out.println(i);
        }
        System.out.println(sum);
    }
}
