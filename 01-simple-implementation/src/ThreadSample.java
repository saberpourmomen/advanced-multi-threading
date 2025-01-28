import java.util.concurrent.TimeUnit;

public class ThreadSample extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 50; i++) {
            System.out.println("thread run : "+i);
            try {
                TimeUnit.MILLISECONDS.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
