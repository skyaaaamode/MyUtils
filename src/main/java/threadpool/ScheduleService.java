package threadpool;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


/**
 * 定时执行
 * @author zhouzf32074
 * @Classname ScheduleService
 * @Description TODO
 * @Date 2021/8/18 17:46
 */
public class ScheduleService {

    public static void test_schedule4Callable() throws Exception {
        ScheduledExecutorService service = new ScheduledThreadPoolExecutor(1);
        ScheduledFuture<String> future = service.schedule(new Callable<String>() {
            @Override
            public String call() throws Exception {
                try {
                    Thread.sleep(3000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("task finish time: " + System.currentTimeMillis());
                return "success";
            }
        }, 1000, TimeUnit.MILLISECONDS);
        System.out.println("schedule finish time: " + System.currentTimeMillis());

        System.out.println("Callable future's result is: " + future.get() +
                ", and time is: " + System.currentTimeMillis());
    }

    public static void main(String[] args) throws Exception {
        ScheduleService.test_schedule4Callable();
    }






}
