public class IfelseIfTest {
    public static void main(String[] args) {
        // Q. 90점 이상은 A반, 85점 이상은 B반, 80점 이상은 C반, 그렇지 않으면 불합격을 출력하시오.
        // 단, 점수는 0~100 사이값으로 입력받는다.
        int score=89;
        if(score>=0 && score<=100) {
            if(score>=90) {
                System.out.println("A반");
            } else if(score>=85) {
                System.out.println("B반");
            } else if(score>=80) {
                System.out.println("C반");
            } else {
                System.out.println("불합격");
            }
        } else {
            System.out.println("유효한 점수가 아닙니다.");
        }
        
    }
}
