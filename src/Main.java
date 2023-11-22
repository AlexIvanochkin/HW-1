// Задание №1. Мили и бонусы
public class Main {
    public static void main(String[] args) {
        System.out.println("Вы получили бонусы:");

        int ticket_price = 1700; //цена билета
        int bonus_rubles = 20; // рублей для получения 1 бонусной мили
        int solution = Math.round(ticket_price / 20);

        if (ticket_price > 20) {
            System.out.println(solution);
        } else if (ticket_price == 20) {
            System.out.println(solution);
        } else {
            System.out.println("0");
        }


    }
}
