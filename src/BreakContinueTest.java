public class BreakContinueTest {
    public static void main(String[] args) {
        // Q. char[] c={'s','h','u','t','d','o','w','n'} 에서 배열의 값을 출력 중 'o'를 만나면 반복을 중지
        char[] c={'s','h','u','t','d','o','w','n'};
        for (int i=0; i<c.length; i++) {
            if (c[i]=='o') break;
            System.out.print(c[i]);
        }

        System.out.println();

        // Q. 1~10까지의 수 중 3의 배수의 개수를 구하여 출력하시오.
        int count=0;
        for (int i=1; i<=10; i++) {
            if (i%3!=0) continue;
            count++;
        }
        System.out.println(count);
    }
}
