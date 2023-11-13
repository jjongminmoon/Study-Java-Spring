public class LoopLoopTest {
    public static void main(String[] args) {
        int count=1;
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                System.out.println(count);
                count++;
            }
        }

        int[][] a={
                {1,2,3,4,5},
                {1,2,3,4,5}
        };
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a[i].length; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }

        // Q. 이중 반복문을 이용하여 구구단을 출력하시오.
        for (int i=2; i<=9; i++) {
            System.out.print(i+"단"+"\t\t");
        }
        System.out.println();
        for (int i=1; i<=9; i++) {
            for (int j=2; j<=9; j++) {
                System.out.print(j + "X" + i + "=" + (j * i) + "\t");
            }
            System.out.println();
        }
    }
}
