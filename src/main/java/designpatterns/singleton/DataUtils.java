package designpatterns.singleton;

public class DataUtils {

    private static DataUtils instance;

    //private constructor
    private DataUtils() {

    }

    //static method to getInstance of DataUtil
    public static DataUtils getInstance() {

        if (instance == null) {
            synchronized (DataUtils.class) {
                if (instance == null) {
                    instance = new DataUtils();
                }
            }
        }
        return instance;
    }
}
