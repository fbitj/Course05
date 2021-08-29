package homework.q2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Method3 {

    public static void main(String[] args) {
        // 使用callable + FutrueTask
        CallableTask callableTask = new CallableTask();
        FutureTask<String> target = new FutureTask<>(callableTask);
        Thread thread = new Thread(target);
        thread.start();
        try {
            String res = target.get();
            System.out.println("res = " + res);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    static class CallableTask implements Callable<String> {

        @Override
        public String call() throws Exception {
            String res = method();
            return res;
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
    }

}
