// Задание №1. Мили и бонусы
public class Main {
    public static void main(String[] args) {
        System.out.println("Вы получили бонусы:");

        int ticketPrice = 1750; //цена билета
        int bonusRubles = 20; // рублей для получения 1 бонусной мили
        int solution = Math.round(ticketPrice / 20);

        if (ticketPrice > 20) {
            System.out.println(solution);
        } else if (ticketPrice == 20) {
            System.out.println(solution);
        } else {
            System.out.println("0");
        }


    }
}
