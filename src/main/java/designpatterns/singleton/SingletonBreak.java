package designpatterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonBreak {

    public static void main(String[] args) {

        DataUtils insance1 = DataUtils.getInstance();
        DataUtils instance2 = null;

        Constructor[] constructors = DataUtils.class.getDeclaredConstructors();

        for (Constructor constructor : constructors ){
            constructor.setAccessible(true);
            try {
                instance2 = (DataUtils) constructor.newInstance();
                break;
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }

        System.out.println(insance1.hashCode());
        System.out.println(instance2.hashCode());
        System.out.println(insance1 == instance2);
    }
}
