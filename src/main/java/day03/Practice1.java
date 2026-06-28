package day03;

public class Practice1 {
    public static void main(String[] args) {
        int month = 3;
        String result = switch (month) {
            case 1 -> "1월";
            case 2 -> "2월";
            case 3 -> "3월";
            default -> "없는 달";
        };
    }
}
