package homework.q2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Method6 {

    public static void main(String[] args) {
        // 使用Condition.await 和 Condition.signalALL实现
        ReentrantLock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        Thread6 thread6 = new Thread6(lock, condition);
        lock.lock();
        try {
            thread6.start();
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        String res = thread6.getRes();
        System.out.println("res = " + res);
    }

    static class Thread6 extends Thread {
        String res;
        Lock lock;
        Condition condition;

        public Thread6(Lock lock, Condition condition) {
            this.lock = lock;
            this.condition = condition;
        }

        public String getRes() {
            return res;
        }

        @Override
        public void run() {
            lock.lock();
            try {
                res = method();
                condition.signalAll();
            } finally {
                lock.unlock();
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
