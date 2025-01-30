import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Thread thread=new Thread(()->{
            for (int i = 0; i < 5; i++) {
                try {
                    TimeUnit.MILLISECONDS.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"newThread");
        System.out.println("thread name : "+thread.getName()
                + "\t******\t"+ "thread id : "+thread.threadId()
                + "\t******\t"+"thread group name : "+thread.getThreadGroup()
                + "\t******\t"+"thread priority : "+thread.getPriority()
                + "\t******\t"+"thread is alive : "+(thread.isAlive()?"YES":"NO")
                + "\t******\t"+"thread is daemon : "+(thread.isDaemon()?"YES":"NO")
        );
        System.out.println("1. thread status : "+thread.getState());
        thread.start();
        System.out.println("2. thread status : "+thread.getState());
        thread.setPriority(Thread.MIN_PRIORITY);
        System.out.print("thread priority : "+thread.getPriority());
        thread.setPriority(Thread.NORM_PRIORITY);
        System.out.print("\t******\t"+"thread priority : "+thread.getPriority());
        thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("\t******\t"+"thread priority : "+thread.getPriority());
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("3. thread status : "+thread.getState());
        System.out.println("FINISHED`!");
    }

}