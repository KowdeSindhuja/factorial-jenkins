public class factorial {
    public static int findFactorial(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        try {
            int num = 5; // You can change the input
            int result = findFactorial(num);
            System.out.println("Factorial of " + num + " is: " + result);
        } catch(Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
