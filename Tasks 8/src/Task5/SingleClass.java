package Task5;

public class SingleClass {
    private static SingleClass instance;

    private SingleClass(){}

    public static synchronized SingleClass getInstance(){
        if(instance == null) {
            instance = new SingleClass();
        }
        return instance;
    }
}
