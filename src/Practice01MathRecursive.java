/**
 * This program does math recursively only.
 */

public class Practice01MathRecursive implements Practice01Math {
    public int fact(int n) throws Exception {
        // if n is negative throw exception
        if (n < 0) {
            throw new Exception();
        }

        if (n <= 1 || n == 0)
            return 1;
        // for all else
        else
            return (n * fact(n - 1));
    }

    public int fib(int n) throws Exception {
        // if n is negative throw exception
        if (n < 0) {
            throw new Exception();
        }

        if (n <= 1)
            return n;
        // for all else
        return fib(n - 1) + fib(n - 2);
    }

}