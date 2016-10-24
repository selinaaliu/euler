public class Problem06 {
    
    public static void main(String[] args) {
        test1();
    }

    public static long diff(int n) {
        long sum = ((1+n)*n/2); 
        long squareOfSum = sum * sum;
        long sumOfSquares = (n*(n+1)*(2*n+1))/6;
        long diff = squareOfSum - sumOfSquares;
        return diff;
    }

    private static void test1() {
        assert diff(100) == 25164150;
    }

}
