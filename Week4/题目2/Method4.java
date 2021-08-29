package homework.q2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Method4 {

    public static void main(String[] args) {
        // 使用Runnable + FutureTask
        RunnableTask task = new RunnableTask();
        FutureTask<String> target = new FutureTask<>(task, "success");
        Thread thread = new Thread(target);
        thread.start();
        try {
            target.get();
            String res = task.getRes();
            System.out.println("res = " + res);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }


    }

    static class RunnableTask implements Runnable {
        String res;

        public String getRes() {
            return res;
        }

        @Override
        public void run() {
            res = method();
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
