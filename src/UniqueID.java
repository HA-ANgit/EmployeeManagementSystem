public class UniqueID {
    private static int id = 1004;

    public static int nextID(){
        return id++;
    }
}