import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        int x=10;
        if(x>=0) {
            System.out.println("0 또는 양수입니다.");
        } else {
            System.out.println("음수입니다.");
        }

        // Q. 정수 1개를 입력 받아 짝수/홀수를 판단해 출력하시오.
        Scanner scan=new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num=scan.nextInt();
        if(num%2==0) {
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }

        // Q. 정수 1개를 입력 받아 12의 배수인지를 출력하시오.
        System.out.print("정수를 입력하세요: ");
        int num2=scan.nextInt();
        if(num2%12==0) {
            System.out.println("12의 배수입니다.");
        } else {
            System.out.println("12의 배수가 아닙니다.");
        }

        // Q. 연도를 입력받아 윤년인지 아닌지 판단하여 출력하시오.
        System.out.print("연도를 입력하세요: ");
        int year=scan.nextInt();
        if((year%4==0 && year%100!=0) || (year%400==0)) {
            System.out.println("윤년입니다.");
        } else {
            System.out.println("윤년이 아닙니다.");
        }
    }
}
