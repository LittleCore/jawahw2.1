public class Main {
    public static void main(String[] args) {
        int startBalance = 200;
        int deposit = 2360;
        int finalBalance = startBalance + deposit;
        int bonusBalance = 0;

        if (deposit > 1000) {
            bonusBalance = bonusBalance + deposit / 100;
            System.out.println("Сумма Ваших бонусов равна = " + bonusBalance +
                    "\nВаш итоговый счёт равен = " + finalBalance);
        } else {
            bonusBalance = bonusBalance;
            System.out.println("Сумма Ваших бонусов равна = " + bonusBalance +
                    "\nВаш итоговый счёт равен = " + finalBalance);
        }
    }
}
