import java.util.Scanner;

public class pascalTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i= sc.nextInt();
        int j= sc.nextInt();
        int ans=1;
        i--;
        for (int k=1; k <=j ; k++){ /// correction needed
            ans = ans * (i/k);
            i--;
            System.out.println(ans);
        }

    }

}
