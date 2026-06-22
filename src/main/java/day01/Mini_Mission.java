package day01;

public class Mini_Mission {
    public static void main(String[] args) {
        String menu = "아이스 아메리카노";
        int quantity = 2;
        int cost = 4500;
        int amount = 9000;
        boolean packaging = true;

        System.out.println("======== 주문 내역 ========");
        System.out.println("메뉴 : " + menu);
        System.out.println("수량 : " + quantity);
        System.out.println("가격 : " + cost);
        System.out.println("총 금액 : " + amount);
        System.out.println("포장 여부 : " + packaging);
        System.out.println("=========================");
    }
}
