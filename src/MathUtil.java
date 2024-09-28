public class MathUtil {

    // Static methods

    /**
     * Checks if a number is prime.
     * @param n the number to check
     * @return true if the number is prime, false if it's not
     */
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;  // Not prime
        }
        return true;  // Prime
    }

    /**
     * Finds the greatest common divisor (GCD) of two numbers.
     * @param a the first number
     * @param b the second number
     * @return the GCD of a and b
     */
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;  // Update b
            a = temp;
        }
        return a;  // GCD
    }

    /**
     * Finds the least common multiple (LCM) of two numbers.
     * @param a the first number
     * @param b the second number
     * @return the LCM of a and b
     */
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);  // LCM using GCD
    }

    /**
     * Returns the nth Fibonacci number.
     * @param n the index in the Fibonacci sequence
     * @return the nth Fibonacci number
     */
    public static int fibonacci(int n) {
        if (n <= 1) return n;  // Base cases
        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;  // Next Fibonacci number
            a = b;
            b = c;
        }
        return b;  // nth Fibonacci number
    }

    /**
     * Finds the factorial of a number.
     * @param n the number to find the factorial of
     * @return the factorial of n
     */
    public static int factorial(int n) {
        if (n == 0) return 1;  // Factorial of 0 is 1
        return n * factorial(n - 1);  // Recursive factorial
    }

    // Non-static methods

    /**
     * Checks if a number is a perfect number.
     * @param n the number to check
     * @return true if n is a perfect number, false if it's not
     */
    public boolean isPerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) sum += i;  // Add divisors
        }
        return sum == n;  // Check if perfect
    }

    /**
     * Finds the sum of the digits of a number.
     * @param n the number to find the sum of its digits
     * @return the sum of the digits
     */
    public int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;  // Add last digit
            n /= 10;  // Remove last digit
        }
        return sum;  // Total sum of digits
    }

    /**
     * Reverses the digits of a number.
     * @param n the number to reverse
     * @return the reversed number
     */
    public int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            reversed = reversed * 10 + n % 10;  // Build reversed number
            n /= 10;  // Remove last digit
        }
        return reversed;  // Reversed number
    }

    /**
     * Checks if a number is an Armstrong number.
     * @param n the number to check
     * @return true if n is an Armstrong number, false if it's not
     */
    public boolean isArmstrongNumber(int n) {
        int sum = 0, original = n, digits = Integer.toString(n).length();
        while (n != 0) {
            sum += Math.pow(n % 10, digits);  // Calculate power of each digit
            n /= 10;  // Remove last digit
        }
        return sum == original;  // Check if Armstrong
    }

    /**
     * Finds the next prime number greater than n.
     * @param n the number to find the next prime after
     * @return the next prime number after n
     */
    public int nextPrime(int n) {
        n++;  // Start from the next number
        while (!isPrime(n)) {
            n++;  // Find next prime
        }
        return n;  // Next prime
    }
}
