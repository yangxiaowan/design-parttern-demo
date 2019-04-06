package pattern.singleton;

/**
 * 双重检查
 */
public class DoubleCheckSingleton {

    private static DoubleCheckSingleton singleton;

    private DoubleCheckSingleton(){

    }

    public static DoubleCheckSingleton getSingleton(){
        if(singleton == null){
            synchronized (DoubleCheckSingleton.class){
                if(singleton == null){
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }

}
