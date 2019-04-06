package pattern.singleton;

/**
 * 饿汉模式（静态常量）
 */
public class HungryStaticVarSingleton {

    private static HungryStaticVarSingleton SINGLETON = new HungryStaticVarSingleton();

    /**
     * 这里构造函数为私有的
     */
    private HungryStaticVarSingleton(){

    }

    public static HungryStaticVarSingleton getHungryStaticVarSingleton(){
        return SINGLETON;
    }

}
