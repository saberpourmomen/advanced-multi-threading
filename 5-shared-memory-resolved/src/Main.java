import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        StopWatch greenWatch=new StopWatch(TimeUnit.SECONDS);
        StopWatch whiteWatch=new StopWatch(TimeUnit.SECONDS);
        StopWatch yellowWatch=new StopWatch(TimeUnit.SECONDS);
        StopWatch purpleWatch=new StopWatch(TimeUnit.SECONDS);
        StopWatch redWatch=new StopWatch(TimeUnit.SECONDS);
        StopWatch bleWatch=new StopWatch(TimeUnit.SECONDS);
        StopWatch cyanWatch=new StopWatch(TimeUnit.SECONDS);
        List<Thread> threadList=new ArrayList<>();
        threadList.add(new Thread(greenWatch::countDown,ThreadColor.ANSI_GREEN.name()));
        threadList.add(new Thread(()->whiteWatch.countDown(6),ThreadColor.ANSI_WHITE.name()));
        threadList.add(new Thread(()->yellowWatch.countDown(7),ThreadColor.ANSI_YELLOW.name()));
        threadList.add(new Thread(()->purpleWatch.countDown(4),ThreadColor.ANSI_PURPLE.name()));
        threadList.add(new Thread(()->redWatch.countDown(7),ThreadColor.ANSI_RED.name()));
        threadList.add(new Thread(()->bleWatch.countDown(3),ThreadColor.ANSI_BLUE.name()));
        threadList.add(new Thread(()->cyanWatch.countDown(8),ThreadColor.ANSI_CYAN.name()));
        for (Thread th:threadList){
            th.start();
        }
    }
}