package homework.q2;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Method10 {
    static final CyclicBarrier barrier = new CyclicBarrier(2);

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        thread10.start();
        try {
            barrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
        String res = thread10.getRes();
        System.out.println("res = " + res);
    }

    static class Thread10 extends Thread {
        String res;

        public String getRes() {
            return res;
        }

        @Override
        public void run() {
            res = method();
            try {
                barrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
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
