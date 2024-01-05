public class Breakfast {
    public static void main(String[] args) {
        int bananas = 80*5;
        int milk = 105*2;
        int iceCream = 100*2;
        int eggs = 70*4;
        int breakfast = bananas+milk+iceCream+eggs;

        System.out.println("Завтрак спортсмена составляет " + breakfast + " гр или " + breakfast/1000f + " кг");
    }
}