public class Main {
    public static void main(String[] args) {

        int rub = 20; // каждые 20 рублей потраченные за билет
        int ticket2 = 600; // стоимость билета
        int bonus = ticket2/rub;

        System.out.println("Начисленные мили:" + bonus);
    }
}