package homework.q2;

public class Method7 {
    static final Object obj = new Object();

    public static void main(String[] args) {
        // 使用Object.await + Object.notifyAll
        Thread7 thread7 = new Thread7();
        synchronized (Method7.obj) {
            thread7.start();
            try {
                Method7.obj.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String res = thread7.getRes();
        System.out.println("res = " + res);
    }

    static class Thread7 extends Thread {
        String res;

        public String getRes() {
            return res;
        }

        @Override
        public void run() {
            synchronized (Method7.obj) {
                res = method();
                Method7.obj.notifyAll();
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
