package Task5;

public class Singletone3 {
    private static Singletone3 INSTANCE;

    private Singletone3(){}

    // 1 thread
    public static synchronized Singletone3 getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Singletone3();
        }
        return INSTANCE;
    }
}
