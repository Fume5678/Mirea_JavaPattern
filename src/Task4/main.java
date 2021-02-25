package Task4;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class main {
    public static void main(String[] args) throws Exception{
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for(int i = 0; i < 10; i++) {
            int finalI = i;
            Thread tr = new Thread();
            Future future = executorService.submit(new Runnable() {
                public void run() {
                    for(int j = 0; j < 10; j++){
                        try {
                            System.out.println("Async task: " + finalI + " " + j);
                            tr.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
            //System.out.println("future.get = " + future.get());
        }

    }

}
