package pattern.test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by yangwan on 2019/4/10
 */
public class VolatileTest {

    // volatile只能保证可见性不能保证原子性 其修饰的变量也不是线程安全的
    public static volatile int count = 0;

    public static AtomicInteger race = new AtomicInteger(0);

    public static  void increateAtomic(){
        race.getAndIncrement();
    }

    public  static synchronized void increase(){
        count ++;
    }

    public static void main(String[] args) throws Exception{
        Thread[] threadList = new Thread[200000];
        for(int i=0; i < 2000; i ++){
            threadList[i] = new Thread(new Runnable() {
                public void run() {
                    increateAtomic();
                }
            });
            threadList[i].start();
        }
        while(Thread.activeCount() > 2)
            Thread.yield();
        System.out.println("-------" + race);
    }

}
