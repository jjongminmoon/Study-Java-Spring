public class CharTest {
    public static void main(String[] args) {
        char c='A';
        System.out.println("c = " + c);

        int a='A';
        System.out.println("a = " + a);
        
        int b='B'+1;
        System.out.println("b = " + (char)b); // 67 => C

        // Q. "가"라는 한글 한 문자를 변수에 저장하고 출력하시오.
        char han='가';
        System.out.println("han = " + han);
        int hanD='가';
        System.out.println("hanD = " + hanD);
        int hanU='\uAC00';
        System.out.println("hanU = " + (char)hanU); // 44032 => 가

        // Q. 대문자 'A'를 문자 'a'로 변화하여 출력하시오. (ASCII코드 참고)
        char upper='A';
        char lower=(char)(upper+32);
        System.out.println("lower = " + lower); // 'a'

        char lower2='u';
        int upper2=lower2-32;
        System.out.println("upper2 = " + upper2);   // 85 => U

        // Q. '1'+'2'=3이 나오도록 프로그래밍 하시오.
        char i='1';
        char j='2';
        int sum=(i-48)+(j-48);
        System.out.println("sum = " + sum); // 3
    }
}
