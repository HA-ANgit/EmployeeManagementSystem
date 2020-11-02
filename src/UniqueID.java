public class UniqueID {
    private static int id = 8;

    public static int nextID(){
        return id++;
    }
}