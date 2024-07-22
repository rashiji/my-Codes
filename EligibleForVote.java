import java.util.Scanner;

public class EligibleForVote {
    public static void vote(int age){
        if (age>=18){
            System.out.println("you are eligible for vote");
        }else{
            System.out.println("you are not eligible for vote");
        }
    }

    public static void main(String[] args) {
        System.out.println("enter the age of person");
        Scanner sc =new Scanner(System.in);
        int age=sc.nextByte();
        vote(age);


    }
}