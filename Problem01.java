public class Problem01 {
    
    public static void main(String[] args) {
        test1();
    }

    public static int multiples(int n) {
        int mult3 = (n % 3 == 0) ? (n/3)-1 : n/3;
        int mult5 = (n % 5 == 0) ? (n/5)-1 : n/5;
        int mult15 = (n % 15 == 0) ? (n/15)-1 : n/15;
        int sum3 = (1+mult3) * mult3 / 2;
        int sum5 = (1+mult5) * mult5 / 2;
        int sum15 = (1+mult15) * mult15 / 2;
        int out = sum3 * 3 + sum5 * 5 - sum15 * 15;
        return out;
    }

    private static void test1() {
        assert multiples(1000) == 233168;
    }

}
