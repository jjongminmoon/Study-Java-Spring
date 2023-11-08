public class ArrayMakeTest {
    public static void main(String[] args) {
        // Q. 정수 5개를 저장할 배열을 생성하고 모든 원소에 10을 저장하시오.
        int[] a=new int[5];

        // 반복문 (for, while)
        for(int i=0; i<a.length; i++) {
            a[i]=10;
            System.out.println(a[i]);
        }

        // Q. 실수 5개를 저장할 배열을 생성하시오.
        float[] f=new float[5];

        // Q. 책 3권을 저장할 배열을 생성하시오.
        Book[] b=new Book[3];
    }
}
