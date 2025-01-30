import java.util.concurrent.TimeUnit;

public class EvenThread extends Thread{
    @Override
    public void run(){
        for (int i = 1; i <5 ; i++) {
            System.out.println("evenThread: "+(2*i));
            try {
                TimeUnit.MILLISECONDS.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("evenThread is interrupted");
                break;
            }
        }
    }
}
