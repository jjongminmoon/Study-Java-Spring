public class BinaryExam {
    public static void main(String[] args) {
        // Q. 123을 10진수, 2진수, 8진수, 16진수로 출력하시오.
        int data=123;

        String binary=Integer.toBinaryString(data);
        System.out.println("binary = " + binary);

        String octal=Integer.toOctalString(data);
        System.out.println("octal = " + octal);

        String hext=Integer.toHexString(data);
        System.out.println("hext = " + hext);
        
        int x=123;
        System.out.println("x = " + x);
        int y=0b1111011;
        System.out.println("y = " + y);
        int z=0173;
        System.out.println("z = " + z);
        int r=0x7b;
        System.out.println("r = " + r);
    }
}
