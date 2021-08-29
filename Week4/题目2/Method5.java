package homework.q2;

import java.util.concurrent.*;

public class Method5 {
    public static void main(String[] args) {
        // 使用线程池 + Callable实现。当然使用线程池 + Runnable也可以实现
        ExecutorService executors = Executors.newFixedThreadPool(1);
        Future<String> futrue = executors.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return method();
            }

            // 一个具有返回值的方法
            private String method() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return "result";
            }
        });

        String res = null;
        try {
            res = futrue.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("res = " + res);
    }


}
