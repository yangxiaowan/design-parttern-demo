package pattern.thread;

import java.util.concurrent.*;

/**
 * Created by yangwan on 2019/4/22
 */
public class ThreadPool {

    public static void main(String[] args) throws Exception{
        ThreadPoolExecutor threadPoolExecutor =
                new ThreadPoolExecutor(5, 10, 1, TimeUnit.MINUTES,
                        new LinkedBlockingDeque<>(), new ThreadPoolExecutor.DiscardOldestPolicy());
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        executorService.execute(null);
        for(int i = 0; i < 20; i ++ ){
            Thread.sleep(100);
            threadPoolExecutor.execute(new MyThread(i));
        }
    }

}
