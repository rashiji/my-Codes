public class PatternTripudown {
    public static void main(String [] args) {
        int n = 5;
        // upper part
        for (int i=0; i<=n ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
            // lower part
            for (int i = n; i <= 0; i--) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

