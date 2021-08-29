package homework.q2;

public class Method2 {
    static final Object lock = new Object();

    public static void main(String[] args) {
        // 通过Synchronized + sleep，可以保证成功拿到返回值
        Thread2 thread2 = new Thread2();
        thread2.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (Method2.lock) {
            String res = thread2.getRes();
            System.out.println("res = " + res);
        }
    }


    static class Thread2 extends Thread {
        String res;

        public String getRes() {
            return res;
        }

        @Override
        public void run() {
            System.out.println("1");
            synchronized (Method2.lock) {
                System.out.println("2");
                res = method();
            }
            System.out.println("3");
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
