package pattern.juc;

import java.util.concurrent.CyclicBarrier;

/**
 * Created by yangwan on 2019/4/30
 */
public class CyclicBarrierThreadTest {

    public static void main(String[] args) throws Exception{
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
        for(int i=1; i <= 100; i ++){
            Thread thread = new Thread(new CyclicBarrierThread(i, cyclicBarrier));
            thread.start();
            Thread.sleep(10);
        }
    }

}
