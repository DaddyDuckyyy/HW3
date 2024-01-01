public class Bottles {
    public static void main(String[] args) {
        int bottlePerMin = 16/2;
        int bottlePer20Min = bottlePerMin*20;
        int bottlePerHour = bottlePerMin*60;
        int bottlePerDay = bottlePerHour*24;
        int bottlePer3Days = bottlePerDay*3;
        int bottlePerMonth = bottlePerDay*30;
        System.out.println("Кол-во бутылок, потзведённых за 20 минут: " + bottlePer20Min);
        System.out.println("Кол-во бутылок, потзведённых за сутки: " + bottlePerDay);
        System.out.println("Кол-во бутылок, потзведённых за 3 дня: " + bottlePer3Days);
        System.out.println("Кол-во бутылок, потзведённых за месяц: " + bottlePerMonth );
    }
}
