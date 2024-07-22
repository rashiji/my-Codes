import java.util.Scanner;

public class Grade {
    public static void showGrade(int marks){
        if(marks>=91){
            System.out.println("Grade AA");
        }else if(marks>81&&marks<=90){
            System.out.println("Grade AB");
        }else if(marks>71&&marks<=80){
            System.out.println("Grade BB");
        }else if(marks>61&&marks<=70){
            System.out.println("Grade BC");
        }else if(marks>51&&marks<=60){
            System.out.println("Grade CD");
        }else if(marks>41&&marks<=50){
            System.out.println("Grade DD");
        }else{
            System.out.println("fail");
        }
    }
    public static void main(String[] args) {
        System.out.println("enter the marks");
        Scanner sc=new Scanner(System.in);
        int marks= sc.nextByte();
        showGrade(marks);

    }
}