package treads;

public class ThreadsPractice {
    public static void main(String[] args) {
        Thread myThread = new MyThread();
        myThread.start();

         new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Other thread " + i);
                    try {
                        Thread.sleep(1300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main thread " + i);
        }

        Thread myRunnableThread = new Thread(new MyRunnableThread());
        myRunnableThread.start();
    }
}
