package Problem9;

public class SpecialPythagoreanTriplet {
    public static void main(String[] args) {
        int s = 1000; //perimeter
        for (int a = 3; a <= (s-3)/3; a++) { // a >= 3,  a < b < c --> a <= (s-3)/3
            for (int b = a+1; b < (s-a)/2; b++) { // b < (s-a)/2
                int c = s-a-b;
                    if(c*c == a*a + b*b){
                        System.out.print(a*b*c);
                        System.exit(0);
                    }
            }
        }
    }
}
