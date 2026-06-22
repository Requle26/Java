package day01;

//Practice05.java
//문제 5 - 내 프로필 만들기

//아래 정보를 모두 변수에 저장한 후 출력하세요.

public class practice5 {
    public static void main(String[] args) {
        String name = "김성일";
        int age = 24;
        double height = 175.5;
        String major = "컴퓨터공학";
        String language = "Java";
        boolean studying = true;
        char score = 'A';
        System.out.println("========================");
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("키 : " + height);
        System.out.println("전공 : " + major);
        System.out.println("좋아하는 언어 : " + language);
        System.out.println("백엔드 공부중 : " + studying);
        System.out.println("학점 : " + score);
        System.out.println("========================");
    }
}
