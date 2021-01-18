package level_3.lesson_5;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Car implements Runnable {
    private static int CARS_COUNT;
    private static int CARS_FINISHED;
    private static final Lock lock = new ReentrantLock();
    static {
        CARS_COUNT = 0;
        CARS_FINISHED = 0;
    }
    private Race race;
    private int speed;
    private String name;
    private final CyclicBarrier cb;
    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }
    public Car(Race race, int speed, CyclicBarrier cb) {
        this.race = race;
        this.speed = speed;
        this.cb = cb;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }
    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int)(Math.random() * 800));
            System.out.println(this.name + " готов");
            cb.await();
            cb.await();
            for (int i = 0; i < race.getStages().size(); i++) {
                race.getStages().get(i).go(this);
            }
            try {
                lock.lock();
                if (CARS_FINISHED == 0) {
                    System.out.println(this.name + " победил!");
                }
                CARS_FINISHED++;
            } finally {
                lock.unlock();
            }
            cb.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}