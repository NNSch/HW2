public class Main {
    public static void main(String[] args) {

        int  ticket = 9000; // цена за билет
        int bonus = 20; // бонусные рубли равные одной мили
        int miles = ticket / bonus; // бонусные мили за билет

        System.out.println(miles);
    }
}