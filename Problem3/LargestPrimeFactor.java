package Problem3;

import java.util.ArrayList;
import java.util.HashSet;

public class LargestPrimeFactor {
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
        long k = 600851475143L;
        for (long p = 0; p < k/2; p++) {
            if(isPrime(p)){
                while(k % p == 0){
                    k/=p;
                }
            }
        }
        System.out.println(k);
    }
}
