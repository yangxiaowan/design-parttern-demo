package pattern.juc;

import java.util.concurrent.CountDownLatch;

/**
 * Created by yangwan on 2019/4/30
 */
public class WorkThread implements Runnable{


    private CountDownLatch mainSignal;

    private CountDownLatch workSignal;

    public WorkThread(CountDownLatch mainSignal, CountDownLatch workSignal){
        this.mainSignal = mainSignal;
        this.workSignal = workSignal;
    }

    @Override
    public void run() {
        try{
            mainSignal.await();
            System.out.println("执行子线程工作!");
            workSignal.countDown();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
