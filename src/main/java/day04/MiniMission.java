package day04;

public class MiniMission {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        int total = 0;
        for (int i = 1; i <= 100; i++) {
            total += i;
        }
        System.out.println(total);


        int five = 0;
        int three = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                five += 1;
            }
            if (i % 3 == 0) {
                three += 1;
            }
        }
        System.out.println("3의 배수 개수 : " + three);
        System.out.println("5의 배수 개수 : " + five);
    }
}
