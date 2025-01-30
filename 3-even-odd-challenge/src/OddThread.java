import java.util.concurrent.TimeUnit;

public class OddThread implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <5 ; i++) {
            System.out.println("oddThread: "+((2*i)-1));
            try {
                TimeUnit.MILLISECONDS.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("oddThread is interrupted");
                break;
            }
        }
    }
}
