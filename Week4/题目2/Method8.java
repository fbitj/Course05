package homework.q2;

import java.util.concurrent.Semaphore;

public class Method8 {
    static final Semaphore semaphore = new Semaphore(1);

    public static void main(String[] args) {
        // 使用Semophore实现
        Thread8 thread8 = new Thread8();
        try {
            semaphore.acquire();
            thread8.start();
            semaphore.acquire();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        String res = thread8.getRes();
        System.out.println("res = " + res);
    }

    static class Thread8 extends Thread {
        String res;

        public String getRes() {
            return res;
        }

        @Override
        public void run() {
            res = method();
            Method8.semaphore.release();
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
