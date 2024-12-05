// 012
public class PrimeChecker {
    public static boolean isPrime(int number) {
        // Check if the number is prime or not;
        
        if (number <= 1) {
            return false; // If the number is less than or equal to 1, it's not prime
        }
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If the number is divisible by i, it's not prime
            }
        }
        
        return true; // If the number is not divisible by any number up to its square root, it's prime
    }
    
    public static void main(String[] args) {
        int number = 17; // Change the number to check for primality
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
