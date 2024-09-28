public class Main {
    public static void main(String[] args) {
        // Testing the static methods of MathUtil class

        // Test case for isPrime method
        System.out.println("isPrime(7): " + MathUtil.isPrime(7)); // Expected: true

        // Test case for gcd method
        System.out.println("gcd(36, 60): " + MathUtil.gcd(36, 60)); // Expected: 12

        // Test case for lcm method
        System.out.println("lcm(15, 20): " + MathUtil.lcm(15, 20)); // Expected: 60

        // Test case for fibonacci method
        System.out.println("fibonacci(10): " + MathUtil.fibonacci(10)); // Expected: 55

        // Test case for factorial method
        System.out.println("factorial(5): " + MathUtil.factorial(5)); // Expected: 120

        // Create an object to test non-static methods
        MathUtil mathUtil = new MathUtil();

        // Test case for isPerfectNumber method
        System.out.println("isPerfectNumber(28): " + mathUtil.isPerfectNumber(28)); // Expected: true

        // Test case for sumOfDigits method
        System.out.println("sumOfDigits(123): " + mathUtil.sumOfDigits(123)); // Expected: 6

        // Test case for reverseNumber method
        System.out.println("reverseNumber(12345): " + mathUtil.reverseNumber(12345)); // Expected: 54321

        // Test case for isArmstrongNumber method
        System.out.println("isArmstrongNumber(153): " + mathUtil.isArmstrongNumber(153)); // Expected: true

        // Test case for nextPrime method
        System.out.println("nextPrime(11): " + mathUtil.nextPrime(11)); // Expected: 13
    }
}
