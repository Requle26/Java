package day03;

public class MiniMission {
    public static void main(String[] args) {
        int score = 83;

        if (score > 100 || score < 0) {
            System.out.println("잘못된 점수입니다.");
            return;
        }

        System.out.println("점수 : " + score);

        if (score >= 90) {
            System.out.println("학점 : A");
        } else if (score >= 80) {
            System.out.println("학점 : B");
        } else if (score >= 70) {
            System.out.println("학점 : C");
        } else if (score >= 60) {
            System.out.println("학점 : D");
        } else {
            System.out.println("학점 : F");
        }

        String result = score >= 60 ? "합격" : "불합격";
        System.out.println("합격 여부 : " + result);
    }
}
