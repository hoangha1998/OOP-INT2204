package task1;

public class Week3Task1 {
    // compute greatest common divisor of $a and $b
    public int gcd(int a, int b) {
        if(b == 0) return a;
        if(a == 0) return b;
        if(b > a) return gcd(a, b%a);
        return gcd(b, a%b);
    }

    // compute the fibonacci of $n
    public int fibonacci(int n) {
        if (n < 0) {
            System.out.println("done");
        }

        if (n <=1) {
            return n;
        } else {
            return fibonacci(n -1) + fibonacci(n-2);
        }
    }

    /**
     * print all prime numbers from 0 to $n use Sieve of Eratosthenes algorithm
     * useful link https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
     * notice that print each number in a line
     * @param n
     */
    public void sieveEratosthenes(int n) {
        boolean ise = true;
        if (n <=2 && n > 0){ System.out.println("1 2");}
        else {
            for (int i = 2; i < n/2; i ++) {
                if ( n%i == 0) {
                    ise =  false;
                }
            }
            if (ise) {
                System.out.println(n);
            }

            sieveEratosthenes(n -1);
        };
    }

}
