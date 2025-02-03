import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        CachedData data=new CachedData();
        Thread writer=new Thread(()->{
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            data.toggleFlag();
            System.out.println("flag state is : "+data.isReady());
        });
        Thread reader=new Thread(()->{
            while (!data.isReady()){
                //wait
            }
            System.out.println("flag state is : "+data.isReady());
        });

        writer.start();
        reader.start();
    }
}