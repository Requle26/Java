package day02;

public class Practice1 {
    public static void introduce(String name, int age) {
        System.out.println("안녕하세요. 저는 " + name + "이고 " + age + "살입니다.");
    }

    public static void main(String[] args) {
        introduce("김성일", 24);
        introduce("홍길동", 30);
    }
}
