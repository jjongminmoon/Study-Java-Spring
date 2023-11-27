public class CallByReference {
    public static void main(String[] args) {
        float a=56.7f;
        float b=78.9f;

        floatAdd(a,b);
        System.out.println("종료");
    }

    // Q. 매개변수로 2개의 실수를 받아서, 총합을 구해 출력하시오.
    public static void floatAdd(float a, float b) {
        float hap=a+b;
        System.out.println("hap = " + hap);
    }
}
