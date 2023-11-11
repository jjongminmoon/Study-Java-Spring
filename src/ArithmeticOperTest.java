public class ArithmeticOperTest {
    public static void main(String[] args) {
        // Q. 나누기와 나머지 연산자의 활용 (정수의 자릿수 구하기)
        int digit=3625;
        System.out.println(digit%10);
        System.out.println(digit/10%10);
        System.out.println(digit/100%10);
        System.out.println(digit/1000%10);

        // 각 자릿수의 합, 짝수인지 홀수인지, 배수 등

        int su=5;
        if(su%2==0) {
            System.out.println("짝수입니다");
        } else {
            System.out.println("홀수입니다");
        }
    }
}
