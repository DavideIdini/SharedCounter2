public class MyThreads   {
    public static void main(String[] args) throws InterruptedException {
        SharedCounter sharedCounter = new SharedCounter();
        Thread t1 = new Thread(){
            @Override
            public void run() {
                super.run();
                sharedCounter.inc();
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                super.run();
                sharedCounter.inc();
            }
        };
        Thread t4 = new Thread(){
            @Override
            public void run() {
                super.run();
                sharedCounter.inc();
            }
        };
        Thread t3 = new Thread(){
            @Override
            public void run() {
                super.run();
                try {
                    int n = sharedCounter.waitForVaue(3);
                    System.out.println("siamo arrivati a "+ n);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t6 = new Thread(){
            @Override
            public void run() {
                super.run();
                sharedCounter.decr();
            }
        };
        Thread t7 = new Thread(){
            @Override
            public void run() {
                super.run();
                sharedCounter.decr();
            }
        };
        Thread t8 = new Thread(){
            @Override
            public void run() {
                super.run();
                sharedCounter.decr();
            }
        };
        Thread t5 = new Thread(){
            @Override
            public void run() {
                super.run();
                try {
                    int n = sharedCounter.waitForVaue(1);
                    System.out.println("siamo arrivati a "+ n);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        t6.join();
        t7.join();
        t8.join();

    }


    }

