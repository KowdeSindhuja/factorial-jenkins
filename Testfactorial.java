public class Testfactorial {
    public static void main(String[] args) {
        try {
            int result = factorial.findFactorial(5);
            if(result == 120) {
                System.out.println("Test passed ");
            } else {
                System.out.println("Test failed ");
            }
        } catch(Exception e) {
            System.out.println("Test error: " + e.getMessage());
        }
    }
}
