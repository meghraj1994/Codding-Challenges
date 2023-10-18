package apreparingforinterview.singleton;

public class Singleton {

    private static Singleton instance;

    //make constructor as private
    private Singleton() {}

    public static Singleton getInstance(){
        if(instance==null){
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
