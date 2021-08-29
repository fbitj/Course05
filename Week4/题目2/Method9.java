package homework.q2;

import java.util.concurrent.CountDownLatch;

public class Method9 {
    static final CountDownLatch latch = new CountDownLatch(1);

    public static void main(String[] args) {
        // 使用CountDownLatch实现
        Thread9 thread9 = new Thread9();
        thread9.start();
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String res = thread9.getRes();
        System.out.println("res = " + res);
    }

    static class Thread9 extends Thread {
        String res;

        public String getRes() {
            return res;
        }

        @Override
        public void run() {
            res = method();
            Method9.latch.countDown();
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
