public class ArrayExam {
    public static void main(String[] args) {
        // Q. char[] 배열에 APPLE이라는 문자를 apple로 출력하시오.
        char[] c={'A','P','P','L','E'};

        for(int i=0; i<c.length; i++) {
            System.out.print((char)(c[i]+32));
        }
    }
}
