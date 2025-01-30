import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ThreadSample threadSample=new ThreadSample();
        Thread runnableSample=new Thread(new RunnableSample());
        Thread lambdaThread=new Thread(()->{
            for (int i = 0; i < 50; i++) {
                System.out.println("lambda run : "+i);
                try {
                    TimeUnit.MILLISECONDS.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        lambdaThread.start();
        runnableSample.start();
        threadSample.start();
        for (int i = 0; i < 50; i++) {
            System.out.println("main thread :"+i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
