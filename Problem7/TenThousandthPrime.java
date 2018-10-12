package Problem7;

import java.util.HashSet;

public class TenThousandthPrime {
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
        int index = 0;
        int n = 0;
        while(index != 10001){
            if(isPrime(n)) {
                index++;
                System.out.println(n);
            }
            n++;
        };
    }
}
