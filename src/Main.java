// Задание №1. Мили и бонусы
public class Main {
    public static void main(String[] args) {
        System.out.println("Вы получили бонусы:");

        int x = 15; //цена билета
        int z = 20; // рублей для получения 1 бонусной мили
        int y = Math.round(x / 20);

        if (x > 20) {
            System.out.println(y);
        } else if (x == 20) {
            System.out.println(y);
        } else {
            System.out.println("0");
        }


    }
}
