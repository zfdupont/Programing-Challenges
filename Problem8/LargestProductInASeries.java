package Problem8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class LargestProductInASeries {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("C:\\Users\\Zyckr\\Documents\\Programming Challenges 1.4\\src\\Problem8\\LargeNumber.txt"));
        String num = "";
        while (in.hasNext()){
            num += in.next();
        }

        int start = 0;
        int end = start+13;
        long max = Integer.MIN_VALUE;
        for (int i = 0; i <= num.length()-13; i++) {
            long sum = 1;
            for (int j = start; j < end; j++) {
                sum = sum * (num.charAt(j)-'0');
            }
            max = Math.max(max, sum);
            start++;
            end++;

        }
        System.out.println(max);
    }
}
