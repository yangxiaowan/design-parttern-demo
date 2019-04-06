package pattern.singleton;

/**
 * 懒汉模式(静态代码块)
 */
public class HungryStaticCodeSingleton {

    private static HungryStaticCodeSingleton singleton;

    static {
        singleton = new HungryStaticCodeSingleton();
    }

    private HungryStaticCodeSingleton(){

    }

    public static HungryStaticCodeSingleton getHungryStaticCodeSingleton(){
        return singleton;
    }


}
