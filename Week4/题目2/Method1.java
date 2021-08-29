package homework.q2;

public class Method1 {

    public static void main(String[] args) {
        // 通过join方法实现
        Thread1 thread1 = new Thread1();
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String res = thread1.getRes();
        System.out.println("res = " + res);
    }

    static class Thread1 extends Thread {
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
