public class ArrayBasicTest {
    public static void main(String[] args) {
        // Q. 정수 3개를 저장 할 변수를 선언하고 모두 10을 저장하시오.
        int a=10;
        int b=10;
        int c=10;
        
        int sum=a+b+c;
        System.out.println("sum = " + sum);

        // 문제점 : 데이터의 개수가 늘어나면 선언이 불편하고, 데이터 처리가 복잡해지며, 데이터 이동 또한 불편해짐 => 비효율적
    }
}
