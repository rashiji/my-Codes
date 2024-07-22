import java.util.Scanner;

public class Automorphic {
    public static void main(String [] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        int sq= n*n;
        boolean auto = true;
        while (n>0)
        {
         if (n%10!=sq%10){
             auto=false;
             break;
         }
         n=n/10;
         sq=sq/10;
        }
        System.out.println(auto ? "automorphic" : " non automorphic");


    }
}
