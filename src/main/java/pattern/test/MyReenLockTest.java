package pattern.test;

import java.io.Externalizable;
import java.io.Serializable;
import java.util.Vector;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by yangwan on 2019/4/10
 */
public class MyReenLockTest extends Thread {

    // 可重入锁 用static修饰标识所有该类型线程共享该锁
    static ReentrantLock lock = new ReentrantLock();

    private String name;

    public MyReenLockTest(String name){
        this.name = name;
    }

    @Override
    public void run(){
        lock.lock();
        System.out.println(name + " : 外部获取锁！");
        innerLock();
        lock.unlock();
        System.out.println(name + " : 外部释放锁！");
    }

    public void innerLock(){
        lock.lock();
        System.out.println(name + " : 内部获取锁！");
        lock.unlock();
        System.out.println(name + " : 内部释放锁！");
    }

}
