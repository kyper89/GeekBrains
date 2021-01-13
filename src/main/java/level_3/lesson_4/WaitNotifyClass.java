package level_3.lesson_4;

public class WaitNotifyClass {

    private final Object lock = new Object();
    private volatile char currentLetter = 'A';

    public static void main(String[] args) {

        WaitNotifyClass waitNotifyClass = new WaitNotifyClass();

        Thread t1 = new Thread(waitNotifyClass::printA);
        Thread t2 = new Thread(waitNotifyClass::printB);
        Thread t3 = new Thread(waitNotifyClass::printC);

        t1.start();
        t2.start();
        t3.start();

    }

    public void printA() {
        synchronized (lock) {
            for (int i = 0; i < 5; i++) {
                while (currentLetter != 'A') {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print("A");
                currentLetter = 'B';
                lock.notifyAll();
            }
        }
    }

    public void printB() {
        synchronized (lock) {
            for (int i = 0; i < 5; i++) {
                while (currentLetter != 'B') {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print("B");
                currentLetter = 'C';
                lock.notifyAll();
            }
        }
    }

    public void printC() {
        synchronized (lock) {
            for (int i = 0; i < 5; i++) {
                while (currentLetter != 'C') {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print("C");
                currentLetter = 'A';
                lock.notifyAll();
            }
        }
    }

}
