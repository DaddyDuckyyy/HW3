public class BodyWeight {
    public static void main(String[] args) {
        int weight = 7*1000;
        int days250Gr = weight/250;
        int days500Gr = weight/500;
        int averageDays = (days250Gr+days500Gr)/2;
        System.out.println(days250Gr+" дней уйдет на похудение, " +
                "если спортсмен будет терять каждый день по 250 грамм, и " +
                days500Gr +", если каждый день будет худеть на 500 грамм");
        System.out.println(averageDays + " - среднее кол-во дней для достижения результата");
    }
}
