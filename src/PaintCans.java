public class PaintCans {
    public static void main(String[] args) {
        int classRooms = 120/(4+2);
        int whitePaint = classRooms*2;
        int brownPaint = classRooms*4;

        System.out.println("В школе, где " + classRooms + " классов, нужно " + whitePaint + " банок белой краски и " +
                brownPaint + " банок коричневой краски");
    }
}
