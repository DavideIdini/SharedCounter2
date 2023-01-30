public class SharedCounter {
    int counter = 0;
    boolean libero = true;


    public synchronized int waitForVaue(int n) throws InterruptedException {
       while(n != counter)
           wait();
       return n;
    }
    public synchronized void inc(){
        counter++;
        notifyAll();
    }
    public synchronized void decr(){
        counter--;
        notifyAll();
    }
}
