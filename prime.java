public class OneToHundredPrimeNumbers {

    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100 are:");
        
        // Iterate through numbers from 2 to 100
        for (int num = 2; num <= 100; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 0 and 1 are not prime numbers
        }

        // Check for factors from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Not a prime number
            }
        }

        return true; // Number is prime
    }
}
