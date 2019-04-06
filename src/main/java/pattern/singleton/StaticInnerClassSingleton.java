package pattern.singleton;


/**
 * 静态内部类
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton(){
        System.out.println("静态内部类实现的单例模式");
    }

    private static class SingletonInstance{
        private static final StaticInnerClassSingleton SINGLETON = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return SingletonInstance.SINGLETON;
    }

}
