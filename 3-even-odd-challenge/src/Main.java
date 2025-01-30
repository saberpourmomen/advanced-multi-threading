import java.sql.Timestamp;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        Thread oddThread = new Thread(new OddThread());
        evenThread.start();
        oddThread.start();
        Random random=new Random(System.nanoTime());
        try {
                TimeUnit.MILLISECONDS.sleep(random.nextInt(300,900));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        evenThread.interrupt();
        try {
            TimeUnit.MILLISECONDS.sleep(random.nextInt(300,500));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        oddThread.interrupt();

    }
}