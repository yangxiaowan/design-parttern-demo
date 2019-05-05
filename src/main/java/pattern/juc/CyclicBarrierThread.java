package pattern.juc;

import java.util.concurrent.CyclicBarrier;

/**
 * Created by yangwan on 2019/4/30
 */
public class CyclicBarrierThread implements Runnable{

    private CyclicBarrier cyclicBarrier;

    private Integer threadId;

    public CyclicBarrierThread(Integer threadId, CyclicBarrier cyclicBarrier){
        this.threadId = threadId;
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        try{
            System.out.println("the number of waiting thread: " + cyclicBarrier.getNumberWaiting());
            cyclicBarrier.await();
            System.out.println("the running thread id: " + threadId);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
