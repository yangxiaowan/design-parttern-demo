package pattern.singleton;


/**
 * 懒汉模式
 * 懒汉是指延迟加载，要使用的时候才去加载
 */
public class FullSingleton {

    private static FullSingleton singleton;

    private FullSingleton(){

    }

    /**
     * (线程不安全)
     */
    public static FullSingleton getSingleton(){
        if(singleton == null){
            singleton = new FullSingleton();
        }
        return singleton;
    }

    /**
     * 线程安全，同步方法
     */
    public static synchronized FullSingleton getSingleton2(){
        if(singleton == null){
            singleton = new FullSingleton();
        }
        return singleton;
    }

    /**
     * 线程安全，同步代码块
     */
    public static FullSingleton getSingleton3(){
        if(singleton == null){
            synchronized (FullSingleton.class){
                singleton = new FullSingleton();
            }
        }
        return singleton;
    }

}
