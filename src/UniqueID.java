public class UniqueID {
    private static int id = 1;

    public static int nextID(){
        return id++;
    }
}