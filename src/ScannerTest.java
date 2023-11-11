import java.util.*;

public class ScannerTest {
    public static void main(String[] args) {
        java.util.Scanner scan=new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int num=scan.nextInt(); // 블럭 상태로 멈춤
        System.out.println("num = " + num);

        System.out.print("실수를 입력하세요: ");
        float f=scan.nextFloat();  // 블럭 상태로 멈춤
        System.out.println("f = " + f);

        System.out.print("문자를 입력하세요: ");
        String str=scan.next();  // 블럭 상태로 멈춤
        System.out.println("str = " + str);

        scan.nextLine(); // 버퍼 비우기(스트림 비우기)

        System.out.print("문자를 입력하세요: ");
        String str2=scan.nextLine();  // 블럭 상태로 멈춤
        System.out.println("str2 = " + str2);

        scan.close();
    }
}
