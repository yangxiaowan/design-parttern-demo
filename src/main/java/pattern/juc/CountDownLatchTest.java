package pattern.juc;

import java.util.concurrent.CountDownLatch;

/**
 * Created by yangwan on 2019/4/30
 */
public class CountDownLatchTest {

    public static void main(String[] args) {
        try{
            int number = 10;
            CountDownLatch mainSignal = new CountDownLatch(1);
            CountDownLatch workSignal = new CountDownLatch(number);
            for(int i=0; i < number; i ++){
                Thread thread = new Thread(new WorkThread(mainSignal, workSignal));
                thread.start();
            }
            System.out.println("先执行主线程准备工作!");
            mainSignal.countDown();
            System.out.println("主线程准备工作执行完毕!");
            workSignal.await();
            System.out.println("子线程执行完毕!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
