package Problem2;

import java.util.ArrayList;
import java.util.List;

public class EvenFibonacciSum {
    static List<Integer> fibonacci = new ArrayList<>();

    public static int fib(int n){
        if(n < fibonacci.size()){
            return fibonacci.get(n);
        } else {
            int f = fibonacci.get(n-1)+fibonacci.get(n-2);
            fibonacci.add(n, f);
            return fib(n);
        }
    }

    public static void main(String[] args) {
        fibonacci.add(1);
        fibonacci.add(2);
        int sum = 0;
        int i = 0;
        int f = 0;
        while (f < 4000000) {
            f = fib(i);
            if(f % 2 == 0)
                sum+=f;
                System.out.print(f + " ");
            i++;
        }
        System.out.println(sum);
    }
}
