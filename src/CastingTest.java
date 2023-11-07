public class CastingTest {
    public static void main(String[] args) {
        float f1=.10f;
        System.out.println("f1 = " + f1);   // 0.10
        float f2=15f;
        System.out.println("f2 = " + f2);   // 15.0
        float f3=3.14f;
        System.out.println("f3 = " + f3);   // 3.14
        double d1=123.4567;
        System.out.println("d1 = " + d1);   // 123.4567

        float x=15.6f;
        int y=(int)x;   // 강제형변환(손실)
        System.out.println("y = " + y); // 15

        char c='A';
        int cc=c;   // 자동형변환
        System.out.println("cc = " + cc);

        int d=5;
        double dd=d;    // 자동형변환
        System.out.println("dd = " + dd);

        double dx=14.67;
        int dy=(int)dx;
        System.out.println("dy = " + dy);   // 14
    }
}
