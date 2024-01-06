package creational.singleton;

import java.util.concurrent.Semaphore;

public class Database {

    private static Database instance;
    private static Semaphore lock = new Semaphore(1);

    private Database() {

    }

    public static Database getInstance() {
        if (instance == null) {
            try {
                lock.acquire();
                if (instance == null) {
                    instance = new Database();
                }
                lock.release();
            } catch (InterruptedException e) {
                lock.release();
            }
        }
        return instance;
    }

}
