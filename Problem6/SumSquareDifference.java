package Problem6;

public class SumSquareDifference {

    public static int sumOfSquares(int r){
        int sum = 0;
        for (int i = 0; i <= r; i++) {
            sum += i*i;
        }
        return sum;
    }
    public static int squareOfSum(int r){
        int sum = 0;
        for (int i = 0; i <= r; i++) {
            sum += i;
        }
        return sum*sum;
    }

    public static void main(String[] args) {
        System.out.println(squareOfSum(100)-sumOfSquares(100));
    }
}
