package pattern.thread;

/**
 * Created by yangwan on 2019/4/22
 */
public class MyThread implements Runnable{

    private Integer message;

    public MyThread(Integer message){
        this.message = message;
    }

    @Override
    public void run() {
        try{
            Thread.sleep(1000);
            System.out.println("the current thread id: " + Thread.currentThread().getId() + " the message of thread: " + this.message);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
