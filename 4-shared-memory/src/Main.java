import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        StopWatch stopWatch=new StopWatch(TimeUnit.SECONDS);
        List<Thread> threadList=new ArrayList<>();
        threadList.add(new Thread(stopWatch::countDown,ThreadColor.ANSI_GREEN.name()));
        threadList.add(new Thread(()->stopWatch.countDown(6),ThreadColor.ANSI_WHITE.name()));
        threadList.add(new Thread(()->stopWatch.countDown(7),ThreadColor.ANSI_YELLOW.name()));
        threadList.add(new Thread(()->stopWatch.countDown(4),ThreadColor.ANSI_PURPLE.name()));
        threadList.add(new Thread(()->stopWatch.countDown(7),ThreadColor.ANSI_RED.name()));
        threadList.add(new Thread(()->stopWatch.countDown(3),ThreadColor.ANSI_BLUE.name()));
        threadList.add(new Thread(()->stopWatch.countDown(8),ThreadColor.ANSI_CYAN.name()));
        for (Thread th:threadList){
            th.start();
        }
    }
}