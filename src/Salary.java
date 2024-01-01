public class Salary {
    public static void main(String[] args) {
        int mashaMonthlySalary = 67760;
        int denisMonthlySalary = 83690;
        int christineMonthlySalary = 76230;

        int mashaAnnualSalary = mashaMonthlySalary*12;
        int denisAnnualSalary = denisMonthlySalary*12;
        int christineAnnualSalary = christineMonthlySalary*12;

        System.out.println("Маша теперь получает " + mashaMonthlySalary*1.1f + " рублей. Годовой доход вырос на " + (mashaAnnualSalary*0.1f) +" рублей");
        System.out.println("Денис теперь получает " + denisMonthlySalary*1.1f + " рублей. Годовой доход вырос на " + (denisAnnualSalary*0.1f)+" рублей");
        System.out.println("Кристина теперь получает " + christineMonthlySalary*1.1f + " рублей. Годовой доход вырос на " + (christineAnnualSalary*0.1f)+" рублей");
    }
}
