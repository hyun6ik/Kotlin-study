package Lec04;

public class Main {

    public static void main(String[] args) {
        final JavaMoney money1 = new JavaMoney(2_000L);
        final JavaMoney money2 = money1;
        final JavaMoney money3 = new JavaMoney(1_000L);

        if (money1.compareTo(money2) > 0) {
            System.out.println("Money1이 Money2보다 금액이 큽니다");
        }

        System.out.println(money1 == money2);
        System.out.println(money1.equals(money3));

        final JavaMoney plusMoney = money1.plus(money2);
        System.out.println(plusMoney);
    }
}
