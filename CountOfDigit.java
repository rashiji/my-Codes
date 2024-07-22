public class CountOfDigit {
    public static void main(String [] args) {
        int n= 25;
        int tem= n;
        int sq= n*n;
        int c=0;
        while (n!=0)
        {
            c++;
            n=n/10;
        }
        long lastdigit = sq %(long)Math.pow(10,c);
        System.out.println(lastdigit==tem?"auto" : " not auto");
    }
}
